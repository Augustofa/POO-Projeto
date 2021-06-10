package Controler;

import Modelo.Elemento;
import Modelo.Hero;
import Auxiliar.Posicao;
import java.util.ArrayList;
import Modelo.RoboAmarelo;

/**
 *
 *
 */
public class ControleDeJogo {
    public void desenhaTudo(ArrayList<Elemento> e){
        for(int i = 0; i < e.size(); i++){
            e.get(i).autoDesenho();
        }
    }
    
    
    public void processaTudo(ArrayList<Elemento> e){
        Elemento eTemp;
        Elemento eTemp2;
        
        for(int i = 0; i < e.size(); i++){
            eTemp = e.get(i); 
            for(int j = i+1; j < e.size(); j++){
                eTemp2 = e.get(j);
                if((j != i) && eTemp.getPosicao().estaNaMesmaPosicao(eTemp2.getPosicao())){
                    if(i == 0){
                        //Hero x Item
                        if(eTemp2.isbColetavel()){
                            e.remove(eTemp2);
                        //Hero x Inimigo
                        }else if(eTemp2.isbMortal()){
                            e.remove(eTemp);
                        //Hero x BlocoVerde
                        }else if(eTemp2.isbMovel()){
                            eTemp2.moveUp();
                        }
                    } else if(eTemp.isbColetavel()){
                        eTemp2.voltaAUltimaPosicao();
                    } else if(eTemp.isbMortal()){
                        eTemp.voltaAUltimaPosicao();
                    } else{
                        eTemp2.voltaAUltimaPosicao();
                    }
                }
            }
        }
    }

    public boolean ehPosicaoValida(ArrayList<Elemento> e, Posicao p){
        Elemento eTemp;
        /*Validacao da posicao de todos os elementos com relacao a Posicao p*/
        for(int i = 1; i < e.size(); i++){ /*Olha todos os elementos*/
            eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/
            if(!eTemp.isbTransponivel())
                if(eTemp.getPosicao().estaNaMesmaPosicao(p))
                    return false; /*A posicao p é invalida, pois ha um elemento (i-esimo eTemp) intransponivel lá*/
        }
        return true;
    }
}
