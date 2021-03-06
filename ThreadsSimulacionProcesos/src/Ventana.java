
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
public class Ventana extends javax.swing.JFrame {
    HiloExcel hExcel;
    HiloWord hWord;
    HiloPaint hPaint;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        barWord = new javax.swing.JProgressBar();
        barExcel = new javax.swing.JProgressBar();
        barPaint = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Procesos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Proceso Word");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Proceso Excel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 10));

        jLabel3.setText("Proceso Paint");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        barWord.setName("barWord"); // NOI18N
        barWord.setStringPainted(true);
        getContentPane().add(barWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));
        barWord.getAccessibleContext().setAccessibleName("barWord");

        barExcel.setName("barExcel"); // NOI18N
        barExcel.setStringPainted(true);
        getContentPane().add(barExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));
        barExcel.getAccessibleContext().setAccessibleName("barExcel");

        barPaint.setName("barPaint"); // NOI18N
        barPaint.setStringPainted(true);
        getContentPane().add(barPaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));
        barPaint.getAccessibleContext().setAccessibleName("barPaint");

        jButton1.setText("Iniciar proceso");
        jButton1.setName("btnIniciarProceso"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jButton2.setText("Detener proceso");
        jButton2.setName("btnDetenerProceso"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        barWord.setForeground(Color.yellow);
        barExcel.setForeground(Color.yellow);
        barPaint.setForeground(Color.yellow);
        
        hExcel = new HiloExcel(barExcel);
        Thread hE = new Thread(hExcel, "EXCEL");
        
        hWord = new HiloWord(barWord);
        Thread hW = new Thread(hWord, "WORD");
        
        hPaint = new HiloPaint(barPaint);
        Thread hP = new Thread(hPaint, "PAINT");
        
        hE.start();
        hW.start();
        hP.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HiloExcel.finalizado    = true;
        HiloWord.finalizado     = true;
        HiloPaint.finalizado    = true;
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barExcel;
    private javax.swing.JProgressBar barPaint;
    private javax.swing.JProgressBar barWord;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
