/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public class Raqueta {
    private int x, y;
    private final int ancho=10, alto=100;

    public Raqueta(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Rectangle2D getRaqueta(){
        return new Rectangle2D.Double(x,y,ancho,alto);
    }
    
    
    public void moverR1(Rectangle limites){
        if(Teclado.w && y > limites.getMinY()){
            y--;
        }
        if(Teclado.s && y < limites.getMaxY()-alto){
            y++;
        }
    }
    
    public void moverR2(Rectangle limites){
        if(Teclado.o && y > limites.getMinY()){
            y--;
        }
        if(Teclado.l && y < limites.getMaxY()-alto){
            y++;
        }
    }
    
    
}
