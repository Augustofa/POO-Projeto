package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Junio
 */
public class RoboAmarelo extends Inimigo implements Serializable{
    Hero imagemHero;
    Timer timer;

    public RoboAmarelo(String sNomeImagePNG, Hero imagemHero) {
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
            if(imagemHero.pPosicao.getLinha() > pPosicao.getLinha()){
                return moveDown();
            } else if(imagemHero.pPosicao.getLinha() < pPosicao.getLinha()){
                return moveUp();
            } else if (imagemHero.pPosicao.getColuna() > pPosicao.getColuna()) {
                return moveRight();
            } else if (imagemHero.pPosicao.getColuna() < pPosicao.getColuna()) {
                return moveLeft();
            }
        }else{
            contadorRandom = 0;
            if (imagemHero.pPosicao.getColuna() > pPosicao.getColuna()) {
                return moveRight();
            } else if (imagemHero.pPosicao.getColuna() < pPosicao.getColuna()) {
                return moveLeft();
            }
        }
        return false;
    }   
}
