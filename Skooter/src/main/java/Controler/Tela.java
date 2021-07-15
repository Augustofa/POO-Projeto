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
import javax.sound.sampled.*;
/**
 *
 * @author junio
 */
public class Tela extends javax.swing.JFrame implements KeyListener {

    private static Tela instancia;
    private Hero hHero;
    private ArrayList<Elemento> eElementos;
    private ControleDeJogo cControle = new ControleDeJogo();
    private Graphics g2;
    private boolean esperandoTecla = true;
    private boolean loading = false;
    private long lastPress = 0;
    private int vidas = 3;
    private Music soundtrack;
    
    /**
     * Creates new form
     */
    private Tela() {
        Desenhador.setCenario(this); /*Desenhador funciona no modo estatico*/
        initComponents();
 
        this.addKeyListener(this);   /*teclado*/
        /*Cria a janela do tamanho do cenario + insets (bordas) da janela*/
        this.setSize(Consts.RES * Consts.CELL_SIDE + getInsets().left + getInsets().right,
                Consts.RES * Consts.CELL_SIDE + getInsets().top + getInsets().bottom);

        /*Este array vai guardar os elementos graficos*/
        eElementos = new ArrayList<>(100);
        /*Inicia o menu inicial*/
        this.proximaFase();
        this.setTitle("Skrooter");

        /*O protagonista (heroi) necessariamente precisa estar na posicao 0 do array*/
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
    
    public static Tela getTela(){
        if(instancia == null){
            instancia = new Tela();
        }
        return instancia;
    }
    
    /*Este método é executado a cada Consts.FRAME_INTERVAL milissegundos*/    
    public void paint(Graphics gOld) {
        Graphics g = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico do tamanho da tela*/
        g2 = g.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);
        
        try {
            /*Desenha uma imagem de fundo grande ao inves de ter que desenhar muitas pequenas*/
            Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + Fases.backgroundImg);
            g2.drawImage(newImage, 0, 0, null);
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*Só processa elementos se o array não estiver vazio e estiver em uma fase*/
        if (!this.eElementos.isEmpty() || !loading) {
            this.cControle.processaTudo(eElementos);
            this.cControle.desenhaTudo(eElementos);
        }
        
        /*Esvazia os espacos de memoria ocupados pelos Buffers*/
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
        /*Adiciona um delay para o movimento do heroi não ser instantâneo*/
        if(System.currentTimeMillis() - lastPress > Consts.FRAME_INTERVAL + 20){
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                hHero.moveUp();
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                hHero.moveDown();
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                hHero.moveLeft();
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                hHero.moveRight();
                /*Codigo para testes, passa de fase instantaneamente*/
            } else if (e.getKeyCode() == KeyEvent.VK_P) {
                Fases.proximaFase(eElementos);
                hHero = (Hero) eElementos.get(0);
            } else if (e.getKeyCode() == KeyEvent.VK_R) {
                this.tiraVida();
                if (vidas <= 0) {
                    Tela.getTela().gameOver();
                } else{
                    this.reiniciaFase();
                }
            }
            lastPress = System.currentTimeMillis();
        }
        /*Evento da barra de espaco separado pra que nao tenha delay entre andar 
        e poder destruir um bloco*/
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if(esperandoTecla){
                this.criaMusica();
                this.reiniciaFase();
                setEsperandoTecla(false);
            }
            hHero.destroiElemento(eElementos);
        }
    }
    
    public void proximaFase(){
        Fases.proximaFase(eElementos);
        hHero = (Hero) eElementos.get(0);
    }
    
    public void reiniciaFase(){
        Fases.resetaFase(eElementos);
        hHero = (Hero) eElementos.get(0);
    }
    
    public void gameOver(){
        Fases.gameOver(eElementos);
        hHero = (Hero) eElementos.get(0);
        this.vidas = 3;
    }
    
    public void criaMusica() {
        try {
            String currentPath = new java.io.File(".").getCanonicalPath();
            String soundtrackPath = currentPath + Consts.PATH_SOUND + "soundtrack.wav";

            soundtrack = new Music(soundtrackPath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void playMusica(){
        soundtrack.play();
    }
    
    public void pausaMusica(){
        soundtrack.pause();
    }
    
    public void setLoading(boolean loading){
        this.loading = loading;
    }
    
    public void setEsperandoTecla(boolean esperandoTecla){
        this.esperandoTecla = esperandoTecla;
    }
    
    public ArrayList<Elemento> getArrayElementos(){
        return eElementos;
    }
    
    public Hero getHeroi(){
        return hHero;
    }
    
    public int getVidas(){
        return vidas;
    }
    
    public int tiraVida(){
        vidas--;
        tocaEfeito("lose_life.wav");
        System.out.println("Vida perdida!");
        if(vidas == 0){
            System.out.println("Voce morreu...");
        } else {
            System.out.println("Vidas atuais: " + Tela.getTela().getVidas());
        }
        return vidas;
    }
    
    public void tocaEfeito(String nomeArquivo){
        try {
            SoundEffect collision = new SoundEffect(nomeArquivo);
            collision.play();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        }
    }

    public void mousePressed(MouseEvent e) {
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

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}
