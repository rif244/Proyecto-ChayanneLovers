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
    static int atomo = 0;
    static int Nenlaces = 0;
    static String colour = "black";

    public VentanaCreacion() {
        super();
        this.labelAtomos();
        this.atrasButton();
        this.labelEnlaces();        
        this.remove(panel);
        this.repaint();
        this.revalidate();
        this.labelColor();
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

    private void labelEnlaces(){
        JLabel enlaces = new JLabel();
        enlaces.setLayout(null);
        enlaces.setText("Enlaces:");
        enlaces.setForeground(Color.white);//letras enlaces
        enlaces.setBounds(20, 280, 150, 20);
        enlaces.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(enlaces);
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
