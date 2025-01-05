
import java.awt.Dimension;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Frappes extends javax.swing.JFrame {
    FileOutputStream archi= null;
    PrintWriter pw;
    String cadena="";
    
    public Frappes() {
        initComponents();
        this.setSize(new Dimension(370,470));

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tFrappes = new javax.swing.ButtonGroup();
        Titulo = new javax.swing.JLabel();
        FOreo = new javax.swing.JRadioButton();
        FVainilla = new javax.swing.JRadioButton();
        FCajeta = new javax.swing.JRadioButton();
        FCappuccino = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();
        PaginaPrincipal = new javax.swing.JButton();
        TextoTamaño = new javax.swing.JLabel();
        Tamaño = new javax.swing.JComboBox<>();
        VerificarOrden = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Titulo.setText("FRAPPES");
        getContentPane().add(Titulo);
        Titulo.setBounds(120, 50, 127, 25);

        tFrappes.add(FOreo);
        FOreo.setText("Frappe Oreo");
        getContentPane().add(FOreo);
        FOreo.setBounds(60, 120, 100, 23);

        tFrappes.add(FVainilla);
        FVainilla.setText("Frappe Vainilla");
        FVainilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FVainillaActionPerformed(evt);
            }
        });
        getContentPane().add(FVainilla);
        FVainilla.setBounds(60, 180, 100, 23);

        tFrappes.add(FCajeta);
        FCajeta.setText("Frappe Cajeta");
        getContentPane().add(FCajeta);
        FCajeta.setBounds(190, 120, 130, 23);

        tFrappes.add(FCappuccino);
        FCappuccino.setText("Frappe Cappuccino");
        getContentPane().add(FCappuccino);
        FCappuccino.setBounds(190, 180, 130, 23);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar);
        Aceptar.setBounds(80, 300, 71, 23);

        PaginaPrincipal.setText("Pagina Principal");
        PaginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(PaginaPrincipal);
        PaginaPrincipal.setBounds(190, 300, 107, 23);

        TextoTamaño.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoTamaño.setText("Tamaño de Frappes: ");
        getContentPane().add(TextoTamaño);
        TextoTamaño.setBounds(60, 250, 130, 14);

        Tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "........", "Pequeño", "Mediano", "Grande" }));
        Tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamañoActionPerformed(evt);
            }
        });
        getContentPane().add(Tamaño);
        Tamaño.setBounds(190, 250, 90, 20);

        VerificarOrden.setText("Verificar Orden");
        VerificarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(VerificarOrden);
        VerificarOrden.setBounds(110, 360, 140, 23);

        Imagen.setBackground(new java.awt.Color(0, 0, 0));
        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frappes.jpg"))); // NOI18N
        getContentPane().add(Imagen);
        Imagen.setBounds(0, 0, 360, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FVainillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FVainillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FVainillaActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        int Precio=0;
        String Tam = null;
        switch(Tamaño.getSelectedIndex())
                    {
                    case 1: Precio=30;
                            Tam="Pequeño";
                    break;
                    case 2: Precio=45;
                            Tam="Mediano";
                    break;
                    case 3: Precio=65;
                            Tam="Grande";
                    break;
                    }
        
        String NombreP = null;
         if(FOreo.isSelected())
         {
             NombreP="Frappes Oreo";
         }
         if(FVainilla.isSelected())
         {
             NombreP="Frappes Vainilla";
         }
         if(FCajeta.isSelected())
         {
             NombreP="Frappes Cajeta";
         }
         if(FCappuccino.isSelected())
         {
             NombreP="Frappes Cappuccino";
         }
      
        
       cadena=cadena+"\nNombre de la bebida: "+NombreP+"\nTamaño de la bebida: "+Tam+"\nCosto de la bebida: $"+Precio;
       FileOutputStream fos=null;
       PrintWriter pw;
        try{
              fos=new FileOutputStream("Cafeteria.txt",true);
           }catch(IOException ex){
           }
            cadena=cadena+"\n";
            pw=new PrintWriter(fos);
            pw.write(cadena);
            pw.close();
          try{
               fos.close();
             }catch(IOException ex){
                   
            }
    }//GEN-LAST:event_AceptarActionPerformed

    private void PaginaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaginaPrincipalActionPerformed
        // TODO add your handling code here:
           Cafeteria Ct =new Cafeteria();
             hide();
             Ct.setVisible(true);
    }//GEN-LAST:event_PaginaPrincipalActionPerformed

    private void TamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TamañoActionPerformed

    private void VerificarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarOrdenActionPerformed
        // TODO add your handling code here:
        Verificacion_Orden vo =new Verificacion_Orden();
        hide();
        vo.setVisible(true);
      
    }//GEN-LAST:event_VerificarOrdenActionPerformed

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
            java.util.logging.Logger.getLogger(Frappes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frappes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frappes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frappes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frappes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton FCajeta;
    private javax.swing.JRadioButton FCappuccino;
    private javax.swing.JRadioButton FOreo;
    private javax.swing.JRadioButton FVainilla;
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton PaginaPrincipal;
    private javax.swing.JComboBox<String> Tamaño;
    private javax.swing.JLabel TextoTamaño;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerificarOrden;
    private javax.swing.ButtonGroup tFrappes;
    // End of variables declaration//GEN-END:variables
}
