/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import Modelo.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Augusto
 */
public class MainAuxiliar {
    public static void main(String[] args){
        File save = new File("elemento");
        if (save.exists()) {
            try {
                save.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        try {
            FileOutputStream fileStream = new FileOutputStream(save);
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            Bloco elemento = BlocoFactory.criaBloco("verde");
            
            objectStream.writeObject(elemento);

            objectStream.close();
            fileStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
