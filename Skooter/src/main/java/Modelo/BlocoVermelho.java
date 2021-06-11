package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class BlocoVermelho extends Bloco implements Serializable{
    
    public BlocoVermelho(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bDestrutivel = false;
    }

    public void autoDesenho() {
        super.autoDesenho();
    }
}
