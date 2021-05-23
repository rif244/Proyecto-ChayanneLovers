
package proyectoprogra;

import java.awt.Color;
import java.awt.Graphics;

public class Enlaces {
   private int x=0, y=0;
   static final int d = 20;
   public String colouraux;

    public Enlaces(int x, int y) {
        setX(x);
        setY(y);
        this.colouraux=VentanaCreacion.colour;
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
