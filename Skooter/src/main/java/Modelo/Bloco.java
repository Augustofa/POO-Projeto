/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Augusto
 */
public abstract class Bloco extends Elemento implements Serializable{
    
    public Bloco(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = false;
    }

    public void autoDesenho() {
        super.autoDesenho();
    }
    
    public void empurra(char direcaoHeroi){
        if(direcaoHeroi == 'R'){
            this.moveLeft();
        } else if(direcaoHeroi == 'L'){
            this.moveRight();
        } else if(direcaoHeroi == 'U'){
            this.moveDown();
        } else if(direcaoHeroi == 'D'){
            this.moveUp();
        }
    }
    
//    @Override
//    public void voltaAUltimaPosicao(){
//        
//    }
}
