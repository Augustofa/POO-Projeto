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
        RoboAmarelo eTemp3;

        for(int i = 0; i < e.size(); i++){
            eTemp = e.get(i); 
            for(int j = 0; j < e.size(); j++){
                eTemp2 = e.get(j);
                if((j != i) && eTemp.getPosicao().estaNaMesmaPosicao(eTemp2.getPosicao())){

                    // Remove genericamente o elemento que não é o herói
                    if(eTemp.isbTransponivel() && (i == 0) && (j>= 5)){ 
                        e.remove(eTemp2);
                    }
                    // Remove o herói quando se choca com um robô
                    if(eTemp.isbTransponivel() && (i == 0) && (j < 5)){ 
                        e.remove(eTemp);
                    }
                    // Impede que o robô se choque com a parede
                    if((!eTemp.isbTransponivel()) && (!eTemp2.isbTransponivel()) && (i < 5)){
                        eTemp3 = (RoboAmarelo)(eTemp);
                        eTemp3.voltaAUltimaPosicao();
                    }
                    // Impede que o robô se choque com as frutas
                    if((!eTemp.isbTransponivel()) && (eTemp2.isbTransponivel()) && (j != 0)){
                        eTemp3 = (RoboAmarelo)(eTemp);
                        eTemp3.voltaAUltimaPosicao();
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
