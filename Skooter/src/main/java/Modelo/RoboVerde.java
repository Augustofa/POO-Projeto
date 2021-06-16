package Modelo;


import java.io.Serializable;

/**
 *
 * @author Junio
 */
public class RoboVerde extends Inimigo implements Serializable{

    public RoboVerde(String sNomeImagePNG) {
        super(sNomeImagePNG);
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
