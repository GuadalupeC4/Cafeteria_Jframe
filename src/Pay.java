
import java.awt.Dimension;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Pay extends javax.swing.JFrame {
    FileOutputStream archi= null;
    PrintWriter pw;
    String cadena="";
    
    public Pay() {        

        initComponents();
        this.setSize(new Dimension(340,400));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TPay = new javax.swing.ButtonGroup();
        Titulo = new javax.swing.JLabel();
        PQueso = new javax.swing.JRadioButton();
        PLimon = new javax.swing.JRadioButton();
        PZarzamora = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();
        PaginaPrincipal = new javax.swing.JButton();
        VerificarOrden = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        Titulo.setText("PAY");
        getContentPane().add(Titulo);
        Titulo.setBounds(121, 11, 56, 25);

        TPay.add(PQueso);
        PQueso.setText("Pay de Queso");
        getContentPane().add(PQueso);
        PQueso.setBounds(94, 67, 120, 23);

        TPay.add(PLimon);
        PLimon.setText("Pay de Limón");
        getContentPane().add(PLimon);
        PLimon.setBounds(94, 108, 120, 23);

        TPay.add(PZarzamora);
        PZarzamora.setText("Pay de Zarzamora");
        getContentPane().add(PZarzamora);
        PZarzamora.setBounds(94, 149, 130, 23);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar);
        Aceptar.setBounds(52, 198, 71, 23);

        PaginaPrincipal.setText("Pagina Principal");
        PaginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(PaginaPrincipal);
        PaginaPrincipal.setBounds(160, 198, 120, 23);

        VerificarOrden.setText("Verificar Orden ");
        VerificarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(VerificarOrden);
        VerificarOrden.setBounds(90, 250, 130, 23);

        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pay.png"))); // NOI18N
        getContentPane().add(Imagen);
        Imagen.setBounds(0, 0, 330, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        int Precio=0;
        String Tam = null;
        String NombreP = null; 
        
        if(PQueso.isSelected())
        {
            Precio=30; 
            NombreP="Pay de queso";
        }
        if(PLimon.isSelected())
        {
            Precio=30;
            NombreP="Pay de limon";
        }
        if(PZarzamora.isSelected())
        {
            Precio=35;
            NombreP="Pay de zarzamora";
        }
        
       cadena=cadena+"\nNombre del Postre: "+NombreP+"\nCosto del Postre: $"+Precio;
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
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel Imagen;
    private javax.swing.JRadioButton PLimon;
    private javax.swing.JRadioButton PQueso;
    private javax.swing.JRadioButton PZarzamora;
    private javax.swing.JButton PaginaPrincipal;
    private javax.swing.ButtonGroup TPay;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerificarOrden;
    // End of variables declaration//GEN-END:variables
}
