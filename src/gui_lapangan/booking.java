/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_lapangan;

/**
 *
 * @author ASUS
 */
public class booking extends javax.swing.JFrame {

    /**
     * Creates new form booking
     */
    public booking() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_harga_lapangan = new javax.swing.JTextField();
        txt_jam_mulai = new javax.swing.JTextField();
        txt_jam_selesai = new javax.swing.JTextField();
        txt_dp = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_telpon = new javax.swing.JTextField();
        txt_total_bayar = new javax.swing.JTextField();
        tgl_main = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        booking = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_proses = new javax.swing.JButton();

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
        jTable1.setPreferredSize(new java.awt.Dimension(310, 69));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, 250));

        txt_harga_lapangan.setBackground(new java.awt.Color(60, 128, 128));
        txt_harga_lapangan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_harga_lapangan.setForeground(new java.awt.Color(255, 255, 255));
        txt_harga_lapangan.setBorder(null);
        getContentPane().add(txt_harga_lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 150, 20));

        txt_jam_mulai.setBackground(new java.awt.Color(60, 128, 128));
        txt_jam_mulai.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_jam_mulai.setForeground(new java.awt.Color(255, 255, 255));
        txt_jam_mulai.setBorder(null);
        getContentPane().add(txt_jam_mulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 150, 20));

        txt_jam_selesai.setBackground(new java.awt.Color(60, 128, 128));
        txt_jam_selesai.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_jam_selesai.setForeground(new java.awt.Color(255, 255, 255));
        txt_jam_selesai.setBorder(null);
        getContentPane().add(txt_jam_selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 150, 20));

        txt_dp.setBackground(new java.awt.Color(60, 128, 128));
        txt_dp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_dp.setForeground(new java.awt.Color(255, 255, 255));
        txt_dp.setBorder(null);
        getContentPane().add(txt_dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 150, 20));

        txt_nama.setBackground(new java.awt.Color(60, 128, 128));
        txt_nama.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama.setBorder(null);
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 150, 20));

        txt_telpon.setBackground(new java.awt.Color(60, 128, 128));
        txt_telpon.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_telpon.setForeground(new java.awt.Color(255, 255, 255));
        txt_telpon.setBorder(null);
        getContentPane().add(txt_telpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 150, 20));

        txt_total_bayar.setBackground(new java.awt.Color(60, 128, 128));
        txt_total_bayar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_total_bayar.setForeground(new java.awt.Color(255, 255, 255));
        txt_total_bayar.setBorder(null);
        getContentPane().add(txt_total_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 150, 20));

        tgl_main.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tgl_main.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tgl_mainAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(tgl_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vector.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        booking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/booking.jpg"))); // NOI18N
        booking.setPreferredSize(new java.awt.Dimension(847, 549));
        getContentPane().add(booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        btn_back.setText("jButton1");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 23, 50, 40));

        btn_proses.setText("proses");
        getContentPane().add(btn_proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 110, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new admin().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void tgl_mainAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tgl_mainAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl_mainAncestorAdded

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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel booking;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_proses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser tgl_main;
    private javax.swing.JTextField txt_dp;
    private javax.swing.JTextField txt_harga_lapangan;
    private javax.swing.JTextField txt_jam_mulai;
    private javax.swing.JTextField txt_jam_selesai;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_telpon;
    private javax.swing.JTextField txt_total_bayar;
    // End of variables declaration//GEN-END:variables
}
