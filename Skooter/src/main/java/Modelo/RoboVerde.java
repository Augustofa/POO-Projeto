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
public class RoboVerde extends Inimigo implements Serializable{
    Timer timer;

    public RoboVerde(String sNomeImagePNG) {
        super(sNomeImagePNG);
        
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
    
    public boolean movimenta() {
        if (contadorRandom != 3) {
            contadorRandom++;
            if (direcaoOlhar == 'D') {
                return moveLeft();
            } else if (direcaoOlhar == 'L') {
                return moveUp();
            } else if (direcaoOlhar == 'U') {
                return moveRight();
            } else if (direcaoOlhar == 'R') {
                return moveDown();
            }
            return false;
        } else {
            contadorRandom = 0;
            return super.movimenta();
        }
    }
}
