package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Junio
 */
public class Hero extends Elemento implements Serializable{
    public Hero(String sNomeImagePNG) {
        super(sNomeImagePNG);
    }
    
    public void checaColisoes(Elemento eTemp) {
        if (eTemp.isbColetavel()) {             /*Item*/
            Desenhador.getTelaDoJogo().removeElemento(eTemp);
        } else if (eTemp.isbMortal()) {         /*Inimigo*/
            //Morte do Heroi
            Desenhador.getTelaDoJogo().reiniciaFase();
        } else if (eTemp.isbMovel()) {          /*BlocoMovel*/
            Bloco blocoTemp = (Bloco) eTemp;
            blocoTemp.movimenta(this.apontaUltimaPos());
        } else if (!eTemp.isbTransponivel()) {  /*Bloco*/
            this.voltaAUltimaPosicao();
        }
    }
    
    public void destroiElemento(ArrayList<Elemento> e){
        if (this.direcaoOlhar == 'U') {
            this.destroiAux(e, this.pPosicao.getColuna(), this.pPosicao.getLinha() - 1);
        } else if (this.direcaoOlhar == 'D') {
            this.destroiAux(e, this.pPosicao.getColuna(), this.pPosicao.getLinha() + 1);
        } else if (this.direcaoOlhar == 'L') {
            this.destroiAux(e, this.pPosicao.getColuna() - 1, this.pPosicao.getLinha());
        } else if (this.direcaoOlhar == 'R') {
            this.destroiAux(e, this.pPosicao.getColuna() + 1, this.pPosicao.getLinha());
        }
    }
    
    private void destroiAux(ArrayList<Elemento> e, int xPos, int yPos){
        for(int i = 0; i < e.size(); i++){
            if(e.get(i).pPosicao.getColuna() == xPos){
                if(e.get(i).pPosicao.getLinha() == yPos){
                    if(e.get(i).isbDestrutivel()){
                        e.remove(i);
                    }
                }
            }
        }
    }
    
    public char apontaUltimaPos(){
        if(this.pPosicao.getLinhaAnterior() == this.pPosicao.getLinha()){
            if(this.pPosicao.getColuna() < this.pPosicao.getColunaAnterior()){
                return 'R';
            }else if(this.pPosicao.getColuna() > this.pPosicao.getColunaAnterior()){
                return 'L';
            }
        }else if(this.pPosicao.getColunaAnterior() == this.pPosicao.getColuna()){
            if(this.pPosicao.getLinha() < this.pPosicao.getLinhaAnterior()){
                return 'D';
            }else if(this.pPosicao.getLinha() > this.pPosicao.getLinhaAnterior()){
                return 'U';
            }
        }
        return 'M';
    }
}
