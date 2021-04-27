
package proyectoprogra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Dibujar extends JPanel implements MouseListener {
    ArrayList<Atomo> listaAtomos = null;
    ArrayList<Enlaces> listaEnlaces = null;
    

   
       
    
    public Dibujar() {
       setListaAtomos(new ArrayList<>());
       setListaEnlaces(new ArrayList<>());
       addMouseListener(this);
       this.setLayout(null);//desactivamos el diseño por defecto
       this.setBounds(200, 0, 823, 800);
       this.setBackground(Color.black);
       
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        for(Atomo objAtomo : getListaAtomos())
            objAtomo.pintar(g);
        for(Enlaces objEnlaces : getListaEnlaces())
            objEnlaces.pintar(g);     
    }

    private boolean isEncima(Point p){
        Rectangle figura = new Rectangle(p.x - Atomo.d/2, p.y - Atomo.d/2, Atomo.d, Atomo.d);
        for(Atomo atomo : listaAtomos){
            if(new Rectangle((atomo.getX()+ 30) - Atomo.d/2, (atomo.getY()+ 30) - Atomo.d/2, Atomo.d+30, Atomo.d+30).intersects(figura)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        int enlaces = VentanaCreacion.nenlaces;
        int atomo = VentanaCreacion.atomo;
        if(e.getButton() == 1){
            if(isEncima(e.getPoint())){
                String [] atomoaux = Guardado.box();                
                getListaAtomos().add(new Atomo(e.getX() - 30, e.getY() - 30, atomoaux[atomo]));
                if(enlaces==1){
                    getListaEnlaces().add(new Enlaces(e.getX() + 35, e.getY() - 10));
                }
                else if (enlaces==2){
                    getListaEnlaces().add(new Enlaces(e.getX() + 35, e.getY() - 10));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() + 35));
                }
                else if (enlaces == 3){
                    getListaEnlaces().add(new Enlaces(e.getX() + 35, e.getY() - 10));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() + 35));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() - 55));               
                }
                else if (enlaces == 4){
                
                    getListaEnlaces().add(new Enlaces(e.getX() + 35, e.getY() - 10));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() + 35));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() - 55)); 
                    getListaEnlaces().add(new Enlaces(e.getX() - 55, e.getY() - 10));
                }             
                repaint();
                
            }
            
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    public ArrayList<Atomo> getListaAtomos() {
        return listaAtomos;
    }

    public void setListaAtomos(ArrayList<Atomo> listaAtomos) {
        this.listaAtomos = listaAtomos;
    }

    public ArrayList<Enlaces> getListaEnlaces() {
        return listaEnlaces;
    }

    public void setListaEnlaces(ArrayList<Enlaces> listaEnlaces) {
        this.listaEnlaces = listaEnlaces;
    }
    
    
    
    
}
