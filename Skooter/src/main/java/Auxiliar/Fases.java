/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import Modelo.*;
import Controler.*;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Augusto
 */
public class Fases {
    static int fase = 0;
    public static String backgroundImg;
    public static void proximaFase(ArrayList<Elemento> eElementos) {
        eElementos.clear();
        fase++;
        Fases.getFase(fase, eElementos);
    }
    
    public static void resetaFase(ArrayList<Elemento> eElementos){
        eElementos.clear();
        Fases.getFase(fase, eElementos);
    }
    
    public static void gameOver(ArrayList<Elemento> eElementos){
        fase = 0;
        Fases.proximaFase(eElementos);
    }
    
    public static void getFase(int numFase, ArrayList<Elemento> faseAtual){
        if(numFase == 1)
            faseAtual.addAll(primeiraFase());
        if(numFase == 2)
            faseAtual.addAll(segundaFase());
        if(numFase == 3)
            faseAtual.addAll(terceiraFase());
        if(numFase == 4){
            faseAtual.addAll(quartaFase());
        }
        
    }
    
    private static ArrayList<Elemento> primeiraFase() {
        backgroundImg = "background1.png";

        ArrayList<Elemento> fase1 = new ArrayList<>();
        
        // HEROI
        Hero hHero = new Hero("skooter.png");
        hHero.setPosicao(4, 4);
        fase1.add(hHero);
        
        // ROBOS
        RoboVerde roboVerde1 = new RoboVerde("roboVerde.png");
        roboVerde1.setPosicao(10, 9);
        fase1.add(roboVerde1);

        RoboVerde roboVerde2 = new RoboVerde("roboVerde.png");
        roboVerde2.setPosicao(0, 9);
        fase1.add(roboVerde2);

        RoboVerde roboVerde3 = new RoboVerde("roboVerde.png");
        roboVerde3.setPosicao(2, 0);
        fase1.add(roboVerde3);

        RoboAmarelo roboAmarelo = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo.setPosicao(10, 1);
        fase1.add(roboAmarelo);

        // BLOCOS ESTATICOS
        BlocoVermelho blocoImovel1 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel1.setPosicao(1, 1);
        fase1.add(blocoImovel1);

        BlocoVermelho blocoImovel2 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel2.setPosicao(1, 3);
        fase1.add(blocoImovel2);

        BlocoVermelho blocoImovel3 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel3.setPosicao(1, 5);
        fase1.add(blocoImovel3);

        BlocoVermelho blocoImovel4 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel4.setPosicao(1, 7);
        fase1.add(blocoImovel4);

        BlocoVermelho blocoImovel5 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel5.setPosicao(1, 9);
        fase1.add(blocoImovel5);

        BlocoVermelho blocoImovel6 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel6.setPosicao(3, 1);
        fase1.add(blocoImovel6);

        BlocoVermelho blocoImovel7 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel7.setPosicao(3, 3);
        fase1.add(blocoImovel7);

        BlocoVermelho blocoImovel8 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel8.setPosicao(3, 5);
        fase1.add(blocoImovel8);

        BlocoVermelho blocoImovel9 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel9.setPosicao(3, 7);
        fase1.add(blocoImovel9);

        BlocoVermelho blocoImovel10 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel10.setPosicao(3, 9);
        fase1.add(blocoImovel10);

        BlocoVermelho blocoImovel11 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel11.setPosicao(5, 1);
        fase1.add(blocoImovel11);

        BlocoVermelho blocoImovel12 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel12.setPosicao(5, 3);
        fase1.add(blocoImovel12);

        BlocoVermelho blocoImovel13 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel13.setPosicao(5, 5);
        fase1.add(blocoImovel13);

        BlocoVermelho blocoImovel14 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel14.setPosicao(5, 7);
        fase1.add(blocoImovel14);

        BlocoVermelho blocoImovel15 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel15.setPosicao(5, 9);
        fase1.add(blocoImovel15);

        BlocoVermelho blocoImovel16 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel16.setPosicao(7, 1);
        fase1.add(blocoImovel16);

        BlocoVermelho blocoImovel17 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel17.setPosicao(7, 3);
        fase1.add(blocoImovel17);

        BlocoVermelho blocoImovel18 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel18.setPosicao(7, 5);
        fase1.add(blocoImovel18);

        BlocoVermelho blocoImovel19 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel19.setPosicao(7, 9);
        fase1.add(blocoImovel19);

        BlocoVermelho blocoImovel20 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel20.setPosicao(9, 1);
        fase1.add(blocoImovel20);

        BlocoVermelho blocoImovel21 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel21.setPosicao(9, 3);
        fase1.add(blocoImovel21);

        BlocoVermelho blocoImovel22 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel22.setPosicao(9, 5);
        fase1.add(blocoImovel22);

        BlocoVermelho blocoImovel23 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel23.setPosicao(9, 7);
        fase1.add(blocoImovel23);

        BlocoVermelho blocoImovel24 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel24.setPosicao(9, 9);
        fase1.add(blocoImovel24);

        BlocoVermelho blocoImovel25 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel25.setPosicao(7, 7);
        fase1.add(blocoImovel25);

        // BLOCOS MOVEIS
        BlocoVerdeMovel blocoMovel1 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel1.setPosicao(3, 0);
        fase1.add(blocoMovel1);

        BlocoVerdeMovel blocoMovel2 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel2.setPosicao(9, 0);
        fase1.add(blocoMovel2);

        BlocoVerdeMovel blocoMovel3 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel3.setPosicao(0, 1);
        fase1.add(blocoMovel3);

        BlocoVerdeMovel blocoMovel4 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel4.setPosicao(2, 1);
        fase1.add(blocoMovel4);

        BlocoVerdeMovel blocoMovel5 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel5.setPosicao(4, 1);
        fase1.add(blocoMovel5);

        BlocoVerdeMovel blocoMovel6 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel6.setPosicao(8, 3);
        fase1.add(blocoMovel6);

        BlocoVerdeMovel blocoMovel7 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel7.setPosicao(1, 2);
        fase1.add(blocoMovel7);

        BlocoVerdeMovel blocoMovel8 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel8.setPosicao(5, 2);
        fase1.add(blocoMovel8);

        BlocoVerdeMovel blocoMovel9 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel9.setPosicao(9, 2);
        fase1.add(blocoMovel9);

        BlocoVerdeMovel blocoMovel10 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel10.setPosicao(0, 5);
        fase1.add(blocoMovel10);

        BlocoVerdeMovel blocoMovel11 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel11.setPosicao(2, 5);
        fase1.add(blocoMovel11);

        BlocoVerdeMovel blocoMovel13 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel13.setPosicao(6, 5);
        fase1.add(blocoMovel13);

        BlocoVerdeMovel blocoMovel14 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel14.setPosicao(9, 6);
        fase1.add(blocoMovel14);

        BlocoVerdeMovel blocoMovel15 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel15.setPosicao(1, 10);
        fase1.add(blocoMovel15);

        BlocoVerdeMovel blocoMovel16 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel16.setPosicao(7, 10);
        fase1.add(blocoMovel16);

        BlocoVerdeMovel blocoMovel17 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel17.setPosicao(4, 9);
        fase1.add(blocoMovel17);

        BlocoVerdeMovel blocoMovel18 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel18.setPosicao(9, 8);
        fase1.add(blocoMovel18);

        BlocoVerdeMovel blocoMovel19 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel19.setPosicao(6, 7);
        fase1.add(blocoMovel19);

        BlocoVerdeMovel blocoMovel21 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel21.setPosicao(8, 9);
        fase1.add(blocoMovel21);

        BlocoVerdeMovel blocoMovel22 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel22.setPosicao(10, 7);
        fase1.add(blocoMovel22);

        BlocoVerdeMovel blocoMovel23 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel23.setPosicao(5, 6);
        fase1.add(blocoMovel23);

        BlocoVerdeMovel blocoMovel24 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel24.setPosicao(7, 8);
        fase1.add(blocoMovel24);

        BlocoVerdeMovel blocoMovel25 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel25.setPosicao(3, 8);
        fase1.add(blocoMovel25);

        BlocoVerdeMovel blocoMovel26 = new BlocoVerdeMovel("blocoVerdeMovel.png");
        blocoMovel26.setPosicao(1, 8);
        fase1.add(blocoMovel26);

        // FRUTAS
        Item cereja = new Item("cereja.png");
        cereja.setPosicao(10, 10);
        fase1.add(cereja);

        Item limao = new Item("limao.png");
        limao.setPosicao(0, 10);
        fase1.add(limao);

        Item morango = new Item("morango.png");
        morango.setPosicao(10, 0);
        fase1.add(morango);

        Item uva = new Item("uva.png");
        uva.setPosicao(0, 0);
        fase1.add(uva);

        return fase1;
    }
    
    public static ArrayList<Elemento> segundaFase() {
        backgroundImg = "background2.png";

        ArrayList<Elemento> fase2 = new ArrayList<>();
        
        // HEROI
        Hero hHero = new Hero("skooter.png");
        hHero.setPosicao(5, 5);
        fase2.add(hHero);

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

        // SETAS PARA CIMA
        Seta setaCima1 = new Seta("setacima.png", 'U');
        setaCima1.setPosicao(3, 0);
        fase2.add(setaCima1);

        Seta setaCima2 = new Seta("setacima.png", 'U');
        setaCima2.setPosicao(4, 0);
        fase2.add(setaCima2);

        Seta setaCima3 = new Seta("setacima.png", 'U');
        setaCima3.setPosicao(5, 0);
        fase2.add(setaCima3);

        Seta setaCima4 = new Seta("setacima.png", 'U');
        setaCima4.setPosicao(6, 0);
        fase2.add(setaCima4);

        Seta setaCima5 = new Seta("setacima.png", 'U');
        setaCima5.setPosicao(7, 0);
        fase2.add(setaCima5);

        Seta setaCima6 = new Seta("setacima.png", 'U');
        setaCima6.setPosicao(3, 8);
        fase2.add(setaCima6);

        Seta setaCima7 = new Seta("setacima.png", 'U');
        setaCima7.setPosicao(4, 8);
        fase2.add(setaCima7);

        Seta setaCima8 = new Seta("setacima.png", 'U');
        setaCima8.setPosicao(3, 6);
        fase2.add(setaCima8);

        Seta setaCima9 = new Seta("setacima.png", 'U');
        setaCima9.setPosicao(7, 6);
        fase2.add(setaCima9);

        Seta setaCima10 = new Seta("setacima.png", 'U');
        setaCima10.setPosicao(7, 8);
        fase2.add(setaCima10);

        Seta setaCima11 = new Seta("setacima.png", 'U');
        setaCima11.setPosicao(7, 10);
        fase2.add(setaCima11);

        // SETAS PARA BAIXO
        Seta setaBaixo1 = new Seta("setabaixo.png", 'D');
        setaBaixo1.setPosicao(3, 2);
        fase2.add(setaBaixo1);

        Seta setaBaixo2 = new Seta("setabaixo.png", 'D');
        setaBaixo2.setPosicao(7, 2);
        fase2.add(setaBaixo2);

        Seta setaBaixo3 = new Seta("setabaixo.png", 'D');
        setaBaixo3.setPosicao(3, 10);
        fase2.add(setaBaixo3);

        Seta setaBaixo4 = new Seta("setabaixo.png", 'D');
        setaBaixo4.setPosicao(3, 4);
        fase2.add(setaBaixo4);

        Seta setaBaixo5 = new Seta("setabaixo.png", 'D');
        setaBaixo5.setPosicao(7, 4);
        fase2.add(setaBaixo5);

        Seta setaBaixo6 = new Seta("setabaixo.png", 'D');
        setaBaixo6.setPosicao(2, 4);
        fase2.add(setaBaixo6);

        // SETAS PARA DIREITA
        Seta setaDireita1 = new Seta("setadireita.png", 'R');
        setaDireita1.setPosicao(0, 3);
        fase2.add(setaDireita1);

        Seta setaDireita2 = new Seta("setadireita.png", 'R');
        setaDireita2.setPosicao(2, 3);
        fase2.add(setaDireita2);

        Seta setaDireita3 = new Seta("setadireita.png", 'R');
        setaDireita3.setPosicao(4, 3);
        fase2.add(setaDireita3);

        Seta setaDireita4 = new Seta("setadireita.png", 'R');
        setaDireita4.setPosicao(6, 3);
        fase2.add(setaDireita4);

        Seta setaDireita5 = new Seta("setadireita.png", 'R');
        setaDireita5.setPosicao(8, 3);
        fase2.add(setaDireita5);

        Seta setaDireita6 = new Seta("setadireita.png", 'R');
        setaDireita6.setPosicao(0, 7);
        fase2.add(setaDireita6);

        Seta setaDireita7 = new Seta("setadireita.png", 'R');
        setaDireita7.setPosicao(4, 7);
        fase2.add(setaDireita7);

        Seta setaDireita8 = new Seta("setadireita.png", 'R');
        setaDireita8.setPosicao(8, 7);
        fase2.add(setaDireita8);

        Seta setaDireita9 = new Seta("setadireita.png", 'R');
        setaDireita9.setPosicao(10, 7);
        fase2.add(setaDireita9);

        // SETAS PARA ESQUERDA
        Seta setaEsquerda1 = new Seta("setaesquerda.png", 'L');
        setaEsquerda1.setPosicao(10, 3);
        fase2.add(setaEsquerda1);

        Seta setaEsquerda2 = new Seta("setaesquerda.png", 'L');
        setaEsquerda2.setPosicao(2, 7);
        fase2.add(setaEsquerda2);

        Seta setaEsquerda3 = new Seta("setaesquerda.png", 'L');
        setaEsquerda3.setPosicao(6, 7);
        fase2.add(setaEsquerda3);

        Seta setaEsquerda4 = new Seta("setaesquerda.png", 'L');
        setaEsquerda4.setPosicao(4, 9);
        fase2.add(setaEsquerda4);

        Seta setaEsquerda5 = new Seta("setaesquerda.png", 'L');
        setaEsquerda5.setPosicao(4, 10);
        fase2.add(setaEsquerda5);

        Seta setaEsquerda6 = new Seta("setaesquerda.png", 'L');
        setaEsquerda6.setPosicao(2, 5);
        fase2.add(setaEsquerda6);

        Seta setaEsquerda7 = new Seta("setaesquerda.png", 'L');
        setaEsquerda7.setPosicao(2, 6);
        fase2.add(setaEsquerda7);
        
        // BLOCOS ESTATICOS
        BlocoVermelho blocoImovel1 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel1.setPosicao(3, 1);
        fase2.add(blocoImovel1);

        BlocoVermelho blocoImovel2 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel2.setPosicao(7, 1);
        fase2.add(blocoImovel2);

        BlocoVermelho blocoImovel3 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel3.setPosicao(3, 5);
        fase2.add(blocoImovel3);

        BlocoVermelho blocoImovel4 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel4.setPosicao(7, 5);
        fase2.add(blocoImovel4);

        BlocoVermelho blocoImovel5 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel5.setPosicao(3, 9);
        fase2.add(blocoImovel5);

        BlocoVermelho blocoImovel6 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel6.setPosicao(7, 9);
        fase2.add(blocoImovel6);

        BlocoVermelho blocoImovel7 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel7.setPosicao(1, 3);
        fase2.add(blocoImovel7);

        BlocoVermelho blocoImovel8 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel8.setPosicao(3, 3);
        fase2.add(blocoImovel8);

        BlocoVermelho blocoImovel9 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel9.setPosicao(5, 3);
        fase2.add(blocoImovel9);

        BlocoVermelho blocoImovel9_ = new BlocoVermelho("blocoVermelho.png");
        blocoImovel9_.setPosicao(7, 3);
        fase2.add(blocoImovel9_);

        BlocoVermelho blocoImovel10 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel10.setPosicao(9, 3);
        fase2.add(blocoImovel10);

        BlocoVermelho blocoImovel11 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel11.setPosicao(1, 7);
        fase2.add(blocoImovel11);

        BlocoVermelho blocoImovel12 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel12.setPosicao(3, 7);
        fase2.add(blocoImovel12);

        BlocoVermelho blocoImovel13 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel13.setPosicao(5, 7);
        fase2.add(blocoImovel13);

        BlocoVermelho blocoImovel14 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel14.setPosicao(7, 7);
        fase2.add(blocoImovel14);

        BlocoVermelho blocoImovel15 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel15.setPosicao(9, 7);
        fase2.add(blocoImovel15);

        // FRUTAS
        Item cereja = new Item("cereja.png");
        cereja.setPosicao(9, 5);
        fase2.add(cereja);

        Item morango = new Item("morango.png");
        morango.setPosicao(5, 9);
        fase2.add(morango);

        Item uva = new Item("uva.png");
        uva.setPosicao(1, 5);
        fase2.add(uva);

        Item limao = new Item("limao.png");
        limao.setPosicao(5, 1);
        fase2.add(limao);

        return fase2;
    }

    public static ArrayList<Elemento> terceiraFase() {
        backgroundImg = "background2.png";
        
        ArrayList<Elemento> fase3 = new ArrayList<>();
        
        // HERÓI
        Hero hHero = new Hero("skooter.png");
        hHero.setPosicao(5, 5);
        fase3.add(hHero);
        
        // BLOCOS VERMELHOS MÓVEIS
        BlocoVermelhoMovel bvm1 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm1.setPosicao(1, 1);
        fase3.add(bvm1);
        
        BlocoVermelhoMovel bvm2 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm2.setPosicao(1, 2);
        fase3.add(bvm2);
        
        BlocoVermelhoMovel bvm3 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm3.setPosicao(1, 3);
        fase3.add(bvm3);
        
        BlocoVermelhoMovel bvm4 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm4.setPosicao(1, 4);
        fase3.add(bvm4);
        
        BlocoVermelhoMovel bvm5 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm5.setPosicao(1, 5);
        fase3.add(bvm5);
        
        BlocoVermelhoMovel bvm6 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm6.setPosicao(1, 6);
        fase3.add(bvm6);
        
        BlocoVermelhoMovel bvm7 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm7.setPosicao(1, 7);
        fase3.add(bvm7);
        
        BlocoVermelhoMovel bvm8 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm8.setPosicao(1, 8);
        fase3.add(bvm8);
        
        BlocoVermelhoMovel bvm9 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm9.setPosicao(1, 9);
        fase3.add(bvm9);
        
        BlocoVermelhoMovel bvm10 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm10.setPosicao(2, 1);
        fase3.add(bvm10);
        
        BlocoVermelhoMovel bvm11 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm11.setPosicao(2, 1);
        fase3.add(bvm11);
        
        BlocoVermelhoMovel bvm12 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm12.setPosicao(3, 1);
        fase3.add(bvm12);
        
        BlocoVermelhoMovel bvm13 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm13.setPosicao(4, 1);
        fase3.add(bvm13);
        
        BlocoVermelhoMovel bvm14 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm14.setPosicao(5, 1);
        fase3.add(bvm14);
        
        BlocoVermelhoMovel bvm15 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm15.setPosicao(6, 1);
        fase3.add(bvm15);
        
        BlocoVermelhoMovel bvm16 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm16.setPosicao(7, 1);
        fase3.add(bvm16);
        
        BlocoVermelhoMovel bvm17 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm17.setPosicao(8, 1);
        fase3.add(bvm17);
        
        BlocoVermelhoMovel bvm18 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm18.setPosicao(9, 1);
        fase3.add(bvm18);
        
        BlocoVermelhoMovel bvm19 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm19.setPosicao(9, 2);
        fase3.add(bvm19);
        
        BlocoVermelhoMovel bvm20 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm20.setPosicao(9, 3);
        fase3.add(bvm20);
        
        BlocoVermelhoMovel bvm21 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm21.setPosicao(9, 4);
        fase3.add(bvm21);
        
        BlocoVermelhoMovel bvm22 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm22.setPosicao(9, 5);
        fase3.add(bvm22);
        
        BlocoVermelhoMovel bvm23 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm23.setPosicao(9, 6);
        fase3.add(bvm23);
        
        BlocoVermelhoMovel bvm24 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm24.setPosicao(9, 7);
        fase3.add(bvm24);
        
        BlocoVermelhoMovel bvm25 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm25.setPosicao(9, 8);
        fase3.add(bvm25);
        
        BlocoVermelhoMovel bvm26 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm26.setPosicao(9, 9);
        fase3.add(bvm26);
        
        BlocoVermelhoMovel bvm27 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm27.setPosicao(1, 9);
        fase3.add(bvm27);
        
        BlocoVermelhoMovel bvm28 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm28.setPosicao(2, 9);
        fase3.add(bvm28);
        
        BlocoVermelhoMovel bvm29 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm29.setPosicao(3, 9);
        fase3.add(bvm29);
        
        BlocoVermelhoMovel bvm30 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm30.setPosicao(4, 9);
        fase3.add(bvm30);
        
        BlocoVermelhoMovel bvm31 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm31.setPosicao(5, 9);
        fase3.add(bvm31);
        
        BlocoVermelhoMovel bvm32 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm32.setPosicao(6, 9);
        fase3.add(bvm32);
        
        BlocoVermelhoMovel bvm33 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm33.setPosicao(7, 9);
        fase3.add(bvm33);
        
        BlocoVermelhoMovel bvm34 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm34.setPosicao(8, 9);
        fase3.add(bvm34);
        
        BlocoVermelhoMovel bvm35 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm35.setPosicao(3, 3);
        fase3.add(bvm35);
        
        BlocoVermelhoMovel bvm36 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm36.setPosicao(3, 4);
        fase3.add(bvm36);
        
        BlocoVermelhoMovel bvm37 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm37.setPosicao(3, 5);
        fase3.add(bvm37);
        
        BlocoVermelhoMovel bvm38 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm38.setPosicao(3, 6);
        fase3.add(bvm38);
        
        BlocoVermelhoMovel bvm39 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm39.setPosicao(3, 7);
        fase3.add(bvm39);
                
        BlocoVermelhoMovel bvm40 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm40.setPosicao(4, 7);
        fase3.add(bvm40);
        
        BlocoVermelhoMovel bvm41 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm41.setPosicao(5, 7);
        fase3.add(bvm41);
        
        BlocoVermelhoMovel bvm42 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm42.setPosicao(6, 7);
        fase3.add(bvm42);
        
        BlocoVermelhoMovel bvm43 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm43.setPosicao(7, 7);
        fase3.add(bvm43);
        
        BlocoVermelhoMovel bvm44 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm44.setPosicao(7, 6);
        fase3.add(bvm44);
        
        BlocoVermelhoMovel bvm45 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm45.setPosicao(7, 5);
        fase3.add(bvm45);
        
        BlocoVermelhoMovel bvm46 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm46.setPosicao(7, 4);
        fase3.add(bvm46);
        
        BlocoVermelhoMovel bvm47 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm47.setPosicao(7, 3);
        fase3.add(bvm47);
        
        BlocoVermelhoMovel bvm48 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm48.setPosicao(6, 3);
        fase3.add(bvm48);
        
        BlocoVermelhoMovel bvm49 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm49.setPosicao(5, 3);
        fase3.add(bvm49);
        
        BlocoVermelhoMovel bvm50 = new BlocoVermelhoMovel("blocovermelhomovel.png");
        bvm50.setPosicao(4, 3);
        fase3.add(bvm50);
        
        Item bvm51 = new Item("lampada.png");
        bvm51.setPosicao(5, 8);
        fase3.add(bvm51);
        
        Item bvm52 = new Item("lanterna.png");
        bvm52.setPosicao(5, 10);
        fase3.add(bvm52);
        
        Item bvm53 = new Item("sol.png");
        bvm53.setPosicao(5, 0);
        fase3.add(bvm53);
        
        Item bvm54 = new Item("vela.png");
        bvm54.setPosicao(5, 2);
        fase3.add(bvm54);
        
        return fase3;
    }

    public static ArrayList<Elemento> quartaFase() {
        backgroundImg = "background2.png";
        
        ArrayList<Elemento> quartaFase = new ArrayList<>();
        
        Hero hHero = new Hero("skooter.png");
        hHero.setPosicao(4, 5);
        quartaFase.add(hHero);

        BlocoVermelho blocoImovel1 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel1.setPosicao(1, 0);
        quartaFase.add(blocoImovel1);
        
        BlocoVermelho blocoImovel2 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel2.setPosicao(7, 0);
        quartaFase.add(blocoImovel2);

        BlocoVermelho blocoImovel3 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel3.setPosicao(8, 1);
        quartaFase.add(blocoImovel3);
        
        BlocoVermelho blocoImovel4 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel4.setPosicao(10, 1);
        quartaFase.add(blocoImovel4);

        BlocoVermelho blocoImovel5 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel5.setPosicao(3, 2);
        quartaFase.add(blocoImovel5);
        
        BlocoVermelho blocoImovel6 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel6.setPosicao(5, 2);
        quartaFase.add(blocoImovel6);

        BlocoVermelho blocoImovel7 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel7.setPosicao(0, 3);
        quartaFase.add(blocoImovel7);
        
        BlocoVermelho blocoImovel8 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel8.setPosicao(6, 3);
        quartaFase.add(blocoImovel8);

        BlocoVermelho blocoImovel9 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel9.setPosicao(2, 5);
        quartaFase.add(blocoImovel9);
        
        BlocoVermelho blocoImovel10 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel10.setPosicao(0, 7);
        quartaFase.add(blocoImovel10);

        BlocoVermelho blocoImovel11 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel11.setPosicao(8, 7);
        quartaFase.add(blocoImovel11);
        
        BlocoVermelho blocoImovel12 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel12.setPosicao(1, 8);
        quartaFase.add(blocoImovel12);

        BlocoVermelho blocoImovel13 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel13.setPosicao(5, 8);
        quartaFase.add(blocoImovel13);
        
        BlocoVermelho blocoImovel14 = new BlocoVermelho("blocoVermelho.png");
        blocoImovel14.setPosicao(3, 10);
        quartaFase.add(blocoImovel14);
        
        BlocoVerde blocoVerde1 = new BlocoVerde("blocoverde.png");
        blocoVerde1.setPosicao(1, 1);
        quartaFase.add(blocoVerde1);
        
        BlocoVerde blocoVerde2 = new BlocoVerde("blocoverde.png");
        blocoVerde2.setPosicao(3, 1);
        quartaFase.add(blocoVerde2);

        BlocoVerde blocoVerde3 = new BlocoVerde("blocoverde.png");
        blocoVerde3.setPosicao(5, 1);
        quartaFase.add(blocoVerde3);

        BlocoVerde blocoVerde4 = new BlocoVerde("blocoverde.png");
        blocoVerde4.setPosicao(7, 1);
        quartaFase.add(blocoVerde4);

        BlocoVerde blocoVerde5 = new BlocoVerde("blocoverde.png");
        blocoVerde5.setPosicao(9, 1);
        quartaFase.add(blocoVerde5);

        BlocoVerde blocoVerde6 = new BlocoVerde("blocoverde.png");
        blocoVerde6.setPosicao(2,2 );
        quartaFase.add(blocoVerde6);

        BlocoVerde blocoVerde7 = new BlocoVerde("blocoverde.png");
        blocoVerde7.setPosicao(4, 2);
        quartaFase.add(blocoVerde7);

        BlocoVerde blocoVerde8 = new BlocoVerde("blocoverde.png");
        blocoVerde8.setPosicao(6, 2);
        quartaFase.add(blocoVerde8);

        BlocoVerde blocoVerde9 = new BlocoVerde("blocoverde.png");
        blocoVerde9.setPosicao(8, 2);
        quartaFase.add(blocoVerde9);

        BlocoVerde blocoVerde10 = new BlocoVerde("blocoverde.png");
        blocoVerde10.setPosicao(1, 3);
        quartaFase.add(blocoVerde10);

        BlocoVerde blocoVerde11 = new BlocoVerde("blocoverde.png");
        blocoVerde11.setPosicao(3, 3);
        quartaFase.add(blocoVerde11);

        BlocoVerde blocoVerde12 = new BlocoVerde("blocoverde.png");
        blocoVerde12.setPosicao(5, 3);
        quartaFase.add(blocoVerde12);

        BlocoVerde blocoVerde13 = new BlocoVerde("blocoverde.png");
        blocoVerde13.setPosicao(7, 3);
        quartaFase.add(blocoVerde13);

        BlocoVerde blocoVerde14 = new BlocoVerde("blocoverde.png");
        blocoVerde14.setPosicao(9, 3);
        quartaFase.add(blocoVerde14);

        BlocoVerde blocoVerde15 = new BlocoVerde("blocoverde.png");
        blocoVerde15.setPosicao(2, 4);
        quartaFase.add(blocoVerde15);

        BlocoVerde blocoVerde16 = new BlocoVerde("blocoverde.png");
        blocoVerde16.setPosicao(4, 4);
        quartaFase.add(blocoVerde16);

        BlocoVerde blocoVerde17 = new BlocoVerde("blocoverde.png");
        blocoVerde17.setPosicao(6, 4);
        quartaFase.add(blocoVerde17);

        BlocoVerde blocoVerde18 = new BlocoVerde("blocoverde.png");
        blocoVerde18.setPosicao(8, 4);
        quartaFase.add(blocoVerde18);

        BlocoVerde blocoVerde19 = new BlocoVerde("blocoverde.png");
        blocoVerde19.setPosicao(1, 5);
        quartaFase.add(blocoVerde19);

        BlocoVerde blocoVerde20 = new BlocoVerde("blocoverde.png");
        blocoVerde20.setPosicao(3, 5);
        quartaFase.add(blocoVerde20);

        BlocoVerde blocoVerde21 = new BlocoVerde("blocoverde.png");
        blocoVerde21.setPosicao(5, 5);
        quartaFase.add(blocoVerde21);

        BlocoVerde blocoVerde22 = new BlocoVerde("blocoverde.png");
        blocoVerde22.setPosicao(7, 5);
        quartaFase.add(blocoVerde22);
        
        BlocoVerde blocoVerde22_ = new BlocoVerde("blocoverde.png");
        blocoVerde22_.setPosicao(9, 5);
        quartaFase.add(blocoVerde22_);

        BlocoVerde blocoVerde23 = new BlocoVerde("blocoverde.png");
        blocoVerde23.setPosicao(2, 6);
        quartaFase.add(blocoVerde23);

        BlocoVerde blocoVerde24 = new BlocoVerde("blocoverde.png");
        blocoVerde24.setPosicao(4, 6);
        quartaFase.add(blocoVerde24);

        BlocoVerde blocoVerde25 = new BlocoVerde("blocoverde.png");
        blocoVerde25.setPosicao(6, 6);
        quartaFase.add(blocoVerde25);

        BlocoVerde blocoVerde26 = new BlocoVerde("blocoverde.png");
        blocoVerde26.setPosicao(8, 6);
        quartaFase.add(blocoVerde26);

        BlocoVerde blocoVerde27 = new BlocoVerde("blocoverde.png");
        blocoVerde27.setPosicao(1, 7);
        quartaFase.add(blocoVerde27);

        BlocoVerde blocoVerde28 = new BlocoVerde("blocoverde.png");
        blocoVerde28.setPosicao(3, 7);
        quartaFase.add(blocoVerde28);

        BlocoVerde blocoVerde29 = new BlocoVerde("blocoverde.png");
        blocoVerde29.setPosicao(5, 7);
        quartaFase.add(blocoVerde29);

        BlocoVerde blocoVerde30 = new BlocoVerde("blocoverde.png");
        blocoVerde30.setPosicao(7, 7);
        quartaFase.add(blocoVerde30);

        BlocoVerde blocoVerde31 = new BlocoVerde("blocoverde.png");
        blocoVerde31.setPosicao(9, 7);
        quartaFase.add(blocoVerde31);

        BlocoVerde blocoVerde32 = new BlocoVerde("blocoverde.png");
        blocoVerde32.setPosicao(2, 8);
        quartaFase.add(blocoVerde32);

        BlocoVerde blocoVerde33 = new BlocoVerde("blocoverde.png");
        blocoVerde33.setPosicao(4, 8);
        quartaFase.add(blocoVerde33);

        BlocoVerde blocoVerde34 = new BlocoVerde("blocoverde.png");
        blocoVerde34.setPosicao(6, 8);
        quartaFase.add(blocoVerde34);

        BlocoVerde blocoVerde35 = new BlocoVerde("blocoverde.png");
        blocoVerde35.setPosicao(8, 8);
        quartaFase.add(blocoVerde35);

        BlocoVerde blocoVerde36 = new BlocoVerde("blocoverde.png");
        blocoVerde36.setPosicao(1, 9);
        quartaFase.add(blocoVerde36);

        BlocoVerde blocoVerde37 = new BlocoVerde("blocoverde.png");
        blocoVerde37.setPosicao(3, 9);
        quartaFase.add(blocoVerde37);

        BlocoVerde blocoVerde38 = new BlocoVerde("blocoverde.png");
        blocoVerde38.setPosicao(5, 9);
        quartaFase.add(blocoVerde38);

        BlocoVerde blocoVerde39 = new BlocoVerde("blocoverde.png");
        blocoVerde39.setPosicao(7, 9);
        quartaFase.add(blocoVerde39);

        BlocoVerde blocoVerde40 = new BlocoVerde("blocoverde.png");
        blocoVerde40.setPosicao(9, 9);
        quartaFase.add(blocoVerde40);

        BlocoVermelho blocoVermelhofim = new BlocoVermelho("blocoVermelho.png");
        blocoVermelhofim.setPosicao(8, 10);
        quartaFase.add(blocoVermelhofim);
        
        Item sol = new Item("sol.png");
        sol.setPosicao(0, 0);
        quartaFase.add(sol);
        
        Item lampada = new Item("lampada.png");
        lampada.setPosicao(0, 10);
        quartaFase.add(lampada);
        
        Item lanterna = new Item("lanterna.png");
        lanterna.setPosicao(10, 10);
        quartaFase.add(lanterna);
        
        Item vela = new Item("vela.png");
        vela.setPosicao(10, 0);
        quartaFase.add(vela);

        RoboAmarelo roboAmarelo1 = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo1.setPosicao(5,0);
        quartaFase.add(roboAmarelo1);

        RoboAmarelo roboAmarelo2 = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo2.setPosicao(5, 10);
        quartaFase.add(roboAmarelo2);

        RoboAmarelo roboAmarelo3 = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo3.setPosicao(0, 5);
        quartaFase.add(roboAmarelo3);

        RoboAmarelo roboAmarelo4 = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo4.setPosicao(10, 5);
        quartaFase.add(roboAmarelo4);

        return quartaFase;
    }
}
