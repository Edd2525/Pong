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
public class Hilo extends Thread{
    Tablero lamina;

    public Hilo(Tablero lamina) {
        this.lamina = lamina;
    }
    
    public void run(){
        while(!Pelota.fin){
            try {
                Thread.sleep(3);
                lamina.repaint();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    
}
