/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_lapangan;

import javax.swing.JOptionPane;
import koneksi.koneksiLury;

/**
 *
 * @author ASUS
 */
public class kelola_makanan extends javax.swing.JFrame {
     int isCreate,isUpdateAndisDelete = 0;
    koneksiLury con = new koneksiLury();
    String id_fooddrink;
    
     private void tampil(){
        con.tampil(jTable1, "SELECT * FROM makanan");
    }
    
    private void kondisiTextBox(boolean kondisi){
        txt_nama.setEditable(kondisi);
        txt_harga.setEditable(kondisi);
        txt_stok.setEditable(kondisi);
       
    }
    
     private void clear(){
        txt_nama.setText("");
        txt_harga.setText("");
        txt_stok.setText("");
    }
    
    private void kondisiAwal(){
        kondisiTextBox(false);
        id_fooddrink = null;
        txt_nama.setText("");
        txt_harga.setText("");
        txt_stok.setText("");
        tampil();
        clear();
        isUpdateAndisDelete = 0;
        isCreate = 0;
    }
    
   
    
      /**
     * Creates new form kelola_makanan
     */
 
    
 

    /**
     * Creates new form kelola_makanan
     */
    public kelola_makanan() {
        initComponents();
        kondisiAwal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_stok = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_create = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_stok.setBackground(new java.awt.Color(60, 128, 128));
        txt_stok.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_stok.setForeground(new java.awt.Color(255, 255, 255));
        txt_stok.setBorder(null);
        txt_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stokActionPerformed(evt);
            }
        });
        getContentPane().add(txt_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 200, 30));

        txt_harga.setBackground(new java.awt.Color(60, 128, 128));
        txt_harga.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_harga.setForeground(new java.awt.Color(255, 255, 255));
        txt_harga.setBorder(null);
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 200, 30));

        txt_nama.setBackground(new java.awt.Color(60, 128, 128));
        txt_nama.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama.setBorder(null);
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 200, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 260, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Kelola Makanan1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_back.setText("jButton1");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 30));

        btn_create.setText("jButton1");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 100, 40));

        btn_delete.setText("jButton2");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 100, 30));

        btn_update.setText("jButton3");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 100, 30));

        btn_save.setText("jButton4");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 100, 40));

        btn_cancel.setText("jButton5");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 100, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
       txt_nama.requestFocus();
    }//GEN-LAST:event_txt_namaActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        if (isUpdateAndisDelete == 0){
           switch (isCreate){
           case 0:
               isCreate +=1;
               JOptionPane.showMessageDialog(null, "Anda Memilih Create");
               kondisiTextBox(true);
               btn_update.setEnabled(false);
               btn_delete.setEnabled(false);
               isUpdateAndisDelete =0;
               break;
           case 1:
               JOptionPane.showMessageDialog(null, "error");
       }
           }else{
           JOptionPane.showMessageDialog(null, "Mweeqeqeqeqeq");
          
       }
        
       
    }//GEN-LAST:event_btn_createActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
    int result = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin melanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            con.Eksekusi("DELETE FROM `makanan` WHERE `id_fooddrink` LIKE '"+id_fooddrink +"'", "Anda berhasil menghapus data",0);
    System.out.println("Anda memilih Yes");
        } else {
    // jika user memilih No atau menutup dialog box
    System.out.println("Anda memilih No");
    
        }    
          kondisiAwal();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       if (isCreate != 0) {
            
            System.out.println(id_fooddrink);
            con.Eksekusi("INSERT INTO `makanan`( `nama`, `harga`, `stok`) VALUES ('"+ txt_nama.getText() +"','"+ txt_harga.getText() +"','"+ txt_stok.getText() +"')", "Berhasil Menyimpan",0);
            kondisiAwal();
        }                                      
    }//GEN-LAST:event_btn_saveActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        kondisiAwal();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
      int input = JOptionPane.showConfirmDialog(null," Apakah mau edit", "Warning", JOptionPane.OK_CANCEL_OPTION);
if (input==0) {
    try {
        String sql = "UPDATE makanan SET `nama` = '"+txt_nama.getText()+"', `harga` = '"+txt_harga.getText()+"', `stok` = '"+txt_stok.getText()+"'  WHERE id_fooddrink LIKE '"+ id_fooddrink +"'";
        con.Eksekusi(sql, "berhasil menyimpan", PROPERTIES);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
     kondisiAwal();
} else {
    JOptionPane.showMessageDialog(this,"Data Tidak di Edit");
}

    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
         txt_harga.requestFocus();
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stokActionPerformed
         txt_stok.requestFocus();
    }//GEN-LAST:event_txt_stokActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int id = jTable1.getSelectedRow();
      
      id_fooddrink = jTable1.getValueAt(id,0).toString();
      txt_nama.setText(jTable1.getValueAt(id, 1).toString());
      txt_harga.setText(jTable1.getValueAt(id, 2).toString());
      txt_stok.setText(jTable1.getValueAt(id,3).toString());
     
        kondisiTextBox(true);
        switch (isUpdateAndisDelete){
            case 0:
                isUpdateAndisDelete += 1;
                btn_delete.setEnabled(true);
                btn_update.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(kelola_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kelola_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kelola_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kelola_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kelola_makanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables

 

   
}
