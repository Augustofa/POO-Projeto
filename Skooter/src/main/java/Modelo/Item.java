package Modelo;

import Auxiliar.Desenhador;
import java.io.Serializable;

public class Item extends Elemento implements Serializable{
    
    public Item(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = true;
        this.bColetavel = true;
    }
    
    @Override
    public void checaColisao(Elemento eTemp){
        if(eTemp != Desenhador.getTelaDoJogo().getHeroi()){
            eTemp.voltaAUltimaPosicao();
        }
    }
}