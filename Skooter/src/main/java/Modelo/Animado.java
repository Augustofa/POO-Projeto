/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author Augusto
 */
public abstract class Animado extends Elemento{
    protected ImageIcon iImageU;
    protected ImageIcon iImageD;
    protected ImageIcon iImageL;
    protected ImageIcon iImageR;
    public Animado(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bAnimado = true;
        
        try {
            //Imagem olhando pra cima
            iImageU = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
            Image img = iImageU.getImage();
            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            iImageU = new ImageIcon(bi);
            
            //Imagem olhando pra baixo
            iImageD = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
            img = iImageD.getImage();
            bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            iImageD = new ImageIcon(bi);
            
            //Imagem olhando pra esquerda
            iImageL = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
            img = iImageL.getImage();
            bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            iImageL = new ImageIcon(bi);
            
            //Imagem olhando pra direita
            iImageR = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
            img = iImageR.getImage();
            bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            iImageR = new ImageIcon(bi);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public void autoDesenho(){
        if(this.getDirecaoOlhar() == 'U'){
            Desenhador.desenhar(this.iImageU, pPosicao.getColuna(), pPosicao.getLinha());
        } else if(this.getDirecaoOlhar() == 'D'){
            Desenhador.desenhar(this.iImageD, pPosicao.getColuna(), pPosicao.getLinha());
        } else if(this.getDirecaoOlhar() == 'L'){
            Desenhador.desenhar(this.iImageL, pPosicao.getColuna(), pPosicao.getLinha());
        } else if(this.getDirecaoOlhar() == 'R'){
            Desenhador.desenhar(this.iImageR, pPosicao.getColuna(), pPosicao.getLinha());
        }
    }
}