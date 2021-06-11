package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class BlocoVerde extends Bloco implements Serializable{
    
    public BlocoVerde(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bDestrutivel = true;
    }

    public void autoDesenho() {
        super.autoDesenho();
    } 
}
