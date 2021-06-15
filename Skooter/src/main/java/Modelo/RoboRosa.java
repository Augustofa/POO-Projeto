package Modelo;

import Auxiliar.Desenhador;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Junio
 */
public class RoboRosa extends Inimigo implements Serializable{
    Timer timer;
    Hero imagemHero;
    int direcoesTentadas  = 0;

    public RoboRosa(String sNomeImagePNG, Hero imagemHero) {
        super(sNomeImagePNG);
        this.imagemHero = imagemHero;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                movimenta();
            }
        }, 0, 1000);
    }
    
    public void autoDesenho(){          
        super.autoDesenho();
    }
    
    public void checaColisao(Elemento eTemp){
        super.checaColisao(eTemp);
    }
    
    public boolean movimenta(){
        if (imagemHero.pPosicao.getLinha() > pPosicao.getLinha() && direcoesTentadas < 1) {
            if(!moveDown()){
                direcoesTentadas = 1;
                this.movimenta();
            }
        } else if (imagemHero.pPosicao.getLinha() < pPosicao.getLinha() && direcoesTentadas < 2) {
            if(!moveUp()){
                direcoesTentadas = 2;
                this.movimenta();
            }
        } else if (imagemHero.pPosicao.getColuna() > pPosicao.getColuna() && direcoesTentadas < 3) {
            if(!moveRight()){
                direcoesTentadas = 3;
                this.movimenta();
            }
        } else if (imagemHero.pPosicao.getColuna() < pPosicao.getColuna() && direcoesTentadas < 4) {
            if(!moveLeft()){
                direcoesTentadas = 4;
                this.movimenta();
            }
        }
        direcoesTentadas = 0;
        return true;
    }
    
    @Override
    public boolean moveUp() {
        if (this.checaPosicao(this.pPosicao.getLinha() - 1, this.pPosicao.getColuna())) {
            return super.moveUp();
        } else {
            return false;
        }
    }

    @Override
    public boolean moveDown() {
        if (this.checaPosicao(this.pPosicao.getLinha() + 1, this.pPosicao.getColuna())) {
            return super.moveDown();
        } else {
            return false;
        }
    }

    @Override
    public boolean moveRight() {
        if (this.checaPosicao(this.pPosicao.getLinha(), this.pPosicao.getColuna() + 1)) {
            return super.moveRight();
        } else {
            return false;
        }
    }

    @Override
    public boolean moveLeft() {
        if (this.checaPosicao(this.pPosicao.getLinha(), this.pPosicao.getColuna() - 1)) {
            return super.moveLeft();
        } else {
            return false;
        }
    }
}