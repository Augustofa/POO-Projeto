/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Auxiliar.Fases;
import Modelo.Elemento;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Augusto
 */
public class Saver {
    public static void criaAutoSave(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o intervalo entre auto saves (em segundos): ");
        int intervalo = scan.nextInt();
        
        Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask(){
                public void run(){
                    Tela.getTela().salvaJogo();
                }
            }, 0, intervalo*1000);
    }
    public static void salvaJogo(){
        File save = new File("save.zip");
        if (save.exists()) {
            try {
                save.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        try {
            FileOutputStream fileStream = new FileOutputStream(save);
            GZIPOutputStream compactor = new GZIPOutputStream(fileStream);
            ObjectOutputStream objectStream = new ObjectOutputStream(compactor);
            
            objectStream.writeObject(Fases.fase);
            objectStream.writeObject(Fases.backgroundImg);
            objectStream.writeObject(Fases.transicoes);
            objectStream.writeObject(Tela.getTela().getVidas());
            
            for(Elemento el : Tela.getTela().getArrayElementos()){
                objectStream.writeObject(el);
            }

            objectStream.close();
            compactor.close();
            fileStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void loadJogo(){
        File save = new File("save.zip");
        if (!save.exists()) {
            System.out.println("Falha em carregar arquivo");
        }
        try{
            FileInputStream fileStream = new FileInputStream(save);  
            GZIPInputStream descompactor = new GZIPInputStream(fileStream);
            ObjectInputStream inputStream = new ObjectInputStream(descompactor);
            
            Fases.fase = (int) inputStream.readObject();
            Fases.backgroundImg = (String) inputStream.readObject();
            Fases.transicoes = (ArrayList<String>) inputStream.readObject();
            Tela.getTela().setVidas((int) inputStream.readObject());
            
            ArrayList<Elemento> arr = new ArrayList<>();
            try{
                while(true){
                    Tela.getTela().addElemento((Elemento) inputStream.readObject());
                }
            } catch(EOFException eof){}
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
