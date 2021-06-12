/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Desenhador;
import java.io.Serializable;

/**
 *
 * @author daniel
 */

public class Seta extends Elemento implements Serializable{
    char direcao;

    public Seta(String sNomeImagePNG, char direcao) {
        super(sNomeImagePNG);
        this.direcao = direcao;
    }

    public void autoDesenho() {
        super.autoDesenho();
    }
    
    @Override
    public void checaColisao(Elemento eTemp){
        //Chama metodo pra movimentar o outro elemento na direcao certa
    }
}

