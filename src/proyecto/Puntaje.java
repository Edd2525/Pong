/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public class Puntaje {
    
    public Jugador jugadores[] = new Jugador[10];

    public Puntaje() {
        for (int i = 0; i < this.jugadores.length; i++) {
            this.jugadores[i]=new Jugador("NULL"+i,0);
        }
    }
    
    public void acomodar(Jugador nuevo){
        Jugador temp=nuevo;
        Jugador temp2;
        for (int i = 0; i < this.jugadores.length; i++) {
            if(temp.getPuntaje()>this.jugadores[i].getPuntaje()){
                temp2=this.jugadores[i];
                this.jugadores[i]=temp;
                temp=temp2;
            }
        }
    }
    public void test(){
        for (int i = 0; i < this.jugadores.length; i++) {
            System.out.println(this.jugadores[i].toString());
        }
    }
    
    
    
}
