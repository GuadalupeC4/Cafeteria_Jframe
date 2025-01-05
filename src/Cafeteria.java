
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Cafeteria extends javax.swing.JFrame {
  //private Dimension tamañoPantalla;
 // private Rectangle pantalla;
    FileOutputStream Datos= null;
    PrintWriter pw;
    String cadena="";

    public Cafeteria() {
        initComponents();
       
       /* tamañoPantalla= Toolkit.getDefaultToolkit().getScreenSize();
        pantalla=new Rectangle(tamañoPantalla); 
        setBounds(pantalla);*/
       this.setSize(new Dimension(626,490));
        Image img= new ImageIcon("icono_cafeteria.jpg").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_SMOOTH));
       // jLabel1.setIcon(img2);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Bebidas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Postres = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        NomCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tekton Pro Cond", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CAFETERIA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 40, 190, 50);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 80, 60, 30);

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 300, 100, 30);

        Bebidas.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Bebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "........", "Cafes", "Frappes", "Té", "Jugo" }));
        Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BebidasActionPerformed(evt);
            }
        });
        getContentPane().add(Bebidas);
        Bebidas.setBounds(460, 130, 90, 25);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bebidas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 130, 70, 20);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Postres");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 180, 70, 25);

        Postres.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Postres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "........", "Galletas", "Pasteles", "Pay" }));
        Postres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostresActionPerformed(evt);
            }
        });
        getContentPane().add(Postres);
        Postres.setBounds(460, 180, 90, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre de Clinete:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 230, 140, 17);
        getContentPane().add(NomCliente);
        NomCliente.setBounds(360, 250, 200, 30);

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_cafeteria.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -110, 626, 556);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        switch(Bebidas.getSelectedIndex())
        {
            case 0:         
                break;
            case 1:
                Cafes Cf =new Cafes();
                hide();
                Cf.setVisible(true);
                break;
            case 2:
                Frappes Fr= new Frappes();
                hide();
                Fr.setVisible(true);
                break;
            case 3:
                Te T=new Te();
                hide();
                T.setVisible(true);
                break;
            case 4:
                Jugos J=new Jugos();
                hide();
                J.setVisible(true);
                break; 
        }
        switch(Postres.getSelectedIndex())
        {
            case 0:         
                break;
            case 1:
                Galletas G =new Galletas();
                hide();
                G.setVisible(true);
                break;
            case 2:
                Pasteles Pas= new Pasteles();
                hide();
                Pas.setVisible(true);
                break;
            case 3:
                Pay Py=new Pay();
                hide();
                Py.setVisible(true);
                break;          
        }
       cadena=cadena+"\n\rORDEN\n"+"Nombre del Cliente: "+NomCliente.getText();
      
        try{
              Datos=new FileOutputStream("Cafeteria.txt",true);             
           }catch(IOException ex){
              
           }
            cadena=cadena;
            pw=new PrintWriter(Datos);
            pw.write(cadena);
            pw.close();
          try{
               Datos.close();
             }catch(IOException ex){
                    
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BebidasActionPerformed
        // TODO add your handling code here:
        //Menu.setVisible(false);
    }//GEN-LAST:event_BebidasActionPerformed

    private void PostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PostresActionPerformed

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
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafeteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bebidas;
    private javax.swing.JTextField NomCliente;
    private javax.swing.JComboBox<String> Postres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
