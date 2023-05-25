package gui_lapangan;



import javax.swing.JOptionPane;
import koneksi.koneksiLury;
/**
 *
 * @author LAPTOP
 */
public class kelola_lapangan extends javax.swing.JFrame {
    int isCreate,isUpdateAndisDelete = 0;
    koneksiLury con = new koneksiLury();
    String id_lapangan;
     String idInTable;
    
    
    private void tampil(){
        con.tampil(jTable1, "SELECT * FROM lapangan");
    }
    
    private void kondisiTextBox(boolean kondisi){
        txt_nama_lapangan2.setEditable(kondisi);
        txt_deskripsi.setEditable(kondisi);
        txt_harga_lapangan.setEditable(kondisi);
        
    }
    
    private void clear(){
        txt_nama_lapangan2.setText("");
        txt_deskripsi.setText("");
        txt_harga_lapangan.setText("");
    }
    
    private void kondisiAwal(){
        kondisiTextBox(false);
        id_lapangan = null;
        txt_nama_lapangan2.setText("");
        txt_deskripsi.setText("");
        txt_harga_lapangan.setText("");
        tampil();
        clear();
        isUpdateAndisDelete = 0;
        isCreate = 0;
    }
    /**
     * Creates new form kelola_lapangan
     */
    public kelola_lapangan() {
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

        txt_harga_lapangan = new javax.swing.JTextField();
        txt_nama_lapangan2 = new javax.swing.JTextField();
        txt_deskripsi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_camcel = new javax.swing.JButton();
        btn_create = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_harga_lapangan.setBackground(new java.awt.Color(60, 128, 128));
        txt_harga_lapangan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_harga_lapangan.setForeground(new java.awt.Color(255, 255, 255));
        txt_harga_lapangan.setBorder(null);
        txt_harga_lapangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_harga_lapanganActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga_lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 260, 30));

        txt_nama_lapangan2.setBackground(new java.awt.Color(60, 128, 128));
        txt_nama_lapangan2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nama_lapangan2.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama_lapangan2.setBorder(null);
        txt_nama_lapangan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_lapangan2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama_lapangan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 260, 30));

        txt_deskripsi.setBackground(new java.awt.Color(60, 128, 128));
        txt_deskripsi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_deskripsi.setForeground(new java.awt.Color(255, 255, 255));
        txt_deskripsi.setBorder(null);
        txt_deskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deskripsiActionPerformed(evt);
            }
        });
        getContentPane().add(txt_deskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 260, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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
        jTable1.setAutoResizeMode(0);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 300, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Kelola_lapangan.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        btn_back.setText("jButton1");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 70));

        btn_delete.setText("delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 100, 30));

        btn_save.setText("save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 100, 30));

        btn_update.setText("update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 100, 30));

        btn_camcel.setText("cancel");
        btn_camcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_camcelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_camcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 110, 30));

        btn_create.setText("create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 100, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false); 
        new chooseMenu().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_deskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deskripsiActionPerformed
        // TODO add your handling code here:
        txt_deskripsi.requestFocus();
    }//GEN-LAST:event_txt_deskripsiActionPerformed

    private void txt_nama_lapangan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_lapangan2ActionPerformed
        // TODO add your handling code here:
        txt_nama_lapangan2.requestFocus();
    }//GEN-LAST:event_txt_nama_lapangan2ActionPerformed

    private void txt_harga_lapanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_harga_lapanganActionPerformed
        // TODO add your handling code here:
        txt_harga_lapangan.requestFocus();
    }//GEN-LAST:event_txt_harga_lapanganActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
           int result = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin melanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            con.Eksekusi("DELETE FROM `lapangan` WHERE `id_lapangan` LIKE '"+ idInTable +"'", "Anda berhasil menghapus data",0);
    System.out.println("Anda memilih Yes");
        } else {
    // jika user memilih No atau menutup dialog box
    System.out.println("Anda memilih No");
        }
        kondisiAwal();
       
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:  
       id_lapangan = con.primaryKey2("SELECT MAX(`id_lapangan`) AS max_id FROM lapangan WHERE id_lapangan LIKE '%L%'", "L", "L01");
            
        if (isCreate != 0) {
            System.out.println(id_lapangan);
            
            con.Eksekusi("INSERT INTO `lapangan`(`id_lapangan`, `nama_lapangan`, `deskripsi`, `harga_lapangan`) VALUES ('"+ id_lapangan +"','"+txt_nama_lapangan2.getText() +"','"+ txt_deskripsi.getText() +"','"+ txt_harga_lapangan.getText() +"' )", "Berhasil Menyimpan",0);
            kondisiAwal();
         }
        isCreate = 0;
        isUpdateAndisDelete = 0;
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
          int input = JOptionPane.showConfirmDialog(null,"Apakah anda yakin mau edit?", "Warning", JOptionPane.OK_CANCEL_OPTION);
           if (input==0) {
               try {
                   String sql = "UPDATE `lapangan` SET `nama_lapangan`='"+ txt_nama_lapangan2.getText() +"',`deskripsi`='"+ txt_deskripsi.getText() +"',`harga_lapangan`='"+ txt_harga_lapangan.getText() +"' WHERE `id_lapangan` LIKE '"+ idInTable +"'";
             con.Eksekusi(sql, "berhasil menyimpan", PROPERTIES);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
     kondisiAwal();
} else {
    JOptionPane.showMessageDialog(this,"Data Tidak di Edit");
           }
       kondisiAwal();
        isCreate = 0;
        isUpdateAndisDelete = 0;
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_camcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_camcelActionPerformed
        // TODO add your handling code here:
          kondisiAwal();
        isCreate = 0;
        isUpdateAndisDelete = 0;
    }//GEN-LAST:event_btn_camcelActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        // TODO add your handling code here:
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
               JOptionPane.showMessageDialog(null, "Anda Telah Menekan Tombol Create");
           }
       }
    }//GEN-LAST:event_btn_createActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int id = jTable1.getSelectedRow();
      
      
      idInTable = jTable1.getValueAt(id,0).toString();
      txt_nama_lapangan2.setText(jTable1.getValueAt(id, 1).toString());
      txt_deskripsi.setText(jTable1.getValueAt(id, 2).toString());
      txt_harga_lapangan.setText(jTable1.getValueAt(id,3).toString());
      
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
            java.util.logging.Logger.getLogger(kelola_lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kelola_lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kelola_lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kelola_lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kelola_lapangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_camcel;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_deskripsi;
    private javax.swing.JTextField txt_harga_lapangan;
    private javax.swing.JTextField txt_nama_lapangan2;
    // End of variables declaration//GEN-END:variables
}
