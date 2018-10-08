/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tani.go;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Deddy
 */
public class Awal extends javax.swing.JFrame {

    /**
     * Creates new form Awal
     */
    public Awal() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(false);
        this.setResizable(false);
        initComponents();
        this.setSize(1280, 700);
        window.setSize(1280, 700);

        window.add("tentang", tentang);
        window.add("main_menu", main_menu);

    }

    public JButton b_tentang() {
        return b_tentang;
    }

    public JButton b_kembten() {
        return b_kembten;
    }

    public JButton b_keluar() {
        return b_keluar;
    }
    
    public JButton b_mulai(){
        return b_mulai;
    }
    
    public JButton b_bantuan(){
        return b_bantuan;
    }
    
    public void pindah(String kunci) {
        CardLayout cl = (CardLayout) (window.getLayout());
        cl.show(window, kunci);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        window = new javax.swing.JPanel();
        tentang = new javax.swing.JPanel();
        b_kembten = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        main_menu = new javax.swing.JPanel();
        b_mulai = new javax.swing.JButton();
        b_bantuan = new javax.swing.JButton();
        b_tentang = new javax.swing.JButton();
        b_keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        window.setLayout(new java.awt.CardLayout());

        tentang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_kembten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_tentang/back.png"))); // NOI18N
        b_kembten.setBorder(null);
        b_kembten.setBorderPainted(false);
        b_kembten.setContentAreaFilled(false);
        tentang.add(b_kembten, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 120, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_tentang/tentang1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        tentang.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        window.add(tentang, "card2");

        main_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_mulai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarmenu/mulai.png"))); // NOI18N
        b_mulai.setBorderPainted(false);
        b_mulai.setContentAreaFilled(false);
        main_menu.add(b_mulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 320, 80));

        b_bantuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarmenu/bantuan.png"))); // NOI18N
        b_bantuan.setBorderPainted(false);
        b_bantuan.setContentAreaFilled(false);
        main_menu.add(b_bantuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 320, 80));

        b_tentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarmenu/tentang.png"))); // NOI18N
        b_tentang.setBorderPainted(false);
        b_tentang.setContentAreaFilled(false);
        main_menu.add(b_tentang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 320, 80));

        b_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarmenu/keluar.png"))); // NOI18N
        b_keluar.setBorderPainted(false);
        b_keluar.setContentAreaFilled(false);
        main_menu.add(b_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 320, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarmenu/menu.png"))); // NOI18N
        main_menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        window.add(main_menu, "card3");

        getContentPane().add(window, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_bantuan;
    private javax.swing.JButton b_keluar;
    private javax.swing.JButton b_kembten;
    private javax.swing.JButton b_mulai;
    private javax.swing.JButton b_tentang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel main_menu;
    private javax.swing.JPanel tentang;
    private javax.swing.JPanel window;
    // End of variables declaration//GEN-END:variables
}