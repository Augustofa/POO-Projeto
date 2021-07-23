/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controler.Tela;
import java.io.Serializable;

/**
 *
 * @author Augusto
 */
public class Fantasma extends Inimigo implements Serializable{
    Hero imagemHero;
    int tipoMov = 0;
    public Fantasma(String sNomeImagePNG) {
        super(sNomeImagePNG);
    }
    
    public void resetaImagem(){
        this.imagemHero = Tela.getTela().getHeroi();
    }
    
    public boolean movimenta(){
        if(tipoMov == 0){
            tipoMov = 1;
            if (imagemHero.pPosicao.getColuna() > pPosicao.getColuna()) {
                return moveRight();
            } else if(imagemHero.pPosicao.getColuna() < pPosicao.getColuna()){
                return moveLeft();
            } else if(imagemHero.pPosicao.getLinha() > pPosicao.getLinha()){
                return moveDown();
            } else if(imagemHero.pPosicao.getLinha() < pPosicao.getLinha()){
                return moveUp();
            }
        } else {
            tipoMov = 0;
            if(imagemHero.pPosicao.getLinha() > pPosicao.getLinha()){
                return moveDown();
            } else if(imagemHero.pPosicao.getLinha() < pPosicao.getLinha()){
                return moveUp();
            } else if (imagemHero.pPosicao.getColuna() > pPosicao.getColuna()) {
                return moveRight();
            } else if (imagemHero.pPosicao.getColuna() < pPosicao.getColuna()) {
                return moveLeft();
            }
        }
        return false;
    }
}
