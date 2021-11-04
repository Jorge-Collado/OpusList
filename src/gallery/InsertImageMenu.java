/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gallery;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Georgeus
 */
public class InsertImageMenu extends javax.swing.JDialog {
private final MainForm mainForm = (MainForm) this.getParent();
private JFileChooser fileChooser;
private String imagePath = System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\TaBien.jpg";
private String imageName;
    /**
     * Creates new form InsertImageMenu
     */
    public InsertImageMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        txtRegistro = new javax.swing.JTextField();
        lblRegistre = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblFormato = new javax.swing.JLabel();
        txtFormato = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        txtImagen = new javax.swing.JTextField();
        btnInsertarImagen = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        txtAutor = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRegistre.setText("Registre");

        lblTitulo.setText("Titulo");

        lblYear.setText("Año");

        lblFormato.setText("Formato");

        lblImagen.setText("Imagen");

        btnInsertarImagen.setText("Añadir imagen");
        btnInsertarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarImagenActionPerformed(evt);
            }
        });

        btnInsert.setText("Insertar");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        lblAutor.setText("Autor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblYear)
                                .addComponent(lblTitulo)
                                .addComponent(lblRegistre)
                                .addComponent(txtRegistro)
                                .addComponent(txtTitulo)
                                .addComponent(txtYear)
                                .addComponent(lblFormato)
                                .addComponent(txtFormato)
                                .addComponent(txtAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addComponent(lblAutor))
                        .addGap(47, 47, 47)
                        .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 139, Short.MAX_VALUE)
                        .addComponent(btnInsertarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagen)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRegistre)
                        .addGap(4, 4, 4)
                        .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblYear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFormato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(lblImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnInsertarImagen)
                    .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarImagenActionPerformed
        fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        int returnOption = fileChooser.showOpenDialog(this);
        if (returnOption == JFileChooser.APPROVE_OPTION){
            imagePath = fileChooser.getSelectedFile().getAbsolutePath();
            imageName = fileChooser.getSelectedFile().getName();
            txtImagen.setText(imageName);
            try{
            BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
            ImageIcon icon = new ImageIcon(bufferedImage);
            lblFoto.setIcon(resizeImageIcon(bufferedImage, lblFoto.getWidth(), lblFoto.getHeight()));
            }catch(IOException ioe){
            ioe.printStackTrace();
                    }
        }
        txtImagen.setEditable(false);
    }//GEN-LAST:event_btnInsertarImagenActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        mainForm.obrasListModel.clear();
        
        Obra o = new Obra();
        o.setTitol(txtTitulo.getText());
        o.setAny(txtYear.getText());
        o.setAutor(txtAutor.getText());
        o.setFormat(txtFormato.getText());
        o.setRegistre(txtRegistro.getText());
        
        try{
            BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
            String output = System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\" + imageName;
            File outputImage = new File(output);
            ImageIO.write(bufferedImage, "jpg", outputImage);
            o.setImatge(imageName);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        
        mainForm.obras.add(o);
        
        for (Obra ob : mainForm.obras) {
                mainForm.obrasListModel.addElement(ob);
            }
            mainForm.lstImages.setModel(mainForm.obrasListModel);
                
        dispose();
    }//GEN-LAST:event_btnInsertActionPerformed

    private ImageIcon resizeImageIcon (BufferedImage originalImage, int desiredWidth, int desiredHeight) {
        int newHeight = 0;    
        int newWidth = 0;
        float aspectRatio = (float)originalImage.getWidth() / originalImage.getHeight();
        if (originalImage.getWidth() > originalImage.getHeight()) {
            newWidth = desiredWidth;
            newHeight = Math.round( desiredWidth / aspectRatio);                
        }
        else {
            newHeight = desiredHeight;
            newWidth = Math.round(desiredHeight * aspectRatio);
        }
        Image resultingImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        ImageIcon imageIcon = new ImageIcon(outputImage);
        return imageIcon;
    }
    
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
            java.util.logging.Logger.getLogger(InsertImageMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertImageMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertImageMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertImageMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InsertImageMenu dialog = new InsertImageMenu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsertarImagen;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblRegistre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtFormato;
    private javax.swing.JTextField txtImagen;
    private javax.swing.JTextField txtRegistro;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
