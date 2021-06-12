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
public class Inimigo extends Elemento implements Serializable {
    
    public Inimigo(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bMortal = true;
    }
    
    public void checaColisao(Elemento eTemp) {
        if (!eTemp.isbTransponivel() || eTemp.isbColetavel() || eTemp.isbMortal()) {
            this.voltaAUltimaPosicao();                /*Blocos ou Itens ou Inimigos*/
        }
    }   
}
