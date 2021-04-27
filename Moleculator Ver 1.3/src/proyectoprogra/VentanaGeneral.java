
package proyectoprogra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaGeneral extends JFrame {
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel label = new JLabel();
    
    
    //metodos

    public VentanaGeneral() {
        this.setSize(1024,800);//se establece el tamaño de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//cerrar la ventana
        this.setTitle("Moleculator");//titulo de la ventana
        this.setLocation(500,100);//se inicializa la ventana en el centro de la pantalla
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);
        this.crearPanel();
    }

    private void crearPanel() {
        panel = new JPanel();//creacion de un panel
        panel2 = new JPanel();
        panel.setLayout(null);//desactivamos el diseño por defecto
        panel.setBounds(200, 0, 823, 800);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);//agregamos el panel a la ventana
        this.JlTitulo(); 
        panel2.setLayout(null);//desactivamos el diseño por defecto
        panel2.setBounds(0, 0, 200, 800);
        panel2.setBackground(Color.black);
        this.getContentPane().add(panel2);//agregamos el panel a la ventana
    }

    private void JlTitulo() {
        label.setText("MOLECULATOR");
        label.setBounds(200, 20, 500, 20);//posicion del titulo
        label.setForeground(Color.white);//cambio de color de la fuente
        label.setFont(new Font("times new roman", Font.BOLD, 20));//cambio de fuente y 
        panel.add(label);
    }
    
    

    
    
    
    
    
    
    
    
    
}
