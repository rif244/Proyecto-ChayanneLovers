
package proyectoprogra;

import java.awt.Graphics;
import java.util.ArrayList;
import static proyectoprogra.Guardado.Lista;

public class Enlaces {
   private int x=0, y=0;
   static final int d = 20;
   boolean usado=false;//se sua pa ver si esta conectado a tro enlace

    public Enlaces(int x, int y) {
        setX(x);
        setY(y);
    }
   
   public void pintar (Graphics g){
        g.drawOval(getX(), getY(), d, d); 
        
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
   
   
   
   
}
