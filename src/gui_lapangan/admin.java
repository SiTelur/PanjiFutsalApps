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
        btn_logout = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_booking = new javax.swing.JButton();
        btn_konfirmasi = new javax.swing.JButton();
        btn_jadwal = new javax.swing.JButton();
        btn_trans = new javax.swing.JButton();
        btn_menu_kelola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard_admin (1).png"))); // NOI18N
        admin.setPreferredSize(new java.awt.Dimension(846, 549));
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        btn_booking.setText("jButton1");
        btn_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookingActionPerformed(evt);
            }
        });
        getContentPane().add(btn_booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 80, 30));

        btn_konfirmasi.setText("konfirmasi");
        btn_konfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konfirmasiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_konfirmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 63, 120, 30));

        btn_jadwal.setText("jadwal");
        btn_jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jadwalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 63, 70, 30));

        btn_trans.setText("transaksi_makanan");
        btn_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transActionPerformed(evt);
            }
        });
        getContentPane().add(btn_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 190, 30));

        btn_menu_kelola.setText("jButton1");
        btn_menu_kelola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_kelolaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu_kelola, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 30));

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

    private void btn_jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jadwalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new jadwal().setVisible(true);
    }//GEN-LAST:event_btn_jadwalActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new chooseLogin().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
         
        this.setVisible(false);
        new loginUsername().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookingActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new booking().setVisible(true);
    }//GEN-LAST:event_btn_bookingActionPerformed

    private void btn_menu_kelolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_kelolaActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new chooseMenu().setVisible(true);
    }//GEN-LAST:event_btn_menu_kelolaActionPerformed

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
    private javax.swing.JButton btn_booking;
    private javax.swing.JButton btn_jadwal;
    private javax.swing.JButton btn_konfirmasi;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_menu_kelola;
    private javax.swing.JButton btn_trans;
    // End of variables declaration//GEN-END:variables
}
