
package proyectoprogra;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ventanaSeleccion extends VentanaGeneral {
    
    //metodos
    public ventanaSeleccion() {//constuctor
        super();
        this.botonAtomo();
        this.botonMolecula();  
        this.labelNombre();
        this.labelIcon();
    }

    private void botonAtomo() {
        JButton button = new JButton();
        button.setBounds(200, 200, 200, 50);
        button.setText("Crear Atomo");
        button.setFont(new Font("times new roman",Font.BOLD, 14));
        button.setBackground(new Color(200,200,200));
        panel.add(button);  
       
        //evento del botton CrearAtomo
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String entrada;
                entrada = JOptionPane.showInputDialog(null,"Ingrese el nombre de el atomo", "Moleculator", JOptionPane.PLAIN_MESSAGE);
                //aqui se guardara el atomo creado
            }
        };   
        button.addActionListener(evento);
    }

    private void botonMolecula(){
        
        JButton button = new JButton();
        button.setBounds(200, 350, 200, 50);
        button.setText("Crear Molecula");
        button.setFont(new Font("times new roman",Font.BOLD, 14));
        button.setBackground(new Color(200,200,200));
        panel.add(button);  
        
        //evento del botton CrearAtomo
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) { 
                VentanaCreacion v2 = new VentanaCreacion();
                VentanaCreacion.atomo = 0;
                VentanaCreacion.Nenlaces = 0;
                VentanaCreacion.colour = "black";
                dispose();
                v2.setVisible(true);
            }
        };   
        button.addActionListener(evento); 
    }
    
        
    private void labelNombre(){
        JLabel Nombre = new JLabel();
        Nombre.setLayout(null);
        Nombre.setText("Designed by Chayanne Lovers in Chile. Ver. 1.4");
        Nombre.setForeground(Color.white);//letras enlaces
        Nombre.setBounds(380, 710, 400, 20);
        Nombre.setFont(new Font("times new roman", Font.BOLD, 14));
        panel.add(Nombre);
    } 
    

    private void labelIcon(){
        JLabel Dios = new JLabel();
        Dios.setIcon(new ImageIcon("Chayanne.jpg"));
        Dios.setBounds(700,560,600,300);
        panel.add(Dios);
    }
}
