/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Auxiliar.Desenhador;
import Controler.Tela;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author daniel
 */
public abstract class Inimigo extends Animado implements Serializable {
    int contadorRandom = 0;
    Timer timer;
    
    public Inimigo(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bMortal = true;
        
        //Cria um timer de movimento
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                movimenta();
            }
        }, 0, 1000);
    }
    
    public void checaColisao(Elemento eTemp) {
        if (eTemp != Tela.getTela().getHeroi()) {
            this.voltaAUltimaPosicao();                /*Blocos ou Itens ou Inimigos*/
        }
    }
    
    public boolean checaPosicao(int linha, int coluna) {
        for (Elemento eTemp : Tela.getTela().getArrayElementos()){
            if(eTemp != this){
                if (eTemp.pPosicao.getLinha() == linha) {
                    if (eTemp.pPosicao.getColuna() == coluna) {
                        if(eTemp == Tela.getTela().getHeroi()){
                            return true;
                        } else{
                            return false;
                        }
                    }
                }
            }
        }
        return true;
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
