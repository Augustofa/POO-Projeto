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
        
        // HERÓI
        Hero hHero = new Hero("skooter.png");
        hHero.setPosicao(5, 5);
        fase2.add(hHero);
        
        
        // SETAS PARA CIMA
        Seta setaCima1 = new Seta("setacima.png",'U');
        setaCima1.setPosicao(3,0);
        fase2.add(setaCima1);
        
        Seta setaCima2 = new Seta("setacima.png",'U');
        setaCima2.setPosicao(4,0);
        fase2.add(setaCima2);
        
        Seta setaCima3 = new Seta("setacima.png",'U');
        setaCima3.setPosicao(5,0);
        fase2.add(setaCima3);
        
        Seta setaCima4 = new Seta("setacima.png",'U');
        setaCima4.setPosicao(6,0);
        fase2.add(setaCima4);
        
        Seta setaCima5 = new Seta("setacima.png",'U');
        setaCima5.setPosicao(7,0);
        fase2.add(setaCima5);
        
        Seta setaCima6 = new Seta("setacima.png",'U');
        setaCima6.setPosicao(3,8);
        fase2.add(setaCima6);
        
        Seta setaCima7 = new Seta("setacima.png",'U');
        setaCima7.setPosicao(4,8);
        fase2.add(setaCima7);
        
        Seta setaCima8 = new Seta("setacima.png",'U');
        setaCima8.setPosicao(3,6);
        fase2.add(setaCima8);
        
        Seta setaCima9 = new Seta("setacima.png",'U');
        setaCima9.setPosicao(7,6);
        fase2.add(setaCima9);
        
        Seta setaCima10 = new Seta("setacima.png",'U');
        setaCima10.setPosicao(7,8);
        fase2.add(setaCima10);
        
        Seta setaCima11 = new Seta("setacima.png",'U');
        setaCima11.setPosicao(7,10);
        fase2.add(setaCima11);
        
        
        // SETAS PARA BAIXO
        Seta setaBaixo1 = new Seta("setabaixo.png",'D');
        setaBaixo1.setPosicao(3,2);
        fase2.add(setaBaixo1);
        
        Seta setaBaixo2 = new Seta("setabaixo.png",'D');
        setaBaixo2.setPosicao(7,2);
        fase2.add(setaBaixo2);
        
        Seta setaBaixo3 = new Seta("setabaixo.png",'D');
        setaBaixo3.setPosicao(3,10);
        fase2.add(setaBaixo3);
        
        Seta setaBaixo4 = new Seta("setabaixo.png",'D');
        setaBaixo4.setPosicao(3,4);
        fase2.add(setaBaixo4);
        
        Seta setaBaixo5 = new Seta("setabaixo.png",'D');
        setaBaixo5.setPosicao(7,4);
        fase2.add(setaBaixo5);
      
        
        // SETAS PARA DIREITA
        Seta setaDireita1 = new Seta("setadireita.png",'R');
        setaDireita1.setPosicao(0,3);
        fase2.add(setaDireita1);
        
        Seta setaDireita2 = new Seta("setadireita.png",'R');
        setaDireita2.setPosicao(2,3);
        fase2.add(setaDireita2);
        
        Seta setaDireita3 = new Seta("setadireita.png",'R');
        setaDireita3.setPosicao(4,3);
        fase2.add(setaDireita3);
        
        Seta setaDireita4 = new Seta("setadireita.png",'R');
        setaDireita4.setPosicao(6,3);
        fase2.add(setaDireita4);
        
        Seta setaDireita5 = new Seta("setadireita.png",'R');
        setaDireita5.setPosicao(8,3);
        fase2.add(setaDireita5);
        
        Seta setaDireita6 = new Seta("setadireita.png",'R');
        setaDireita6.setPosicao(0,7);
        fase2.add(setaDireita6);
        
        Seta setaDireita7 = new Seta("setadireita.png",'R');
        setaDireita7.setPosicao(4,7);
        fase2.add(setaDireita7);
        
        Seta setaDireita8 = new Seta("setadireita.png",'R');
        setaDireita8.setPosicao(8,7);
        fase2.add(setaDireita8);
        
        Seta setaDireita9 = new Seta("setadireita.png",'R');
        setaDireita9.setPosicao(10,7);
        fase2.add(setaDireita9);

        
        // SETAS PARA ESQUERDA
        Seta setaEsquerda1 = new Seta("setaesquerda.png",'L');
        setaEsquerda1.setPosicao(10,3);
        fase2.add(setaEsquerda1);
        
        Seta setaEsquerda2 = new Seta("setaesquerda.png",'L');
        setaEsquerda2.setPosicao(2,7);
        fase2.add(setaEsquerda2);
        
        Seta setaEsquerda3 = new Seta("setaesquerda.png",'L');
        setaEsquerda3.setPosicao(6,7);
        fase2.add(setaEsquerda3);
        
        BlocoVermelho blocoImovel1 = new BlocoVermelho("blocoTemp.png");
        blocoImovel1.setPosicao(3, 1);
        fase2.add(blocoImovel1);
        
        BlocoVermelho blocoImovel2 = new BlocoVermelho("blocoTemp.png");
        blocoImovel2.setPosicao(7, 1);
        fase2.add(blocoImovel2);
        
        BlocoVermelho blocoImovel3 = new BlocoVermelho("blocoTemp.png");
        blocoImovel3.setPosicao(3, 5);
        fase2.add(blocoImovel3);
        
        BlocoVermelho blocoImovel4 = new BlocoVermelho("blocoTemp.png");
        blocoImovel4.setPosicao(7, 5);
        fase2.add(blocoImovel4);
        
        BlocoVermelho blocoImovel5 = new BlocoVermelho("blocoTemp.png");
        blocoImovel5.setPosicao(3, 9);
        fase2.add(blocoImovel5);
        
        BlocoVermelho blocoImovel6 = new BlocoVermelho("blocoTemp.png");
        blocoImovel6.setPosicao(7, 9);
        fase2.add(blocoImovel6);
        
        BlocoVermelho blocoImovel7 = new BlocoVermelho("blocoTemp.png");
        blocoImovel7.setPosicao(1, 3);
        fase2.add(blocoImovel7);
        
        BlocoVermelho blocoImovel8 = new BlocoVermelho("blocoTemp.png");
        blocoImovel8.setPosicao(3, 3);
        fase2.add(blocoImovel8);
        
        BlocoVermelho blocoImovel9 = new BlocoVermelho("blocoTemp.png");
        blocoImovel9.setPosicao(5, 3);
        fase2.add(blocoImovel9);
        
        BlocoVermelho blocoImovel9_ = new BlocoVermelho("blocoTemp.png");
        blocoImovel9_.setPosicao(7, 3);
        fase2.add(blocoImovel9_);
        
        BlocoVermelho blocoImovel10 = new BlocoVermelho("blocoTemp.png");
        blocoImovel10.setPosicao(9, 3);
        fase2.add(blocoImovel10);
        
        BlocoVermelho blocoImovel11 = new BlocoVermelho("blocoTemp.png");
        blocoImovel11.setPosicao(1, 7);
        fase2.add(blocoImovel11);
        
        BlocoVermelho blocoImovel12 = new BlocoVermelho("blocoTemp.png");
        blocoImovel12.setPosicao(3, 7);
        fase2.add(blocoImovel12);
        
        BlocoVermelho blocoImovel13 = new BlocoVermelho("blocoTemp.png");
        blocoImovel13.setPosicao(5, 7);
        fase2.add(blocoImovel13);
        
        BlocoVermelho blocoImovel14 = new BlocoVermelho("blocoTemp.png");
        blocoImovel14.setPosicao(7, 7);
        fase2.add(blocoImovel14);
        
        BlocoVermelho blocoImovel15 = new BlocoVermelho("blocoTemp.png");
        blocoImovel15.setPosicao(9, 7);
        fase2.add(blocoImovel15);
        
        Fruta cereja = new Fruta("cereja.png");
        cereja.setPosicao(9, 5);
        fase2.add(cereja);
        
        Fruta morango = new Fruta("morango.png");
        morango.setPosicao(5, 9);
        fase2.add(morango);
        
        Fruta uva = new Fruta("uva.png");
        uva.setPosicao(1, 5);
        fase2.add(uva);
        
        Fruta limao = new Fruta("limao.png");
        limao.setPosicao(5, 1);
        fase2.add(limao);
        
        // ROBÔS
        
        RoboVerde roboVerde1 = new RoboVerde("roboVerde.png");
        roboVerde1.setPosicao(1, 1);
        fase2.add(roboVerde1);
        
        RoboVerde roboVerde2 = new RoboVerde("roboVerde.png");
        roboVerde2.setPosicao(1, 9);
        fase2.add(roboVerde2);
        
        RoboVerde roboVerde3 = new RoboVerde("roboVerde.png");
        roboVerde3.setPosicao(9, 1);
        fase2.add(roboVerde3);
        
        RoboVerde roboVerde4 = new RoboVerde("roboVerde.png");
        roboVerde4.setPosicao(9, 9);
        fase2.add(roboVerde4);
        
        return fase2;
    }
}
