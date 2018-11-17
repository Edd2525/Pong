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
        setTitle("Pong");
        setSize(ancho,alto);
        setLocationRelativeTo(null);//centrada
        setResizable(false);
        lamina = new Tablero();
        add(lamina);//muesta el panel
        addKeyListener(new Teclado());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza al cerrar
        
        hilo=new Hilo(lamina);
        hilo.start();

        
    }
    
    
}
