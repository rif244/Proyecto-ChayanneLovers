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
    static int Nenlaces = 0;
    static String colour = "black";

    public VentanaCreacion() {
        super();
        this.seleccionAtomo();
        this.labelAtomos();
        this.atrasButton();
        this.seleccionEnlaces();
        this.labelEnlaces();        
        this.remove(panel);
        this.add(aux);
        this.repaint();
        this.revalidate();
        this.seleccionColor();
        this.labelColor();
    }


 
    private void seleccionAtomo(){
        String [] nombresAtomos = Guardado.box();
        int contador = 0;
        int tamanoArreglo = nombresAtomos.length;
        panel2.setBackground(new Color(100,100,100));//izquierda panel dibujar
        JComboBox atomList = new JComboBox();
        atomList.setBounds(20, 100, 150, 30);
        atomList.setBackground(new Color(200,200,200));//ventanita seleccion atomo
        atomList.setForeground(Color.black);//letra
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
        atomos.setForeground(Color.white);//titulo atomos
        atomos.setBounds(20, 80, 150, 20);
        atomos.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(atomos);
    }
    
    
    private void atrasButton(){
        JButton backButton = new JButton();
        backButton.setLayout(null);
        backButton.setText("Atras");
        backButton.setFont(new Font("time new roman", Font.BOLD, 14));
        backButton.setForeground(Color.black);//letras
        backButton.setBackground(new Color(200,200,200));//boton
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
        enlaces.setBackground(new Color(200,200,200));//ventanita enlaces
        enlaces.setForeground(Color.black);//letras
        enlaces.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(enlaces);
        
        
        enlaces.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if(arg0.getStateChange()==ItemEvent.SELECTED){                  
                   if(enlaces.getSelectedItem().equals("1") ){
                       
                       Nenlaces=1;
                   }
                   else if(enlaces.getSelectedItem().equals("2")){
                      
                       Nenlaces=2;
                   }
                   else if(enlaces.getSelectedItem().equals("3")){
                       
                       Nenlaces=3;
                   }
                   
                   else if(enlaces.getSelectedItem().equals("4")){
                       
                       Nenlaces=4;
                   }
                   
                   else{
                       Nenlaces=5;
                   }
                }
            }
        });       
    }

    private void labelEnlaces(){
        JLabel enlaces = new JLabel();
        enlaces.setLayout(null);
        enlaces.setText("Enlaces:");
        enlaces.setForeground(Color.white);//letras enlaces
        enlaces.setBounds(20, 280, 150, 20);
        enlaces.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(enlaces);
    } 
     
     
     
    private void seleccionColor(){
        String [] colores = {"Negro","Verde","Azul","Rosado","Amarillo"};
        JComboBox color = new JComboBox(colores);
        color.setBounds(20, 500, 150, 30);
        color.setBackground(new Color(200,200,200));//ventanita enlaces
        color.setForeground(Color.black);//letras
        color.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(color);
        
        
        color.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if(arg0.getStateChange()==ItemEvent.SELECTED){                  
                   
                   if(color.getSelectedItem().equals("Verde")){
                       
                      colour="green";
                   }
                   else if(color.getSelectedItem().equals("Azul")){
                       
                       colour="blue";
                   }                  
                   else if(color.getSelectedItem().equals("Rosado")){
                       
                       colour="pink";
                   }
                   else if(color.getSelectedItem().equals("Amarillo")){
                       
                       colour="yellow";
                       
                   }
                   else{                      
                       colour="black";
                   }
                }
            }
        });       
    }
    
    private void labelColor(){
        JLabel color = new JLabel();
        color.setLayout(null);
        color.setText("Color");
        color.setForeground(Color.white);//titulo atomos
        color.setBounds(20, 480, 150, 20);
        color.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(color);
    }
}
