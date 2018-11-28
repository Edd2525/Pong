/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public class Teclado extends KeyAdapter {
    public static boolean w, s, o, l, enter;
    
    @Override
    public void keyPressed(KeyEvent e){
        int id = e.getKeyCode();
        if(id==KeyEvent.VK_W){
            w=true;
        }
        if(id==KeyEvent.VK_S){
            s=true;
        }
        if(id==KeyEvent.VK_O){
            o=true;
        }
        if(id==KeyEvent.VK_L){
            l=true;
        }
        if(id==KeyEvent.VK_ENTER){
            enter=true;
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e){
        int id = e.getKeyCode();
        if(id==KeyEvent.VK_W){
            w=false;
        }
        if(id==KeyEvent.VK_S){
            s=false;
        }
        if(id==KeyEvent.VK_O){
            o=false;
        }
        if(id==KeyEvent.VK_L){
            l=false;
        }
        if(id==KeyEvent.VK_ENTER){
            enter=false;
        }
    }
}
