/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_lapangan;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form dasboard_admin
     */
    public admin() {
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

        admin = new javax.swing.JLabel();
        btn_konfirmasi = new javax.swing.JButton();
        btn_trans = new javax.swing.JButton();
        btn_kelola_makanan = new javax.swing.JButton();
        btn_jadwal = new javax.swing.JButton();
        btn_kelola_lapangan = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard_admin.jpg"))); // NOI18N
        admin.setPreferredSize(new java.awt.Dimension(846, 549));
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_konfirmasi.setText("konfirmasi");
        btn_konfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konfirmasiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_konfirmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 110, -1));

        btn_trans.setText("transaksi_makanan");
        btn_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transActionPerformed(evt);
            }
        });
        getContentPane().add(btn_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 63, 180, 30));

        btn_kelola_makanan.setText("kelola_makanan");
        btn_kelola_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kelola_makananActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kelola_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 140, -1));

        btn_jadwal.setText("jadwal");
        btn_jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jadwalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        btn_kelola_lapangan.setText("kelola_lapangan");
        btn_kelola_lapangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kelola_lapanganActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kelola_lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, -1));

        btn_logout.setText("log out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 110, 50));

        btn_back.setText("jButton1");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 40, 30));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 63, 80, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_konfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_konfirmasiActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new konfirmasi().setVisible(true);
    }//GEN-LAST:event_btn_konfirmasiActionPerformed

    private void btn_transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new transaksi_makanan().setVisible(true);
    }//GEN-LAST:event_btn_transActionPerformed

    private void btn_kelola_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kelola_makananActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new kelola_makanan().setVisible(true);
    }//GEN-LAST:event_btn_kelola_makananActionPerformed

    private void btn_jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jadwalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new jadwal().setVisible(true);
    }//GEN-LAST:event_btn_jadwalActionPerformed

    private void btn_kelola_lapanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kelola_lapanganActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new kelola_lapangan().setVisible(true);
    }//GEN-LAST:event_btn_kelola_lapanganActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new loginUsername().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
         
        this.setVisible(false);
        new loginUsername().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new booking().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_jadwal;
    private javax.swing.JButton btn_kelola_lapangan;
    private javax.swing.JButton btn_kelola_makanan;
    private javax.swing.JButton btn_konfirmasi;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_trans;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
