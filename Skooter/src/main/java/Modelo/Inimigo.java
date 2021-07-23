/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Auxiliar.Consts;
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
    Hero imagemHero;
    int contadorRandom = 0;
    long framesContados = -10;
    
    public Inimigo(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bMortal = true;
    }
    
    @Override
    public void autoDesenho(){
        super.autoDesenho();
        if(!Tela.getTela().getLoading()){
            if(framesContados >= 10){
                /*Padrão de design Command é implementado:
                O timer não sabe qual método movimenta() será chamado, como
                todos os tipos de robôs possuem ele, será decidido com base
                na classe em que o timer estará durante a execução*/
                movimenta();
                framesContados = 0;
            } else{
                framesContados++;
            }
        }
    }
    
    public void checaColisao(Elemento eTemp) {
        if(eTemp instanceof Fantasma)
            return;
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
