/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoDeProgramacion;

/**
 *
 * @author Ignacio Medel
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);//centramos la ventana de la interfaz grafica
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        label1Titulo = new java.awt.Label();
        jButton1Salir = new javax.swing.JButton();
        jLabel1Copyright = new javax.swing.JLabel();
        jButton1CrearAtomo = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1Titulo.setBackground(new java.awt.Color(0, 0, 0));
        label1Titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        label1Titulo.setForeground(new java.awt.Color(255, 255, 255));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, label1Titulo, org.jdesktop.beansbinding.ELProperty.create("Moleculator"), label1Titulo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        getContentPane().add(label1Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 210, 40));

        jButton1Salir.setBackground(new java.awt.Color(255, 255, 255));
        jButton1Salir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1Salir.setText("Salir");
        jButton1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 100, 30));

        jLabel1Copyright.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1Copyright.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Copyright.setText("2020-2021 Copyright. Chayanne Lovers.");
        getContentPane().add(jLabel1Copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 740, 250, 30));

        jButton1CrearAtomo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1CrearAtomo.setText("Crear Átomo");
        jButton1CrearAtomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CrearAtomoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1CrearAtomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 230, 70));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blacklikefeña.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 800));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalirActionPerformed
        System.exit(0);//boton de salir.
    }//GEN-LAST:event_jButton1SalirActionPerformed

    private void jButton1CrearAtomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CrearAtomoActionPerformed
        CrearAtomo atomo = new CrearAtomo();
        atomo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1CrearAtomoActionPerformed

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1CrearAtomo;
    private javax.swing.JButton jButton1Salir;
    private javax.swing.JLabel jLabel1Copyright;
    private javax.swing.JLabel jLabelFondo;
    private java.awt.Label label1Titulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
