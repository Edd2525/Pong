/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JFrame;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public class Ventana extends JFrame{

    private final int ancho=800, alto=500;
    private Tablero lamina;
    private Hilo hilo;
    public Ventana() {
        this.setTitle("Pong");
        this.setSize(ancho,alto);
        this.setLocationRelativeTo(null);//centrada
        this.setResizable(false);
        lamina = new Tablero();
        this.add(lamina);//muesta el panel
        this.addKeyListener(new Teclado());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza al cerrar
        
        hilo=new Hilo(lamina);
        hilo.start();     
    }
    
    public void cerrar(){
        this.dispose();
    }
    
    
}
