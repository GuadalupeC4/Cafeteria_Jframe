
import java.awt.Color;
import java.awt.Dimension;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Cafes extends javax.swing.JFrame {
    FileOutputStream archi= null;
    PrintWriter pw;
    String cadena="";

    
    public Cafes() {
        initComponents();
        this.setSize(new Dimension(320,390));
       

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TCafes = new javax.swing.ButtonGroup();
        Titulo = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        TextoTamaño = new javax.swing.JLabel();
        Tamaño = new javax.swing.JComboBox<>();
        VerificarOrden = new javax.swing.JButton();
        PaginaPrincipal = new javax.swing.JButton();
        Late = new javax.swing.JRadioButton();
        Cappuccino = new javax.swing.JRadioButton();
        CafeConLeche = new javax.swing.JRadioButton();
        Americano = new javax.swing.JRadioButton();
        Espresso = new javax.swing.JRadioButton();
        Moka = new javax.swing.JRadioButton();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("CAFES");
        getContentPane().add(Titulo);
        Titulo.setBounds(90, 10, 92, 25);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar);
        Aceptar.setBounds(61, 258, 71, 23);

        TextoTamaño.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoTamaño.setText("Tamaño del cafe :");
        getContentPane().add(TextoTamaño);
        TextoTamaño.setBounds(30, 200, 110, 20);

        Tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "........", "Pequeño", "Mediano", "Grande " }));
        getContentPane().add(Tamaño);
        Tamaño.setBounds(150, 200, 90, 20);

        VerificarOrden.setText("Verifivar Orden");
        VerificarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(VerificarOrden);
        VerificarOrden.setBounds(90, 300, 120, 23);

        PaginaPrincipal.setText("Pagina Pincipal");
        PaginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(PaginaPrincipal);
        PaginaPrincipal.setBounds(152, 258, 103, 23);

        TCafes.add(Late);
        Late.setText("Late");
        Late.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LateActionPerformed(evt);
            }
        });
        getContentPane().add(Late);
        Late.setBounds(40, 60, 60, 23);

        TCafes.add(Cappuccino);
        Cappuccino.setText("Cappuccino");
        getContentPane().add(Cappuccino);
        Cappuccino.setBounds(160, 60, 100, 23);

        TCafes.add(CafeConLeche);
        CafeConLeche.setText("Cafe con Leche");
        CafeConLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CafeConLecheActionPerformed(evt);
            }
        });
        getContentPane().add(CafeConLeche);
        CafeConLeche.setBounds(160, 140, 110, 23);

        TCafes.add(Americano);
        Americano.setText("Americano");
        getContentPane().add(Americano);
        Americano.setBounds(40, 140, 90, 23);

        TCafes.add(Espresso);
        Espresso.setText("Espresso");
        getContentPane().add(Espresso);
        Espresso.setBounds(40, 100, 90, 23);

        TCafes.add(Moka);
        Moka.setText("Moka");
        getContentPane().add(Moka);
        Moka.setBounds(160, 100, 60, 23);

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cafeina_2.jpeg"))); // NOI18N
        Imagen.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Imagen);
        Imagen.setBounds(0, 0, 300, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CafeConLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CafeConLecheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CafeConLecheActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
     
        int Precio = 0;
        String Tam = null;
   
        switch(Tamaño.getSelectedIndex())
          {
            case 1: Precio=30;
                    Tam="Pequeño";
            break;
            case 2: Precio=40;
                    Tam="Mediano";
            break;
            case 3: Precio=50;
                    Tam="Grande";
            break;
          }
    
         String NombreP = null;
         if(Late.isSelected())
         {
             NombreP="Late";
         }
         if(Espresso.isSelected())
         {
             NombreP="Espresso";
         }
         if(Americano.isSelected())
         {
             NombreP="Americano";
         }
         if(Cappuccino.isSelected())
         {
             NombreP="Cappuccino";
         }
         if(Moka.isSelected())
         {
             NombreP="Moka";
         }
         if(CafeConLeche.isSelected())
         {
             NombreP="Cafe Con Leche";
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

    private void VerificarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarOrdenActionPerformed
        // TODO add your handling code here:
        Verificacion_Orden vo =new Verificacion_Orden();
        hide();
        vo.setVisible(true);
    }//GEN-LAST:event_VerificarOrdenActionPerformed

    private void LateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LateActionPerformed

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
            java.util.logging.Logger.getLogger(Cafes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton Americano;
    private javax.swing.JRadioButton CafeConLeche;
    private javax.swing.JRadioButton Cappuccino;
    private javax.swing.JRadioButton Espresso;
    private javax.swing.JLabel Imagen;
    private javax.swing.JRadioButton Late;
    private javax.swing.JRadioButton Moka;
    private javax.swing.JButton PaginaPrincipal;
    private javax.swing.ButtonGroup TCafes;
    private javax.swing.JComboBox<String> Tamaño;
    private javax.swing.JLabel TextoTamaño;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerificarOrden;
    // End of variables declaration//GEN-END:variables
}
