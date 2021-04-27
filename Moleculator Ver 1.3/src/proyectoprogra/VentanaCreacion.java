package proyectoprogra;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaCreacion extends VentanaGeneral {
    ventanaSeleccion v2 = new ventanaSeleccion();
    Dibujar aux = new Dibujar();
    static int atomo = 0;
    static int nenlaces = 0;

    public VentanaCreacion() {
        super();
        this.seleccionAtomo();
        this.labelAtomos();
        this.atrasButton();
        this.seleccionEnlaces();
        this.labelEnlaces();
        this.crearAtomoButton();
        this.remove(panel);
        this.add(aux);
        this.repaint();
        this.revalidate();
    }

    public  int getAtomo() {
        return atomo;
    }

    public void setAtomo(int atomo) {
        this.atomo = atomo;
    }

    public int getNenlaces() {
        return nenlaces;
    }

    public void setNenlaces(int nenlaces) {
        this.nenlaces = nenlaces;
    }

    
    
    
    private void seleccionAtomo(){
        String [] nombresAtomos = Guardado.box();
        int contador = 0;
        int tamanoArreglo = nombresAtomos.length;
        panel2.setBackground(Color.white);
        JComboBox atomList = new JComboBox();
        atomList.setBounds(20, 100, 150, 30);
        atomList.setBackground(Color.black);
        atomList.setForeground(Color.white);
        atomList.setFont(new Font("times new roman", Font.BOLD, 14));
        while(contador<tamanoArreglo){
            atomList.addItem(nombresAtomos[contador]);
            contador++;  
        }       
        panel2.add(atomList);
        
        
        atomList.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if(arg0.getStateChange()==ItemEvent.SELECTED){
                   int count = nombresAtomos.length;
                   int x=0;
                   while( x < count){
                       if(atomList.getSelectedItem().equals(nombresAtomos[x])){                                                    
                           atomo = x;
                           //JOptionPane.showMessageDialog(null, getAtomo()); 
                           break;
                       }
                       else{
                           x++;
                       }
                   }
                }
            }
        });

        
        
        
        
           
        
    }
    
    private void labelAtomos(){
        JLabel atomos = new JLabel();
        atomos.setLayout(null);
        atomos.setText("Atomos:");
        atomos.setForeground(Color.black);
        atomos.setBounds(20, 80, 150, 20);
        atomos.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(atomos);
    }
    
    private void atrasButton(){
        JButton backButton = new JButton();
        backButton.setLayout(null);
        backButton.setText("Atras");
        backButton.setFont(new Font("time new roman", Font.BOLD, 14));
        backButton.setForeground(Color.white);
        backButton.setBackground(Color.black);
        backButton.setBounds(20, 700, 150, 30);
        panel2.add(backButton);  
        
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                ventanaSeleccion v2 = new ventanaSeleccion();
                v2.setVisible(true);
            }
        };   
        backButton.addActionListener(evento);
        
        
    }
    
    private void seleccionEnlaces(){
        String [] nenlaces = {"Solo el átomo","1","2","3","4"};
        JComboBox enlaces = new JComboBox(nenlaces);
        enlaces.setBounds(20, 300, 150, 30);
        enlaces.setBackground(Color.black);
        enlaces.setForeground(Color.white);
        enlaces.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(enlaces);
        
        
        enlaces.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if(arg0.getStateChange()==ItemEvent.SELECTED){                  
                   if(enlaces.getSelectedItem().equals("1") ){
                       
                       setNenlaces(1);
                   }
                   else if(enlaces.getSelectedItem().equals("2")){
                      
                       setNenlaces(2);
                   }
                   else if(enlaces.getSelectedItem().equals("3")){
                       
                       setNenlaces(3);
                   }
                   
                   else if(enlaces.getSelectedItem().equals("4")){
                       
                       setNenlaces(4);
                   }
                   
                   else{
                       setNenlaces(0);
                   }
                }
            }
        });       
    }

     private void labelEnlaces(){
        JLabel enlaces = new JLabel();
        enlaces.setLayout(null);
        enlaces.setText("Enlaces:");
        enlaces.setForeground(Color.black);
        enlaces.setBounds(20, 280, 150, 20);
        enlaces.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(enlaces);
    }
     
     
    private void crearAtomoButton(){
        JButton backButton = new JButton();
        backButton.setLayout(null);
        backButton.setText("Generar Atomo");
        backButton.setFont(new Font("time new roman", Font.BOLD, 14));
        backButton.setForeground(Color.white);
        backButton.setBackground(Color.black);
        backButton.setBounds(20, 500, 150, 30);
        panel2.add(backButton);  
        
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        };   
        backButton.addActionListener(evento);
        
    
    } 
    
   
        
    
    
}
