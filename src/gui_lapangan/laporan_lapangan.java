/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_lapangan;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import static java.util.Objects.hash;
import javax.swing.JOptionPane;
import koneksi.koneksiLury;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class laporan_lapangan extends javax.swing.JFrame {
    koneksiLury con = new koneksiLury();
    /**
     * Creates new form laporan
     */
    public laporan_lapangan() {
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

        tanggalAwal = new com.toedter.calendar.JDateChooser();
        tanggalAkhir = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_proses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tanggalAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 280, 30));
        getContentPane().add(tanggalAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/finalLaporanLapangan.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(847, 549));
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        btn_proses.setText("jButton1");
        btn_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 110, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new owner().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesActionPerformed
        // TODO add your handling code here:  
        String tanggal1 = con.formatTanggal(tanggalAwal,"yyyy-MM-dd");
        String tanggal2 = con.formatTanggal(tanggalAkhir,"yyyy-MM-dd");
//        buat ganti format tanggal berikutnya 
        String tanggaltampil1 = con.formatTanggal(tanggalAwal,"dd MMMM yyyy");
        String tanggaltampil2 = con.formatTanggal(tanggalAkhir,"dd MMMM yyyy");
//        ini buat ngambil variable tanggal dan tanggal_tampil



        
        // Misalkan tanggal pertama dan tanggal kedua dalam string


        LocalDate tanggalPertama1 = LocalDate.parse( tanggal1);
        LocalDate tanggalKedua1 = LocalDate.parse( tanggal2);
        
        // Memeriksa apakah tanggal pertama melebihi tanggal kedua
        if (tanggalPertama1.isAfter(tanggalKedua1)) {
          System.out.println("Tanggal pertama melebihi tanggal kedua.");
          
        } else {
             
               con.laporanLapangan(tanggal1, tanggal2, tanggaltampil1, tanggaltampil2);
        }

        
        // Memeriksa apakah tanggal pertama melebihi tanggal kedua
       
       
    }//GEN-LAST:event_btn_prosesActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

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
            java.util.logging.Logger.getLogger(laporan_lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan_lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan_lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan_lapangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan_lapangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_proses;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser tanggalAkhir;
    private com.toedter.calendar.JDateChooser tanggalAwal;
    // End of variables declaration//GEN-END:variables
}
