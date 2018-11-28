/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public class Hilo extends Thread {

    Tablero panel;
    int puntaje = 0;

    public Hilo(Tablero panel) {
        this.panel = panel;
    }

    public void run() {
        try {
            while (!Pelota.fin) {
                try {
                    Thread.sleep(3);
                    panel.repaint();
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            Thread.sleep(10);
            Jugador nuevo = new Jugador(Pong.jugador1+" vs "+Pong.jugador2,Pelota.puntaje);
            Pong.puntajes.acomodar(nuevo);
            VentanaPuntajes vpuntaje = new VentanaPuntajes();
            vpuntaje.setVisible(true);
            TestMenu.Actal.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public int getPuntaje() {
        return puntaje;
    }

}
