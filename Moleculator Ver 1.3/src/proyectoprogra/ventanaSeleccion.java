
package proyectoprogra;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ventanaSeleccion extends VentanaGeneral {
    
    //metodos
    public ventanaSeleccion() {//constuctor
        super();
        this.botonAtomo();
        this.botonMolecula();    
    }

    private void botonAtomo() {
        JButton button = new JButton();
        button.setBounds(200, 200, 200, 50);
        button.setText("Crear Atomo");
        button.setFont(new Font("times new roman",Font.BOLD, 14));
        button.setBackground(Color.white);
        panel.add(button);  
       
        //evento del botton CrearAtomo
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String entrada;
                entrada = JOptionPane.showInputDialog(null,"Ingrese el nombre de el atomo", "Moleculator", JOptionPane.PLAIN_MESSAGE);
                Atomo atomoaux = new Atomo();
                atomoaux.setNombre(entrada);
                Guardado.Lista.add(atomoaux);
                JOptionPane.showMessageDialog(null,"El atomo se ha ingresado correctamente", "Moleculator", JOptionPane.PLAIN_MESSAGE);
            }
        };   
        button.addActionListener(evento);
    }

    private void botonMolecula(){
        
        JButton button = new JButton();
        button.setBounds(200, 350, 200, 50);
        button.setText("Crear Molecula");
        button.setFont(new Font("times new roman",Font.BOLD, 14));
        button.setBackground(Color.white);
        panel.add(button);  
        
        //evento del botton CrearAtomo
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) { 
                VentanaCreacion v2 = new VentanaCreacion();
                dispose();
                v2.setVisible(true);
            }
        };   
        button.addActionListener(evento); 
    }
    
        
    
        
}
