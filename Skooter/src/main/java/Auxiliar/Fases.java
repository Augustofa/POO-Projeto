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
    
    public static void getFase(int numFase, ArrayList<Elemento> faseAtual){
        if(numFase == 1)
            faseAtual.addAll(primeiraFase());
        if(numFase == 2)
            faseAtual.addAll(segundaFase());
    }
    
    private static ArrayList<Elemento> primeiraFase(){
        ArrayList<Elemento> fase1 = new ArrayList<>();
        Hero hHero = new Hero("skooter.png");
        hHero.setPosicao(0, 4);
        fase1.add(hHero);
        
        RoboVerde roboVerde1 = new RoboVerde("roboVerde.png");
        roboVerde1.setPosicao(3, 3);
        fase1.add(roboVerde1);

        RoboVerde roboVerde2 = new RoboVerde("roboVerde.png");
        roboVerde2.setPosicao(6, 6);
        fase1.add(roboVerde2);
        
        RoboVerde roboVerde3 = new RoboVerde("roboVerde.png");
        roboVerde3.setPosicao(5, 5);
        fase1.add(roboVerde3);     

        RoboAmarelo roboAmarelo = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo.setPosicao(2, 9);
        fase1.add(roboAmarelo);

        BlocoVermelho blocoImovel = new BlocoVermelho("blocoTemp.png");
        blocoImovel.setPosicao(9, 1);
        fase1.add(blocoImovel);
        
        BlocoVermelho blocoImovel2 = new BlocoVermelho("blocoTemp.png");
        blocoImovel2.setPosicao(9, 2);
        fase1.add(blocoImovel2); 
        
        BlocoVermelho blocoImovel3 = new BlocoVermelho("blocoTemp.png");
        blocoImovel3.setPosicao(9, 3);
        fase1.add(blocoImovel3);
        
        Fruta cereja = new Fruta("cereja.png");
        cereja.setPosicao(9, 5);
        fase1.add(cereja);
        
        Fruta limao = new Fruta("limao.png");
        limao.setPosicao(8, 7);
        fase1.add(limao);
        
        Fruta morango = new Fruta("morango.png");
        morango.setPosicao(4, 4);
        fase1.add(morango);
        
        Fruta uva = new Fruta("uva.png");
        uva.setPosicao(4, 7);
        fase1.add(uva);
        
        BlocoVerde blocomovel1 = new BlocoVerde("blocomovel.png");
        blocomovel1.setPosicao(10, 6);
        fase1.add(blocomovel1); 
        
        BlocoVerde blocomovel2 = new BlocoVerde("blocomovel.png");
        blocomovel2.setPosicao(10, 5);
        fase1.add(blocomovel2);
        
        return fase1;
    }
    
    public static ArrayList<Elemento> segundaFase(){
        ArrayList<Elemento> fase2 = new ArrayList<>();
        Hero hHero = new Hero("skooter.png");
        hHero.setPosicao(0, 4);
        fase2.add(hHero);
        
        RoboVerde cTeste = new RoboVerde("roboVerde.png");
        cTeste.setPosicao(5, 5);
        fase2.add(cTeste);     

        RoboVerde roboVerde1 = new RoboVerde("roboVerde.png");
        roboVerde1.setPosicao(3, 3);
        fase2.add(roboVerde1);

        RoboAmarelo roboAmarelo = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo.setPosicao(2, 9);
        fase2.add(roboAmarelo);

        BlocoVermelho blocoImovel = new BlocoVermelho("blocoTemp.png");
        blocoImovel.setPosicao(9, 1);
        fase2.add(blocoImovel);
        
        BlocoVermelho blocoImovel2 = new BlocoVermelho("blocoTemp.png");
        blocoImovel2.setPosicao(9, 2);
        fase2.add(blocoImovel2); 
        
        BlocoVermelho blocoImovel3 = new BlocoVermelho("blocoTemp.png");
        blocoImovel3.setPosicao(9, 3);
        fase2.add(blocoImovel3);
        
        Fruta cereja = new Fruta("cereja.png");
        cereja.setPosicao(9, 5);
        fase2.add(cereja);
        
        Fruta limao = new Fruta("limao.png");
        limao.setPosicao(8, 7);
        fase2.add(limao);
        
        Fruta morango = new Fruta("morango.png");
        morango.setPosicao(4, 4);
        fase2.add(morango);
        
        Fruta uva = new Fruta("uva.png");
        uva.setPosicao(4, 7);
        fase2.add(uva);
        
        BlocoVerde blocoMovel1 = new BlocoVerde("blocomovel.png");
        blocoMovel1.setPosicao(10, 6);
        fase2.add(blocoMovel1); 
        
        BlocoVerde blocoMovel2 = new BlocoVerde("blocomovel.png");
        blocoMovel2.setPosicao(10, 5);
        fase2.add(blocoMovel2);
        
        BlocoVerde blocoMovel3 = new BlocoVerde("blocomovel.png");
        blocoMovel3.setPosicao(10, 4);
        fase2.add(blocoMovel3);
        
        return fase2;
    }
}
