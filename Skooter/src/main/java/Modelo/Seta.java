/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author daniel
 */

public class Seta extends Elemento implements Serializable{

Character direcao;

public Seta(String sNomeImagePNG, Character direcao) {
    super(sNomeImagePNG);
    this.direcao = direcao;
}

public void autoDesenho() {
    super.autoDesenho();
}    
}

