
import java.awt.Dimension;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Te extends javax.swing.JFrame {

    FileOutputStream archi= null;
    PrintWriter pw;
    String cadena="";
    
    public Te() {
        initComponents();
        this.setSize(new Dimension(340,400));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TTe = new javax.swing.ButtonGroup();
        Titulo = new javax.swing.JLabel();
        TNegro = new javax.swing.JRadioButton();
        TVerde = new javax.swing.JRadioButton();
        TManzana = new javax.swing.JRadioButton();
        TLimon = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();
        PaginaPrincipal = new javax.swing.JButton();
        TextoTamaño = new javax.swing.JLabel();
        Tamaño = new javax.swing.JComboBox<>();
        VerificarOrden = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        Titulo.setText("TÉ");
        getContentPane().add(Titulo);
        Titulo.setBounds(127, 11, 34, 36);

        TTe.add(TNegro);
        TNegro.setText("Té Negro");
        getContentPane().add(TNegro);
        TNegro.setBounds(45, 83, 90, 23);

        TTe.add(TVerde);
        TVerde.setText("Té Verde");
        getContentPane().add(TVerde);
        TVerde.setBounds(45, 135, 90, 23);

        TTe.add(TManzana);
        TManzana.setText("Té de Manzana");
        TManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TManzanaActionPerformed(evt);
            }
        });
        getContentPane().add(TManzana);
        TManzana.setBounds(172, 83, 120, 23);

        TTe.add(TLimon);
        TLimon.setText("Té de Limón");
        getContentPane().add(TLimon);
        TLimon.setBounds(172, 135, 120, 23);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar);
        Aceptar.setBounds(50, 240, 71, 23);

        PaginaPrincipal.setText("Pagina Principal");
        PaginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(PaginaPrincipal);
        PaginaPrincipal.setBounds(140, 240, 120, 23);

        TextoTamaño.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextoTamaño.setText("Tañamo de té: ");
        getContentPane().add(TextoTamaño);
        TextoTamaño.setBounds(40, 190, 110, 20);

        Tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "........", "Pequeño", "Mediano", "Grande" }));
        getContentPane().add(Tamaño);
        Tamaño.setBounds(160, 190, 100, 20);

        VerificarOrden.setText("Verificar Orden");
        VerificarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(VerificarOrden);
        VerificarOrden.setBounds(80, 290, 130, 23);

        Imagen.setBackground(new java.awt.Color(255, 255, 255));
        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/té.jpg"))); // NOI18N
        Imagen.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Imagen.setMaximumSize(new java.awt.Dimension(600, 100));
        getContentPane().add(Imagen);
        Imagen.setBounds(0, 0, 320, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TManzanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TManzanaActionPerformed

    private void PaginaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaginaPrincipalActionPerformed
        // TODO add your handling code here:
           Cafeteria Ct =new Cafeteria();
           hide();
           Ct.setVisible(true);
    }//GEN-LAST:event_PaginaPrincipalActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
         int Precio = 0;
        String Tam = null;
   
        switch(Tamaño.getSelectedIndex())
          {
            case 1: Precio=25;
                    Tam="Pequeño";
            break;
            case 2: Precio=30;
                    Tam="Mediano";
            break;
            case 3: Precio=65;
                    Tam="Grande";
            break;
          }
    
         String NombreP = null;
         if(TNegro.isSelected())
         {
             NombreP="Té Negro";
         }
         if(TVerde.isSelected())
         {
             NombreP="Té Verde";
         }
         if(TManzana.isSelected())
         {
             NombreP="Té de Manzana";
         }
         if(TLimon.isSelected())
         {
             NombreP="Té de Limón";
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
            java.util.logging.Logger.getLogger(Te.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Te.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Te.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Te.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Te().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton PaginaPrincipal;
    private javax.swing.JRadioButton TLimon;
    private javax.swing.JRadioButton TManzana;
    private javax.swing.JRadioButton TNegro;
    private javax.swing.ButtonGroup TTe;
    private javax.swing.JRadioButton TVerde;
    private javax.swing.JComboBox<String> Tamaño;
    private javax.swing.JLabel TextoTamaño;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerificarOrden;
    // End of variables declaration//GEN-END:variables
}
