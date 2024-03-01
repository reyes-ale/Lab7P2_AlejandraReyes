/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_alejandrareyes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.spi.DirectoryManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author aleja
 */
public class CSV extends javax.swing.JFrame {

    /**
     * Creates new form CSV
     */
    public CSV() {
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

        popup_jtree = new javax.swing.JPopupMenu();
        jmi_loadFile = new javax.swing.JMenuItem();
        jmi_refresh = new javax.swing.JMenuItem();
        popup_table = new javax.swing.JPopupMenu();
        jmi_clear = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        tf_commandline = new javax.swing.JTextField();
        bt_enter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtree_archivosCSV = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_tablaProductos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_newFile = new javax.swing.JMenuItem();
        jmi_importFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jm_clear = new javax.swing.JMenu();
        jmi_clearCommandL = new javax.swing.JMenuItem();
        jmi_clearTable = new javax.swing.JMenuItem();
        jmi_refreshTrees = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmi_productStructure = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jmi_loadFile.setText("Load File");
        jmi_loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loadFileActionPerformed(evt);
            }
        });
        popup_jtree.add(jmi_loadFile);

        jmi_refresh.setText("Refresh Trees");
        jmi_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_refreshActionPerformed(evt);
            }
        });
        popup_jtree.add(jmi_refresh);

        jmi_clear.setText("Clear Table\n");
        popup_table.add(jmi_clear);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bt_enter.setText("Enter");
        bt_enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_enterMouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Archivos CSV");
        jtree_archivosCSV.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtree_archivosCSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtree_archivosCSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtree_archivosCSV);

        jtable_tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "name", "category", "price", "aisle", "bin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtable_tablaProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_commandline, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_commandline, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jmi_newFile.setText("New File");
        jMenu1.add(jmi_newFile);

        jmi_importFile.setText("Import File");
        jMenu1.add(jmi_importFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Window");

        jm_clear.setText("Clear");

        jmi_clearCommandL.setText("Clear Command Line");
        jm_clear.add(jmi_clearCommandL);

        jmi_clearTable.setText("Clear Table");
        jm_clear.add(jmi_clearTable);

        jMenu2.add(jm_clear);

        jmi_refreshTrees.setText("Refresh Trees");
        jmi_refreshTrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_refreshTreesActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_refreshTrees);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jmi_productStructure.setText("Product Structure");
        jMenu3.add(jmi_productStructure);

        jMenuItem7.setText("Commands");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_refreshTreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_refreshTreesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_refreshTreesActionPerformed

    private void bt_enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_enterMouseClicked
        //./create archivo.txt -single
        DefaultTableModel tabla = (DefaultTableModel) jtable_tablaProductos.getModel();
        String comando [] = tf_commandline.getText().split(" ");
       
        
        if (comando[0].equals("./create") && comando[2].equals("-single") && tabla != null){
            try{
                administrarProd ap = new administrarProd("./"+comando[1]);
                ap.cargarArchivo();
                
                int id=0,category=0,aisle=0,bin=0;
                String nombre="";
                double price=0;
                
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    for (int j = 0; j < tabla.getColumnCount(); j++) {
                        if (tabla.getValueAt(i, j) != null) {
                            if (j == 0) {
                                id = (Integer) tabla.getValueAt(i, j);
                            } else if (j == 1) {
                                nombre = (String) tabla.getValueAt(i, j);
                            } else if (j == 2) {
                                category = (Integer) tabla.getValueAt(i, j);

                            } else if (j == 3) {
                               price = (Double) tabla.getValueAt(i, j);
                            }
                             else if (j == 4) {
                                aisle = (Integer) tabla.getValueAt(i, j);
                            }
                         else if (j == 5) {
                             bin = (Integer) tabla.getValueAt(i, j);

                            }
                        }
                        
                    }
                    
                    Producto p = new Producto(id, category, aisle, bin, nombre, price);
                    System.out.println(p);
                    ap.getListaProductos().add(p);
                }
                
                ap.escribirArchivo();
                JOptionPane.showMessageDialog(this, "archivo creado exitosamente");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else  if (comando[0].equals("./load") ){
                int cont =0;
            
                FileReader fr= null;
                BufferedReader br =null;
                File f= null;
                
                try {
                 f = new File(comando[1]);
                 if (f.exists()){
                     fr = new FileReader(f);
                     br = new BufferedReader(fr);
                     String linea = "";
                     while  ((linea=br.readLine()) != null){
                         if (cont==0){
                             String titulos [] = linea.split(",");
                             tabla.addColumn(titulos);
                             cont++;
                         }
                         else{
                             Object productos [] = linea.split(",");
                             tabla.addRow(productos);
                         }
                     }
                     jtable_tablaProductos.setModel(tabla);
                 br.close();
                 fr.close();
                     
                 }
                
                 else {
                     JOptionPane.showMessageDialog(this, "Este archivo no existe");
                 }
            } catch (Exception e) {
                e.printStackTrace();
            }
               
        }
        else  if (comando[0].equals("./clear") ){
            for (int i = 0; i < tabla.getRowCount(); i++) {
                for (int j = 0; j < tabla.getColumnCount(); j++) {
                    tabla.setValueAt(" ", i, j);
                }
            }
            
            jtable_tablaProductos.setModel(tabla);
        }
        else  if (comando[0].equals("./refresh") ){
            DefaultTreeModel arbol = (DefaultTreeModel) jtree_archivosCSV.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arbol.getRoot();
            
            
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode)arbol.getRoot();
            
            
            
            
            //raiz.add()
        }
        
        
    }//GEN-LAST:event_bt_enterMouseClicked

    private void jtree_archivosCSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtree_archivosCSVMouseClicked
        
            if (evt.isMetaDown()) {
             popup_jtree.show(evt.getComponent(), evt.getX(), evt.getY());
            }
    }//GEN-LAST:event_jtree_archivosCSVMouseClicked

    private void jmi_loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loadFileActionPerformed
        //popuploadfile
    }//GEN-LAST:event_jmi_loadFileActionPerformed

    private void jmi_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_refreshActionPerformed
       //popuprefreshtrees
    }//GEN-LAST:event_jmi_refreshActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(CSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enter;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jm_clear;
    private javax.swing.JMenuItem jmi_clear;
    private javax.swing.JMenuItem jmi_clearCommandL;
    private javax.swing.JMenuItem jmi_clearTable;
    private javax.swing.JMenuItem jmi_importFile;
    private javax.swing.JMenuItem jmi_loadFile;
    private javax.swing.JMenuItem jmi_newFile;
    private javax.swing.JMenuItem jmi_productStructure;
    private javax.swing.JMenuItem jmi_refresh;
    private javax.swing.JMenuItem jmi_refreshTrees;
    private javax.swing.JTable jtable_tablaProductos;
    private javax.swing.JTree jtree_archivosCSV;
    private javax.swing.JPopupMenu popup_jtree;
    private javax.swing.JPopupMenu popup_table;
    private javax.swing.JTextField tf_commandline;
    // End of variables declaration//GEN-END:variables
}
