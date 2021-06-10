package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class BlocoVermelho extends Elemento implements Serializable{
    
    public BlocoVermelho(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = false;
        this.bDestrutivel = true;
    }

    public void autoDesenho() {
        super.autoDesenho();
    }    
}
