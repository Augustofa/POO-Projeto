/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Auxiliar.Fases;
import Modelo.Elemento;
import Modelo.Inimigo;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Augusto
 */
public class Saver {
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
            
            for(Elemento el : Tela.getTela().getArrayElementos()){
                if(el instanceof Inimigo){
                    System.out.println("Inimigo");
                    continue;
                }
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
            
            ArrayList<Elemento> arr = new ArrayList<>();
            try{
                while(true){
                    Tela.getTela().addElemento((Elemento) inputStream.readObject());
                }
            } catch(EOFException eof){
                System.out.println("Fim de arquivo");
            }
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
