package Modelo;

import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Junio
 */
public class RoboAzul extends Inimigo implements Serializable{
    Hero imagemHero;
    Timer timer;

    public RoboAzul(String sNomeImagePNG, Hero imagemHero) {
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
        if(contadorRandom != 3){
            contadorRandom++;
            if (imagemHero.pPosicao.getColuna() > pPosicao.getColuna()) {
                return moveRight();
            } else if(imagemHero.pPosicao.getColuna() < pPosicao.getColuna()){
                return moveLeft();
            } else if(imagemHero.pPosicao.getLinha() > pPosicao.getLinha()){
                return moveDown();
            } else if(imagemHero.pPosicao.getLinha() < pPosicao.getLinha()){
                return moveUp();
            }
        }else{
            contadorRandom = 0;
            if(imagemHero.pPosicao.getLinha() > pPosicao.getLinha()){
                return moveDown();
            } else if(imagemHero.pPosicao.getLinha() < pPosicao.getLinha()){
                return moveUp();
            }
        }
        return false;
    }   
}
