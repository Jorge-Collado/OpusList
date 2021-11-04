/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gallery;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.UIManager;

/**
 *
 * @author Georgeus
 */
public class MainForm extends javax.swing.JFrame {
private static final java.lang.reflect.Type LIST_OF_OBRA_TYPE = new TypeToken<List<Obra>>() {}.getType();
ArrayList<Obra> obras = new ArrayList();
public JList<Obra> lstImages;
public DefaultListModel<Obra> obrasListModel;


    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        lstImages = new JList();
        jScrollPane1.setViewportView(lstImages);
        lstImages.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstImagesValueChanged(evt);
            }
        });
        lstImages.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                lstImagesMouseClicked(evt);
            }
        });

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mnuMainForm = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniCreate = new javax.swing.JMenuItem();
        mniReview = new javax.swing.JMenuItem();
        mniUpdate = new javax.swing.JMenuItem();
        mniDelete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                MainForm.this.windowOpened(evt);
            }
        });

        jMenu1.setText("CRUD");

        mniCreate.setText("Create");
        mniCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCreateActionPerformed(evt);
            }
        });
        jMenu1.add(mniCreate);

        mniReview.setText("Review");
        jMenu1.add(mniReview);

        mniUpdate.setText("Update");
        mniUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUpdateActionPerformed(evt);
            }
        });
        jMenu1.add(mniUpdate);

        mniDelete.setText("Delete");
        mniDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDeleteActionPerformed(evt);
            }
        });
        jMenu1.add(mniDelete);

        mnuMainForm.add(jMenu1);

        jMenu2.setText("Save");
        mnuMainForm.add(jMenu2);

        setJMenuBar(mnuMainForm);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void windowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowOpened
       Gson gson = new Gson();
       obrasListModel = new DefaultListModel<Obra>();
        try {
            JsonReader reader = new JsonReader(new FileReader(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\data\\obres.json"));
            obras = gson.fromJson(reader, LIST_OF_OBRA_TYPE);
            for (Obra o: obras) {
                obrasListModel.addElement(o);
            }
            lstImages.setModel(obrasListModel);
        }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

       
    }//GEN-LAST:event_windowOpened

    private void mniUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUpdateActionPerformed
        EditImageMenu preEditImage = new EditImageMenu(this, true);
        preEditImage.setVisible(true);
        
    }//GEN-LAST:event_mniUpdateActionPerformed

    private void mniCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCreateActionPerformed
        InsertImageMenu insertImageMenu = new InsertImageMenu(this, true);
        insertImageMenu.setVisible(true);
    }//GEN-LAST:event_mniCreateActionPerformed

    private void mniDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDeleteActionPerformed
        DeleteImageMenu deleteImageMenu = new DeleteImageMenu(this, true);
        deleteImageMenu.setVisible(true);
    }//GEN-LAST:event_mniDeleteActionPerformed

    private void lstImagesValueChanged(javax.swing.event.ListSelectionEvent evt){
        
    }
    
    private void lstImagesMouseClicked(java.awt.event.MouseEvent evt){
        if (evt.getClickCount() == 2) {
            EditImage editImage = new EditImage(this, true);
            editImage.setVisible(true);
        }
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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
            
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mniCreate;
    private javax.swing.JMenuItem mniDelete;
    private javax.swing.JMenuItem mniReview;
    private javax.swing.JMenuItem mniUpdate;
    private javax.swing.JMenuBar mnuMainForm;
    // End of variables declaration//GEN-END:variables
}
