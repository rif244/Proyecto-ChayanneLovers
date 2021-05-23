
package proyectoprogra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dibujar extends JPanel implements MouseListener {
    ArrayList<Atomo> listaAtomos = null;
    ArrayList<Enlaces> listaEnlaces = null;
    ArrayList<enlacesSimples> listaSimples = null;
    

   
       
    
    public Dibujar() {
       setListaAtomos(new ArrayList<>());
       setListaEnlaces(new ArrayList<>());
       setListaSimples(new ArrayList<>());
       addMouseListener(this);
       this.setLayout(null);//desactivamos el diseño por defecto
       this.setBounds(200, 0, 823, 800);
       this.setBackground(new Color(200, 200, 200));//color panel de dibujo
       
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        for(Atomo objAtomo : getListaAtomos())
            objAtomo.pintar(g);
        for(Enlaces objEnlaces : getListaEnlaces())
            objEnlaces.pintar(g);  
     
        for(enlacesSimples objSimples : getListaSimples())
            objSimples.pintar(g);
    }

    private boolean isEncima(Point p){
        Rectangle figura = new Rectangle(p.x - Atomo.d/2, p.y - Atomo.d/2, Atomo.d+70, Atomo.d+70);
        for(Atomo atomo : listaAtomos){
            if(new Rectangle((atomo.getX()) - Atomo.d/2, (atomo.getY()) - Atomo.d/2, Atomo.d+70, Atomo.d+70).intersects(figura)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        int enlaces = VentanaCreacion.Nenlaces;
        int atomo = VentanaCreacion.atomo;
        int enlacesM = 0;
        String validar;
        if(e.getButton() == 1){
            if(isEncima(e.getPoint())){
                String [] atomoaux = Guardado.box();                
                getListaAtomos().add(new Atomo(e.getX() - 30, e.getY() - 30, atomoaux[atomo]));
                if(enlaces==1){
                    getListaEnlaces().add(new Enlaces(e.getX() + 32, e.getY() - 10));
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                     // AÑADE ENLACES EN LA PRIMERA BOLITA CON 1 ENLACE
                    if(enlacesM==1){
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY() ,25,0));
                    } 
                    else if(enlacesM==2){
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY() -2,25,0));
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY() + 2,25,0));
                    }
                }
                else if (enlaces==2){
                    getListaEnlaces().add(new Enlaces(e.getX() + 32, e.getY() - 10));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() + 32));
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                    // AÑADE ENLACES EN LA PRIMERA BOLITA CON 2 ENLACES
                    if(enlacesM==1){
                        
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY(),25,0));
                    } 
                    else if(enlacesM==2){
                       
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY() - 2,25,0));
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY() + 2,25,0));
                    }
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                    // AÑADE ENLACES EN LA SEGUNDA BOLITA 2 ENLACES
                    if(enlacesM==1){
                       
                        getListaSimples().add(new enlacesSimples(e.getX() , e.getY() + 55,0,25));
                    } 
                    else if(enlacesM==2){
                        
                        getListaSimples().add(new enlacesSimples(e.getX() - 2 , e.getY() + 55,0,25));
                        getListaSimples().add(new enlacesSimples(e.getX() + 2, e.getY() + 55,0,25));
                    }
                    
                }

                else if (enlaces == 3){
                    getListaEnlaces().add(new Enlaces(e.getX() + 32, e.getY() - 10));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() + 32));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() - 52)); 
                    
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                     // AÑADE ENLACES EN LA PRIMERA BOLITA CON 3 ENLACES
                    if(enlacesM==1){
                        
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY(),25,0));
                    } 
                    else if(enlacesM==2){
                       
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY() - 2,25,0));
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY() + 2,25,0));
                    }
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                     // AÑADE ENLACES EN LA SEGUNDA BOLITA CON 3 ENLACES
                    if(enlacesM==1){
                       
                        getListaSimples().add(new enlacesSimples(e.getX(), e.getY() + 55,0,25));
                    } 
                    else if(enlacesM==2){
                        
                        getListaSimples().add(new enlacesSimples(e.getX() - 2, e.getY() + 55,0,25));
                        getListaSimples().add(new enlacesSimples(e.getX() + 2, e.getY() + 55,0,25));
                    }
                    
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                     // AÑADE ENLACES EN LA TERCERA BOLITA CON 3 ENLACES
                    if(enlacesM==1){
                       
                        getListaSimples().add(new enlacesSimples(e.getX() , e.getY()- 55,0,-25));
                    } 
                    else if(enlacesM==2){
                        
                        getListaSimples().add(new enlacesSimples(e.getX() - 2, e.getY()- 55,0,-25));
                        getListaSimples().add(new enlacesSimples(e.getX() + 2, e.getY()- 55,0,-25));
                    }
       
                }
                else if (enlaces == 4){
                
                    getListaEnlaces().add(new Enlaces(e.getX() + 32, e.getY() - 10));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() + 32));
                    getListaEnlaces().add(new Enlaces(e.getX() - 10, e.getY() - 52)); 
                    getListaEnlaces().add(new Enlaces(e.getX() - 52, e.getY() - 10));
                    
                    
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                     // AÑADE ENLACES EN LA PRIMERA BOLITA CON 4 ENLACES
                    if(enlacesM==1){
                        
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY(),25,0));
                    } 
                    else if(enlacesM==2){
                       
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY()- 2,25,0));
                        getListaSimples().add(new enlacesSimples(e.getX() + 55, e.getY() + 2,25,0));
                    }
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                     // AÑADE ENLACES EN LA SEGUNDA BOLITA CON 4 ENLACES
                    if(enlacesM==1){
                       
                        getListaSimples().add(new enlacesSimples(e.getX() , e.getY() + 55,0,25));
                    } 
                    else if(enlacesM==2){
                        
                        getListaSimples().add(new enlacesSimples(e.getX() - 2, e.getY() + 55,0,25));
                        getListaSimples().add(new enlacesSimples(e.getX() + 2, e.getY() + 55,0,25));
                    }
                    
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                     // AÑADE ENLACES EN LA PTERCERA BOLITA CON 4 ENLACES
                    if(enlacesM==1){
                       
                        getListaSimples().add(new enlacesSimples(e.getX() , e.getY()- 55,0,- 25));
                    } 
                    else if(enlacesM==2){
                        
                        getListaSimples().add(new enlacesSimples(e.getX() - 2, e.getY()- 55,0,-25));
                        getListaSimples().add(new enlacesSimples(e.getX() + 2, e.getY()- 55,0,-25));
                    }
                    
                    do{    
                        validar = JOptionPane.showInputDialog(null,"ingrese 0 no quiere un enlace, si quiere un enlace simple(1) o enlace doble(2) (el enlace se creara a la derecha del atomo)","Moleculator",JOptionPane.PLAIN_MESSAGE);
                        if(validar.matches("[0-2]")){
                            enlacesM = Integer.parseInt(validar);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "entrada no valida por favor ingrese una entrada valida","moleculator",JOptionPane.PLAIN_MESSAGE);
                            enlacesM = -1;
                        }
                    }
                    while(enlacesM == -1);
                     // AÑADE ENLACES EN LA CUARTA BOLITA CON 4 ENLACES
                    if(enlacesM==1){
                       
                        getListaSimples().add(new enlacesSimples(e.getX() -55, e.getY(),- 25,0));
                    } 
                    else if(enlacesM==2){
                        
                        getListaSimples().add(new enlacesSimples(e.getX() - 55, e.getY()- 2 ,-25,0));
                        getListaSimples().add(new enlacesSimples(e.getX() - 55, e.getY() + 2,-25,0));
                    }
                                                      
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

    public ArrayList<enlacesSimples> getListaSimples() {
        return listaSimples;
    }

    public void setListaSimples(ArrayList<enlacesSimples> listaSimples) {
        this.listaSimples = listaSimples;
    }
    
    
    
    
}
