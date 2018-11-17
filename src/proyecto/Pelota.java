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
public class Pelota {
    private int x;
    private int y;
    private int dx=1, dy=1;
    private final int ancho=10, alto=10;
    private int marcadorP1=0, marcadorP2=0;
    public static boolean fin = false;

    public Pelota(int x, int y) {
        this.x=x;
        this.y=y;
    }
    
    public Rectangle2D getPelota(){
        return new Rectangle2D.Double(x,y,ancho,alto);
    }
    
    public void mover(Rectangle limites, boolean colisionR1, boolean colisionR2, Raqueta r1, Raqueta r2){
        x+=dx;
        y+=dy;
        
        if(colisionR1){
            dx=-dx;
            x=45;
        }
        if(colisionR2){
            dx=-dx;
            x=725;
        }
        if(x>limites.getMaxX()){
            dx=-dx;
            x=400;
            y=170;
            marcadorP1++;
        }
        if(y>limites.getMaxY()){
            dy=-dy;
        }
        if(x<0){
            dx=-dx;
            x=400;
            y=170;
            marcadorP2++;
            
        }
        if(y<0){
            dy=-dy;
        }
    }

    public int getMarcadorP1() {
        return marcadorP1;
    }

    public int getMarcadorP2() {
        return marcadorP2;
    }
    
}
