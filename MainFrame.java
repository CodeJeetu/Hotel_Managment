/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jitendra
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
//        MDIForm mdif = new MDIForm();
//        mdif.exitmdi();
        MDIForm mf = new MDIForm();
      mf.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        upCustButton = new javax.swing.JButton();
        NewRoomButton = new javax.swing.JButton();
        seeStatisButton = new javax.swing.JButton();
        upRoomsButton = new javax.swing.JButton();
        leaveRoomButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        upCustButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        upCustButton.setText("Update Customer");
        upCustButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        upCustButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upCustButtonActionPerformed(evt);
            }
        });
        jPanel1.add(upCustButton);
        upCustButton.setBounds(530, 400, 260, 60);

        NewRoomButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        NewRoomButton.setText("New Room Booking");
        NewRoomButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        NewRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRoomButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NewRoomButton);
        NewRoomButton.setBounds(20, 300, 240, 60);

        seeStatisButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        seeStatisButton.setText("See Whole Status");
        seeStatisButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        seeStatisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeStatisButtonActionPerformed(evt);
            }
        });
        jPanel1.add(seeStatisButton);
        seeStatisButton.setBounds(210, 470, 250, 60);

        upRoomsButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        upRoomsButton.setText("See Particular Status");
        upRoomsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        upRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upRoomsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(upRoomsButton);
        upRoomsButton.setBounds(530, 480, 260, 60);

        leaveRoomButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        leaveRoomButton.setText("Leave Room");
        leaveRoomButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        leaveRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveRoomButtonActionPerformed(evt);
            }
        });
        jPanel1.add(leaveRoomButton);
        leaveRoomButton.setBounds(20, 370, 240, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jitender\\Documents\\NetBeansProjects\\Hotel Management\\icon\\New entry.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upCustButtonActionPerformed
        MDIForm mdi = new MDIForm();
       mdi.setVisible(true);
       mdi.updateRoom();
    }//GEN-LAST:event_upCustButtonActionPerformed

    private void NewRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRoomButtonActionPerformed
       MDIForm mdi = new MDIForm();
       mdi.setVisible(true);
       mdi.newroom();
       
       // NewRoom nroom = new NewRoom();
       
      // nroom.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_NewRoomButtonActionPerformed

    private void seeStatisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeStatisButtonActionPerformed
        MDIForm mdi = new MDIForm();
       mdi.setVisible(true);
       mdi.wholeStatus();
    }//GEN-LAST:event_seeStatisButtonActionPerformed

    private void upRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upRoomsButtonActionPerformed
       MDIForm mdi = new MDIForm();
       mdi.setVisible(true);
       mdi.particularRecord();
    }//GEN-LAST:event_upRoomsButtonActionPerformed

    private void leaveRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveRoomButtonActionPerformed
      MDIForm mdi = new MDIForm();
       mdi.setVisible(true);
       mdi.leaveRoom();  // TODO add your handling code here:
    }//GEN-LAST:event_leaveRoomButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewRoomButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leaveRoomButton;
    private javax.swing.JButton seeStatisButton;
    private javax.swing.JButton upCustButton;
    private javax.swing.JButton upRoomsButton;
    // End of variables declaration//GEN-END:variables
}