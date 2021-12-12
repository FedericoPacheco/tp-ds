/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Container;

/**
 *
 * @author Nahuel Riquelme
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Container previousPane;
    public static final int PANE_MENU_PRINCIPAL = 0;
    public static final int PANE_GESTIONAR_PASAJEROS = 1;
    public static final int PANE_DAR_ALTA_PASAJERO = 2;
    public static final int PANE_OCUPAR_HABITACION = 3;
    public static final int PANE_MOSTRAR_ESTADO_HABIACION  = 4;
    public static final int PANE_SELECCIONAR_RESPONSABLE = 4;
    public static final int PANE_FACTURAR = 5;
    public static final int PANE_DAR_ALTA_RESPONSABLE = 6;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }
    
    public void cambiarPanel(int panel){
        previousPane = this.getContentPane();
        switch(panel){
            case PANE_MENU_PRINCIPAL:
                this.setContentPane(new PanelMenuPrincipal(this));
                this.setTitle("Menú principal");
                this.pack();
                this.setLocationRelativeTo(null);
                break;
            case PANE_GESTIONAR_PASAJEROS:
                this.setContentPane(new PanelGestionarPasajeros(this));
                this.setTitle("Gestionar pasajeros");
                break;
            case PANE_DAR_ALTA_PASAJERO:
                this.setContentPane(new PanelDarAltaPasajero(this));
                this.setTitle("Dar alta pasajero");
                break;
            case PANE_OCUPAR_HABITACION:
                this.setContentPane(new interfaces.mostrarEstadoHabitacion.PanelMostrarEstadoHabitacion(this,false));
                this.setTitle("Estado de las habitaciones");
                this.pack();
                this.setLocationRelativeTo(null);
                break;
            case PANE_SELECCIONAR_RESPONSABLE:
                this.setContentPane(new PanelSeleccionarResponsable(this));
                this.setTitle("Seleccionar Responsable");
                break;
        }
        this.getContentPane().setVisible(false);
        this.getContentPane().setVisible(true);
    }

    public Container getPreviousPane() {
        return previousPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            VentanaPrincipal frame = new VentanaPrincipal();
            frame.setVisible(true);
            frame.setTitle("Hotel Premier");
            frame.setLocationRelativeTo(null);
            frame.cambiarPanel(0);      
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
