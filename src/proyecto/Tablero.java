/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public class Tablero extends JPanel{
    Pelota pelota = new Pelota(0,0);
    Raqueta r1 = new Raqueta(30,175);
    Raqueta r2 = new Raqueta(754,175);
    
    private int puntajeGanador=2;
    
    public Tablero() {
        this.setBackground(Color.black);//define el color
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.WHITE);
        dibujarPuntaje(g2);
        dibujar(g2);
        //dibujarImagen(g2);
        actualizar();
    }
    
    public void dibujar(Graphics2D g){
        Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(), getBounds().getMaxY());
        g.draw(linea);
        g.fill(pelota.getPelota());
        g.fill(r1.getRaqueta());
        g.fill(r2.getRaqueta());
    }
    
    public void actualizar(){
        //getBounds() da el tamaño de la lamina
        pelota.mover(getBounds(),colision(r1.getRaqueta()),colision(r2.getRaqueta()),r1,r2);
        r1.moverR1(getBounds());
        r2.moverR2(getBounds());
        
    }
    
    private boolean colision(Rectangle2D r){
        return pelota.getPelota().intersects(r);
    }
    
    private void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Graphics2D win1 = g, win2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(pelota.getMarcadorP1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(pelota.getMarcadorP2()), (float) getBounds().getCenterX() + 25, 30);
        g2.drawString("Puntaje: "+Integer.toString(pelota.getPuntaje()), (float) getBounds().getCenterX() + 180, 30);
        
        if (pelota.getMarcadorP1() == puntajeGanador) {
            g.drawString("GANO El JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.fin = true;
        }
        if (pelota.getMarcadorP2() == puntajeGanador) {
            g.drawString("GANO EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.fin = true;
        }
    }
    
    private BufferedImage Imagen(){
        BufferedImage img;
        try {
            img = ImageIO.read(getClass().getResourceAsStream("p2.png"));
            return img;
        } catch (IOException ex) {
            Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private void dibujarImagen(Graphics2D g) {
        Graphics2D win1 = g, win2 = g;
        //Font score = new Font("Arial", Font.BOLD, 30);  
        BufferedImage img=Imagen();
        if(img!=null)
            g.drawImage(Imagen(), 100, 100, 100, 100, null);
        
    }

}
