
package proyectoprogra;

import java.awt.Color;
import java.awt.Graphics;


public class Atomo {
    private String Nombre;
    private int x=0, y=0;
    static final int d = 60;
    public String colouraux;
    

    public Atomo(int x, int y, String nombre){
        this.Nombre=nombre;
        setX(x);
        setY(y);
        this.colouraux=VentanaCreacion.colour;
    }
    
    public Atomo(){   
    }

    public void pintar (Graphics g){
        if(colouraux.equals("blue")){
            g.setColor(Color.blue);
        }
        else if(colouraux.equals("pink")){
            g.setColor(Color.pink);
        }
        else if(colouraux.equals("green")){
            g.setColor(Color.green);
        }
        else if(colouraux.equals("yellow")){
            g.setColor(Color.yellow);
        }
        else{
            g.setColor(Color.black);
        }
        g.drawArc(getX(), getY(), d, d, 0, 180);
        g.drawArc(getX(), getY(), d, d, 0, -180);
        
        
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

