/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Auxiliar.Desenhador;
import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author daniel
 */
public class Inimigo extends Animado implements Serializable {
    int contadorRandom = 0;
    
    public Inimigo(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bMortal = true;
    }
    
    public void checaColisao(Elemento eTemp) {
        if (eTemp != Desenhador.getTelaDoJogo().getHeroi()) {
            this.voltaAUltimaPosicao();                /*Blocos ou Itens ou Inimigos*/
        }
    }
    
    public boolean movimenta(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
        if(randomNum == 1){
            return moveUp();
        } else if(randomNum == 2){
            return moveDown();
        } else if(randomNum == 3){
            return moveRight();
        } else if(randomNum == 4){
            return moveLeft();
        }
        return false;
    }
}
