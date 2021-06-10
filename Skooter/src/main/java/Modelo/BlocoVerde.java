package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class BlocoVerde extends Elemento implements Serializable{
    
    public BlocoVerde(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = false;
        this.bDestrutivel = true;
        this.bMovel = true;
    }

    public void autoDesenho() {
        super.autoDesenho();
    }    
}
