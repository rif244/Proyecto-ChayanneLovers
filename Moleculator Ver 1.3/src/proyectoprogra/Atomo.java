
package proyectoprogra;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class Atomo {
    private String Nombre;
    private int x=0, y=0;
    static final int d = 60;
    

    public Atomo(int x, int y, String nombre){
        this.Nombre=nombre;
        setX(x);
        setY(y);
    }
    
    public Atomo(){   
    }

    public void pintar (Graphics g){
        g.setColor(Color.white);
        g.drawOval(getX(), getY(), d, d); 
        g.drawString(this.Nombre, getX()+10, getY()+35);
    }
    
    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }


    


  
    
    
    
}

