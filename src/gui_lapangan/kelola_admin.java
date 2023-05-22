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
public class kelola_admin extends javax.swing.JFrame {
    int isCreate,isUpdateAndisDelete = 0;
    koneksiLury con = new koneksiLury();
    String id_admin;
    int idInTable;
    
    
    private void tampil(){
        con.tampil(jTable1, "SELECT * FROM admin");
    }
    
    private void kondisiTextBox(boolean kondisi){
        txt_nama_admin.setEditable(kondisi);
        txt_username.setEditable(kondisi);
        txt_password.setEditable(kondisi);
        jComboBox1.setEnabled(kondisi);
    }
    
    private void clear(){
        txt_nama_admin.setText("");
        txt_username.setText("");
        txt_password.setText("");
    }
    
    private void kondisiAwal(){
        kondisiTextBox(false);
        id_admin = null;
        txt_nama_admin.setText("");
        txt_username.setText("");
        txt_password.setText("");
        tampil();
        clear();
    }
    /**
     * Creates new form kelola_admin
     */
    public kelola_admin() {
        initComponents();
        tampil();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_username = new javax.swing.JTextField();
        txt_nama_admin = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txtRFID = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        kelola_admin = new javax.swing.JLabel();
        btn_create = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 330, 380));

        txt_username.setBackground(new java.awt.Color(60, 128, 128));
        txt_username.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setBorder(null);
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 260, 30));

        txt_nama_admin.setBackground(new java.awt.Color(60, 128, 128));
        txt_nama_admin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nama_admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama_admin.setBorder(null);
        txt_nama_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_adminActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 260, 30));

        txt_password.setBackground(new java.awt.Color(60, 128, 128));
        txt_password.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(null);
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 318, 260, 30));

        txtRFID.setBackground(new java.awt.Color(60, 128, 128));
        txtRFID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtRFID.setForeground(new java.awt.Color(255, 255, 255));
        txtRFID.setBorder(null);
        getContentPane().add(txtRFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 478, 260, 30));

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Owner" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 280, 30));

        kelola_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMIN_RFID.png"))); // NOI18N
        kelola_admin.setMaximumSize(new java.awt.Dimension(850, 552));
        kelola_admin.setMinimumSize(new java.awt.Dimension(850, 552));
        kelola_admin.setPreferredSize(new java.awt.Dimension(850, 552));
        getContentPane().add(kelola_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 840, 550));

        btn_create.setText("create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 100, 30));

        btn_save.setText("save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 100, 30));

        btn_cancel.setText("cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 100, 30));

        btn_back.setText("jButton1");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 30));

        btn_delete.setText("delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 90, 30));

        btn_update.setText("update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 90, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new owner().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
        txt_password.requestFocus();
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
       if (isUpdateAndisDelete == 0){
           switch (isCreate){
           case 0:
               isCreate +=1;
               JOptionPane.showMessageDialog(null, "Anda Memilih Create");
               kondisiTextBox(true);
               btn_update.setEnabled(false);
               btn_delete.setEnabled(false);
               break;
           case 1:
               JOptionPane.showMessageDialog(null, "Anda Telah Menekan Tombol Create");
       }
       }
    }//GEN-LAST:event_btn_createActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int id = jTable1.getSelectedRow();
      idInTable = id;
      
      id_admin = jTable1.getValueAt(id,0).toString();
      txt_username.setText(jTable1.getValueAt(id, 1).toString());
      txt_nama_admin.setText(jTable1.getValueAt(id, 2).toString());
      txt_password.setText(jTable1.getValueAt(id,3).toString());
      String jenisPekerjaan = jTable1.getValueAt(id, 4).toString();
      txtRFID.setText(jTable1.getValueAt(id,5).toString());
      switch (jenisPekerjaan){
          case "Admin":
              jComboBox1.setSelectedIndex(0);
              break;
          case "Owner":
              jComboBox1.setSelectedIndex(1);
      }
        kondisiTextBox(true);
        switch (isUpdateAndisDelete){
            case 0:
                isUpdateAndisDelete += 1;
                
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       
        if (isCreate != 0) {
            if (jComboBox1.getSelectedItem().equals("Admin")) {
                id_admin = con.primaryKey2("SELECT MAX(`id_admin`) AS max_id FROM admin WHERE id_admin LIKE '%A%'", "A", "A01");
            }else{
                 id_admin = con.primaryKey2("SELECT MAX(`id_admin`) AS max_id FROM admin WHERE id_admin LIKE '%P%'", "P", "P01");
            }
            System.out.println(id_admin);
            con.Eksekusi("INSERT INTO `admin`(`id_admin`, `nama_admin`, `username`, `password`, `jenis_pekerjaan`, `RFID`) VALUES ('"+ id_admin +"','"+ txt_username.getText() +"','"+ txt_nama_admin.getText() +"','"+ txt_password.getText() +"','"+ jComboBox1.getSelectedItem() +"','"+ txtRFID.getText() +"')", "Berhasil Menyimpan",0);
            kondisiAwal();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        kondisiAwal();
        isCreate = 0;
        isUpdateAndisDelete = 0;
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_nama_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_adminActionPerformed
       txt_username.requestFocus();
    }//GEN-LAST:event_txt_nama_adminActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
     int result = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin melanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            con.Eksekusi("DELETE FROM `admin` WHERE `id_admin` LIKE '"+ id_admin +"'", "Anda berhasil menghapus data",0);
    System.out.println("Anda memilih Yes");
        } else {
    // jika user memilih No atau menutup dialog box
    System.out.println("Anda memilih No");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       String id_admin_baru = null;
        String jenisPekerjaanLama = jTable1.getValueAt(idInTable,4).toString();
       String jenisPekerjaanBaru = jComboBox1.getSelectedItem().toString();
        if (!jenisPekerjaanLama.equals(jenisPekerjaanBaru)){
            switch (jenisPekerjaanBaru){
                case "Admin":
                    id_admin_baru = con.primaryKey2("SELECT MAX(`id_admin`) AS max_id FROM admin WHERE id_admin LIKE '%A%'", "A", "A01");
                    break;
                case "Pegawai":
                    id_admin_baru = con.primaryKey2("SELECT MAX(`id_admin`) AS max_id FROM admin WHERE id_admin LIKE '%P%'", "P", "P01"); 
            }
            con.Eksekusi("DELETE FROM admin WHERE id_admin LIKE '"+ id_admin +"'", "", 1);
            con.Eksekusi("INSERT INTO `admin`(`id_admin`, `nama_admin`, `username`, `password`, `jenis_pekerjaan`, `RFID`) VALUES ('"+ id_admin_baru +"','"+ txt_nama_admin.getText() +"','"+ txt_username.getText() +"','"+ txt_password.getText() +"','"+ jComboBox1.getSelectedItem() +"','"+ txtRFID.getText() +"')", "Berhasil Mengubah Data", 1);
        }else{
            con.Eksekusi("UPDATE `admin` SET `nama_admin`='"+ txt_nama_admin.getText() +"',`username`='"+ txt_username.getText() +"',`password`='"+ txt_password.getText() +"', `RFID` = '"+ txtRFID.getText() +"' WHERE `id_admin` LIKE '"+ id_admin +"'", "Berhasil Mengubah Data", 1);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(kelola_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kelola_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kelola_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kelola_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kelola_admin().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kelola_admin;
    private javax.swing.JTextField txtRFID;
    private javax.swing.JTextField txt_nama_admin;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
