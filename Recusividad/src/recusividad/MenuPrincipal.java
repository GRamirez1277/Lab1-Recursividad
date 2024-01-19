/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recusividad;

/**
 *
 * @author aleja
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private PalindromoAir air;
    private Ticket[] asientosCantidad;
   
    public MenuPrincipal(Ticket[] asientosCantidadExternos, PalindromoAir airExterno) {
        asientosCantidad = asientosCantidadExternos != null ? asientosCantidadExternos : new Ticket[30];
        air = airExterno != null ? airExterno : new PalindromoAir();
       
        System.out.println("Menú Frame");
        for (int i = 0; i < asientosCantidad.length; i++) {
            if (asientosCantidad[i] != null) 
                System.out.println("Posición " + i + ": " + asientosCantidad[i].getNombrePasajero() + " - $. " + asientosCantidad[i].getTotalPagado());
        }
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonDespacharVuelo = new javax.swing.JLabel();
        BotonImprimirPasajeros = new javax.swing.JLabel();
        BotonCancelarTicket = new javax.swing.JLabel();
        BotonVenderTicket = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonDespacharVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonDespacharVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDespacharVueloMouseClicked(evt);
            }
        });
        jPanel1.add(BotonDespacharVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 290, 130));

        BotonImprimirPasajeros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonImprimirPasajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonImprimirPasajerosMouseClicked(evt);
            }
        });
        jPanel1.add(BotonImprimirPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 290, 130));

        BotonCancelarTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCancelarTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarTicketMouseClicked(evt);
            }
        });
        jPanel1.add(BotonCancelarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 290, 130));

        BotonVenderTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVenderTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVenderTicketMouseClicked(evt);
            }
        });
        jPanel1.add(BotonVenderTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 290, 130));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LAB1/MenuPrincipal.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void BotonVenderTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVenderTicketMouseClicked
        VenderTicket venderTicket = new VenderTicket(air.getAsientosCantidad(), air);
        venderTicket.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVenderTicketMouseClicked

    private void BotonCancelarTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarTicketMouseClicked
        CancelarTicket cancelarTicket = new CancelarTicket(air.getAsientosCantidad(), air);
        cancelarTicket.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonCancelarTicketMouseClicked

    private void BotonImprimirPasajerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonImprimirPasajerosMouseClicked
        ImprimirPasajeros imprimirPasajeros = new ImprimirPasajeros(air.getAsientosCantidad(), air);
        imprimirPasajeros.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonImprimirPasajerosMouseClicked

    private void BotonDespacharVueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDespacharVueloMouseClicked
        Dispatch dispatch = new Dispatch(air.getAsientosCantidad(), air);
        dispatch.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDespacharVueloMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonCancelarTicket;
    private javax.swing.JLabel BotonDespacharVuelo;
    private javax.swing.JLabel BotonImprimirPasajeros;
    private javax.swing.JLabel BotonVenderTicket;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}