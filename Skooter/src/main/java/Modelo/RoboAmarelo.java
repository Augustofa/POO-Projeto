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
public class RoboAmarelo extends Elemento implements Serializable{
    Hero imagemHero;
    Timer timer;

    public RoboAmarelo(String sNomeImagePNG, Hero imagemHero) {
        super(sNomeImagePNG);
        this.imagemHero = imagemHero;
        this.bTransponivel = true;
        this.bMortal = true;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                buscaHero();
            }
        }, 0, 1000);
    }
    
    public void autoDesenho(){          
        super.autoDesenho();
    }
    
    public void buscaHero(){
        if(this.imagemHero.pPosicao.getLinha() > this.pPosicao.getLinha()){
            this.moveDown();
        } else if(this.imagemHero.pPosicao.getLinha() < this.pPosicao.getLinha()){
            this.moveUp();
        } else if (this.imagemHero.pPosicao.getColuna() > this.pPosicao.getColuna()) {
            this.moveRight();
        } else if (this.imagemHero.pPosicao.getColuna() < this.pPosicao.getColuna()) {
            this.moveLeft();
        }
    }   
}
