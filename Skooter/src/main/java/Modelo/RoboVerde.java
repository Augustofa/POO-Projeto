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
                if(direcaoOlhar == 'L'){
                    moveRight();
                } else{
                    moveLeft();
                }
            }
        }, 0, 500);
    }
    
    public void autoDesenho(){          
        super.autoDesenho();
    }
}
