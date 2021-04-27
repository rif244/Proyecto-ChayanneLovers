package proyectoprogra;

import java.awt.Color;
import java.awt.Graphics;

public class enlacesSimples {
    
    private int x=0, y=0;
    private int orientacionX=0, orientacionY=0;
            

    public enlacesSimples(int x, int y, int orientacionX, int orientacionY) {
        setX(x);
        setY(y);
        setOrientacionX(orientacionX);
        setOrientacionY(orientacionY);
    }
   
    public void pintar (Graphics g){
        g.setColor(new Color(200, 0, 0));//color del enlace
        g.drawLine(getX(), getY(), getX() + getOrientacionX(), getY() + getOrientacionY());        
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

    public int getOrientacionX() {
        return orientacionX;
    }

    public void setOrientacionX(int orientacionX) {
        this.orientacionX = orientacionX;
    }

    public int getOrientacionY() {
        return orientacionY;
    }

    public void setOrientacionY(int orientacionY) {
        this.orientacionY = orientacionY;
    }
    
    
    
}
