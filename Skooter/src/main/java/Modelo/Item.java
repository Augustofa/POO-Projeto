package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class Item extends Elemento implements Serializable{
    
    public Item(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = true;
        this.bColetavel = true;
    }

    public void autoDesenho() {
        super.autoDesenho();
    }
    
    @Override
    public void checaColisao(Elemento eTemp){
        if(eTemp != Desenhador.getTelaDoJogo().getHeroi()){
            eTemp.voltaAUltimaPosicao();
        }
    }
}