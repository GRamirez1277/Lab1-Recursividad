/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recusividad;

import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class CancelarTicket extends javax.swing.JFrame {
    private PalindromoAir air;
    private Ticket[] asientosCantidad;
    
    public CancelarTicket(Ticket[] asientosCantidadExternos, PalindromoAir airExterno) {
        asientosCantidad = asientosCantidadExternos;
        air = airExterno;
        
        initComponents();
        
        System.out.println("Cancelar Ticket");
        for (int i = 0; i < asientosCantidad.length; i++) {
            if (asientosCantidad[i] != null) {
                System.out.println("Posición " + i + ": " + asientosCantidad[i].getNombrePasajero() + " - $. " + asientosCantidad[i].getTotalPagado());
            } else {
                System.out.println("Posición " + i + ": Vacía (null)");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NombreField = new javax.swing.JTextField();
        BotonVender = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LAB1/CancelarTicket.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreField.setBackground(new java.awt.Color(255, 255, 255));
        NombreField.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        NombreField.setForeground(new java.awt.Color(0, 0, 0));
        NombreField.setBorder(null);
        jPanel1.add(NombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 340, 30));

        BotonVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVenderMouseClicked(evt);
            }
        });
        jPanel1.add(BotonVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 190, 50));

        BotonRegresar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BotonRegresar.setText("Volver");
        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 60, 60));

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel1.setText("Cancelar Ticket");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 280, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVenderMouseClicked
        String nombre = NombreField.getText();
        boolean cancelar = air.cancelTicket(nombre);
        
        if (cancelar) {
            JOptionPane.showMessageDialog(null, "¡" + nombre + ", su ticket fue cancelado correctmente!", "Cancelación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no encontrado. Por favor, verifique el nombre e inténtelo nuevamente.", "Cancelación Fallida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonVenderMouseClicked

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal(air.getAsientosCantidad(), this.air);
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CancelarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelarTicket(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel BotonVender;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField NombreField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
