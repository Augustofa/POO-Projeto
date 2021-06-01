package Controler;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Modelo.*;
import Auxiliar.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import java.util.zip.*;
/**
 *
 * @author junio
 */
public class Tela extends javax.swing.JFrame implements MouseListener, KeyListener {

    private Hero hHero;
    private ArrayList<Elemento> eElementos;
    private ControleDeJogo cControle = new ControleDeJogo();
    private Graphics g2;
    /**
     * Creates new form
     */
    public Tela() {
        Desenhador.setCenario(this); /*Desenhador funciona no modo estatico*/
        initComponents();
 
        this.addMouseListener(this); /*mouse*/
        this.addKeyListener(this);   /*teclado*/
        /*Cria a janela do tamanho do cenario + insets (bordas) da janela*/
        this.setSize(Consts.RES * Consts.CELL_SIDE + getInsets().left + getInsets().right,
                Consts.RES * Consts.CELL_SIDE + getInsets().top + getInsets().bottom);

        /*Este array vai guardar os elementos graficos*/
        eElementos = new ArrayList<Elemento>(100);

        /*Cria eElementos adiciona elementos*/
        /*O protagonista (heroi) necessariamente precisa estar na posicao 0 do array*/
        hHero = new Hero("skooter.png"); /* https://www.online-image-editor.com/ */
        hHero.setPosicao(0, 4);
        this.addElemento(hHero);
        
        RoboVerde cTeste = new RoboVerde("roboVerde.png");
        cTeste.setPosicao(5, 5);
        this.addElemento(cTeste);     

        RoboVerde roboVerde1 = new RoboVerde("roboVerde.png");
        roboVerde1.setPosicao(3, 3);
        this.addElemento(roboVerde1);

        RoboVerde roboVerde2 = new RoboVerde("roboVerde.png");
        roboVerde2.setPosicao(6, 6);
        this.addElemento(roboVerde2);

        RoboAmarelo roboAmarelo = new RoboAmarelo("roboAmarelo.png", hHero);
        roboAmarelo.setPosicao(2, 9);
        this.addElemento(roboAmarelo);

        BlocoImovel blocoImovel = new BlocoImovel("blocoTemp.png");
        blocoImovel.setPosicao(9, 1);
        this.addElemento(blocoImovel);
        
        BlocoImovel blocoImovel2 = new BlocoImovel("blocoTemp.png");
        blocoImovel2.setPosicao(9, 2);
        this.addElemento(blocoImovel2); 
        
        BlocoImovel blocoImovel3 = new BlocoImovel("blocoTemp.png");
        blocoImovel3.setPosicao(9, 3);
        this.addElemento(blocoImovel3);
        
        Fruta cereja = new Fruta("cereja.png");
        cereja.setPosicao(9, 5);
        this.addElemento(cereja);
        
        Fruta limao = new Fruta("limao.png");
        limao.setPosicao(8, 7);
        this.addElemento(limao);
        
        Fruta morango = new Fruta("morango.png");
        morango.setPosicao(4, 4);
        this.addElemento(morango);
        
        Fruta uva = new Fruta("uva.png");
        uva.setPosicao(4, 7);
        this.addElemento(uva);
    }

/*--------------------------------------------------*/
    public void addElemento(Elemento umElemento) {
        eElementos.add(umElemento);
    }

    public void removeElemento(Elemento umElemento) {
        eElementos.remove(umElemento);
    }

    public Graphics getGraphicsBuffer(){
        return g2;
    }
    
    /*Este metodo eh executado a cada Consts.FRAME_INTERVAL milissegundos*/    
    public void paint(Graphics gOld) {
        Graphics g = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico*/
        g2 = g.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);
        /*Desenha cenário*/
        try {
            //Pega a imagem fora do loop para um aumento gigante na performance
            Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "backgroundTeste.png");
            g2.drawImage(newImage, 0, 0, null);  
            /*for (int i = 0; i < Consts.RES; i++) {
                for (int j = 0; j < Consts.RES; j++) {
                    /*Linha para alterar o background*
                    g2.drawImage(newImage,j*Consts.CELL_SIDE, i*Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);  
                }
            }*/
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*Aqui podem ser inseridos novos processamentos de controle*/
        if (!this.eElementos.isEmpty()) {
            this.cControle.desenhaTudo(eElementos);
            this.cControle.processaTudo(eElementos);
        }
        
        //Esvazia os espacos de memoria ocupados pelos Buffers
        g.dispose();
        g2.dispose();
        if (!getBufferStrategy().contentsLost()) {
            getBufferStrategy().show();
        }
    }

    public void go() {
        TimerTask redesenhar = new TimerTask() {
            public void run() {
                repaint(); /*(executa o metodo paint)*/
            }
        };
        
        /*Redesenha (executa o metodo paint) tudo a cada Consts.FRAME_INTERVAL milissegundos*/
        Timer timer = new Timer();
        timer.schedule(redesenhar, 0, Consts.FRAME_INTERVAL);
    }

    public void keyPressed(KeyEvent e) {
        /*Movimento do heroi via teclado*/
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hHero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hHero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hHero.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hHero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_R) {
            this.eElementos.clear();
            hHero = new Hero("skooter.png"); /* https://www.online-image-editor.com/ */
            hHero.setPosicao(0, 7);
            this.addElemento(hHero);

            RoboVerde cTeste = new RoboVerde("carro_azul.png");
            cTeste.setPosicao(5, 5);
            this.addElemento(cTeste);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            //hHero.DestroiElemento()
        }
        
        
        /*Se o heroi for para uma posicao invalida, sobre um elemento intransponivel, volta para onde estava*/
        if (!cControle.ehPosicaoValida(this.eElementos,hHero.getPosicao())) {
            hHero.voltaAUltimaPosicao();
        }

        this.setTitle("-> Cell: " + (hHero.getPosicao().getColuna()) + ", " + (hHero.getPosicao().getLinha()));
    }

    public void mousePressed(MouseEvent e) {
         //Movimento via mouse
         int x = e.getX();
         int y = e.getY();
     
         this.setTitle("X: "+ x + ", Y: " + y +
         " -> Cell: " + (y/Consts.CELL_SIDE) + ", " + (x/Consts.CELL_SIDE));
        
         this.hHero.getPosicao().setPosicao(y/Consts.CELL_SIDE, x/Consts.CELL_SIDE);

        /*Se o heroi for para uma posicao invalida, sobre um elemento intransponivel, volta para onde estava*/
        if (!cControle.ehPosicaoValida(this.eElementos,hHero.getPosicao())) {
            hHero.voltaAUltimaPosicao();
        }         
         
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POO2021");
        setAutoRequestFocus(false);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}
