/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import Auxiliar.Desenhador;

/**
 *
 * @author Augusto
 */
public abstract class Bloco extends Elemento implements Serializable{
    protected Bloco(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = false;
    }

    public void autoDesenho() {
        super.autoDesenho();
    }
    
    public void checaColisoes(Elemento eTemp){
        if (this.isbMovel()) {      /*Bloco Movel x Varias Coisas*/
            /*if(eTemp == Desenhador.getTelaDoJogo().getHeroi()){
                eTemp.voltaAUltimaPosicao();
            } else*/ if(!eTemp.isbTransponivel() || eTemp.isbColetavel()) { /*Blocos ou Itens*/
                this.voltaAUltimaPosicao();
            } else if (this.isbMortal()) {  /*Inimigo*/
                eTemp.voltaAUltimaPosicao();
            }
        } else {        /*BlocoImovel x Qualquer Coisa*/
            eTemp.voltaAUltimaPosicao();
        }
    }
    
    public void movimenta(char direcaoHeroi){
        if(direcaoHeroi == 'R'){
            this.moveLeft();
        } else if(direcaoHeroi == 'L'){
            this.moveRight();
        } else if(direcaoHeroi == 'U'){
            this.moveDown();
        } else if(direcaoHeroi == 'D'){
            this.moveUp();
        }
        if(Desenhador.getTelaDoJogo().checaPosicao(this.pPosicao.getLinha(), this.pPosicao.getColuna())){
            Desenhador.getTelaDoJogo().getHeroi().voltaAUltimaPosicao();
//            this.checaColisoes(Desenhador.getTelaDoJogo().getHeroi());
        }
    }
    
    public void checaMovimentos(){
        
    }
}
