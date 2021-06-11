/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import Modelo.*;
import Controler.*;
import java.util.ArrayList;

/**
 *
 * @author Augusto
 */
public class Fases {
    static int fase = 0;
    public static void proximaFase(ArrayList<Elemento> eElementos) {
        eElementos.clear();
        fase++;
        Fases.getFase(fase, eElementos);
    }
    
    public static void getFase(int numFase, ArrayList<Elemento> arrElementos){
        if(numFase == 1)
            primeiraFase(arrElementos);
        if(numFase == 2)
            segundaFase(arrElementos);
    }
    
    private static void primeiraFase(ArrayList<Elemento> faseAtual){
        Hero hHero = new Hero("skooter.png");
        hHero.setPosicao(0, 4);
        faseAtual.add(hHero);
        
        RoboVerde roboVerde1 = new RoboVerde("roboVerde.png");
        roboVerde1.setPosicao(3, 3);
        faseAtual.add(roboVerde1);

        RoboVerde roboVerde2 = new RoboVerde("roboVerde.png");
        roboVerde2.setPosicao(6, 6);
        faseAtual.add(roboVerde2);
        
        RoboVerde roboVerde3 = new RoboVerde("roboVerde.png");
        roboVerde3.setPosicao(5, 5);
        faseAtual.add(roboVerde3);     

        RoboAmarelo roboAmarelo = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo.setPosicao(2, 9);
        faseAtual.add(roboAmarelo);

        BlocoVermelho blocoImovel = new BlocoVermelho("blocoTemp.png");
        blocoImovel.setPosicao(9, 1);
        faseAtual.add(blocoImovel);
        
        BlocoVermelho blocoImovel2 = new BlocoVermelho("blocoTemp.png");
        blocoImovel2.setPosicao(9, 2);
        faseAtual.add(blocoImovel2); 
        
        BlocoVermelho blocoImovel3 = new BlocoVermelho("blocoTemp.png");
        blocoImovel3.setPosicao(9, 3);
        faseAtual.add(blocoImovel3);
        
        Fruta cereja = new Fruta("cereja.png");
        cereja.setPosicao(9, 5);
        faseAtual.add(cereja);
        
        Fruta limao = new Fruta("limao.png");
        limao.setPosicao(8, 7);
        faseAtual.add(limao);
        
        Fruta morango = new Fruta("morango.png");
        morango.setPosicao(4, 4);
        faseAtual.add(morango);
        
        Fruta uva = new Fruta("uva.png");
        uva.setPosicao(4, 7);
        faseAtual.add(uva);
        
        BlocoVerde blocomovel1 = new BlocoVerde("blocomovel.png");
        blocomovel1.setPosicao(10, 6);
        faseAtual.add(blocomovel1); 
        
        BlocoVerde blocomovel2 = new BlocoVerde("blocomovel.png");
        blocomovel2.setPosicao(10, 5);
        faseAtual.add(blocomovel2);
    }
    
    public static void segundaFase(ArrayList<Elemento> faseAtual){
        Hero hHero = new Hero("skooter.png");
        hHero.setPosicao(0, 4);
        faseAtual.add(hHero);
        
        RoboVerde cTeste = new RoboVerde("roboVerde.png");
        cTeste.setPosicao(5, 5);
        faseAtual.add(cTeste);     

        RoboVerde roboVerde1 = new RoboVerde("roboVerde.png");
        roboVerde1.setPosicao(3, 3);
        faseAtual.add(roboVerde1);

        RoboAmarelo roboAmarelo = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo.setPosicao(2, 9);
        faseAtual.add(roboAmarelo);

        BlocoVermelho blocoImovel = new BlocoVermelho("blocoTemp.png");
        blocoImovel.setPosicao(9, 1);
        faseAtual.add(blocoImovel);
        
        BlocoVermelho blocoImovel2 = new BlocoVermelho("blocoTemp.png");
        blocoImovel2.setPosicao(9, 2);
        faseAtual.add(blocoImovel2); 
        
        BlocoVermelho blocoImovel3 = new BlocoVermelho("blocoTemp.png");
        blocoImovel3.setPosicao(9, 3);
        faseAtual.add(blocoImovel3);
        
        Fruta cereja = new Fruta("cereja.png");
        cereja.setPosicao(9, 5);
        faseAtual.add(cereja);
        
        Fruta limao = new Fruta("limao.png");
        limao.setPosicao(8, 7);
        faseAtual.add(limao);
        
        Fruta morango = new Fruta("morango.png");
        morango.setPosicao(4, 4);
        faseAtual.add(morango);
        
        Fruta uva = new Fruta("uva.png");
        uva.setPosicao(4, 7);
        faseAtual.add(uva);
        
        BlocoVerde blocoMovel1 = new BlocoVerde("blocomovel.png");
        blocoMovel1.setPosicao(10, 6);
        faseAtual.add(blocoMovel1); 
        
        BlocoVerde blocoMovel2 = new BlocoVerde("blocomovel.png");
        blocoMovel2.setPosicao(10, 5);
        faseAtual.add(blocoMovel2);
        
        BlocoVerde blocoMovel3 = new BlocoVerde("blocomovel.png");
        blocoMovel3.setPosicao(10, 4);
        faseAtual.add(blocoMovel3);
    }
}
