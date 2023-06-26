/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jitendra
 */
public class MDIForm extends javax.swing.JFrame {

    /**
     * Creates new form MDIForm
     */
     NewRoom nr = new NewRoom();
     LeaveRoom lr = new LeaveRoom();
     UpdateCustomer upc = new UpdateCustomer();
     ParticullarDetails prtd =new ParticullarDetails();
     WholeStatus whSt = new WholeStatus();
     Advice adv = new Advice();
     AboutDevelopMent adm = new AboutDevelopMent();
     
       
    public MDIForm()
    {
      
        initComponents();
        
    }
    public void newroom()
    {
       jLabel1.add(nr);
       nr.setVisible(true);   
       
       lr.setVisible(false);
       upc.setVisible(false);
       prtd.setVisible(false);
       whSt.setVisible(false);
       adv.setVisible(false);
        adm.setVisible(false);
    }
    public void leaveRoom()
    {
       
       jLabel1.add(lr);
       lr.setVisible(true);
       
       nr.setVisible(false);   
       upc.setVisible(false);
       prtd.setVisible(false);
       whSt.setVisible(false);
       adv.setVisible(false);
       adm.setVisible(false);
    }
    public void updateRoom()
    {
       
       jLabel1.add(upc);
       upc.setVisible(true);
       
       nr.setVisible(false);   
       lr.setVisible(false);
       prtd.setVisible(false);
       whSt.setVisible(false);
       adv.setVisible(false);
       adm.setVisible(false);
    }
    public void particularRecord()
    {
       
        jLabel1.add(prtd);
        prtd.setVisible(true);
        
       nr.setVisible(false);   
       lr.setVisible(false);
       upc.setVisible(false);
       whSt.setVisible(false);
       adv.setVisible(false);
       adm.setVisible(false);
    }
    public void wholeStatus()
    {
        
        jLabel1.add(whSt);
        whSt.setVisible(true);
        
       nr.setVisible(false);   
       lr.setVisible(false);
       upc.setVisible(false);
       prtd.setVisible(false);
       adv.setVisible(false);
       adm.setVisible(false);
    }
    public void advice()
    {
        jLabel1.add(adv);
        adv.setVisible(true);
        
       prtd.setVisible(false);
       nr.setVisible(false);   
       lr.setVisible(false);
       upc.setVisible(false);
       whSt.setVisible(false);
      adm.setVisible(false);
       
    }
    public void aboutDev()
    {
        jLabel1.add(adm);
        adm.setVisible(true);
        
       prtd.setVisible(false);
       nr.setVisible(false);   
       lr.setVisible(false);
       upc.setVisible(false);
       whSt.setVisible(false);
      adv.setVisible(false);
    }
    
    public void exitmdi()
    {
        this.setVisible(false);
//        MainFrame mnf = new MainFrame();
//        mnf.setVisible(false);
     }
    

    public void showNew()
    {
        NewRoom nr = new NewRoom();
        nr.setVerifyInputWhenFocusTarget(true);
        LeaveRoom lr = new LeaveRoom();
        jLabel1.remove(lr);
        lr.setVisible(false);
        UpdateCustomer upc = new UpdateCustomer();
        upc.setVisible(false);
        ParticullarDetails prtd =new ParticullarDetails();
        prtd.setVisible(false);
        WholeStatus whSt = new WholeStatus();
        whSt.setVisible(false);
        Advice adv = new Advice();
        adv.setVisible(false);
         AboutDevelopMent adm = new AboutDevelopMent();
        adm.setVisible(false);
    }
    public void showLeave()
    {
        NewRoom nr = new NewRoom();
        //nr.setVerifyInputWhenFocusTarget(false);
        LeaveRoom lr = new LeaveRoom();
      //  jLabel1.removeA(nr);
        UpdateCustomer upc = new UpdateCustomer();
        upc.setVisible(false);
        ParticullarDetails prtd =new ParticullarDetails();
        prtd.setVisible(false);
        WholeStatus whSt = new WholeStatus();
        whSt.setVisible(false);
        Advice adv = new Advice();
        adv.setVisible(false);
         AboutDevelopMent adm = new AboutDevelopMent();
        adm.setVisible(false);
    }
     public void showUpdate()
    {
        NewRoom nr = new NewRoom();
        nr.setVerifyInputWhenFocusTarget(false);
        LeaveRoom lr = new LeaveRoom();
       
        lr.setVisible(false);
        UpdateCustomer upc = new UpdateCustomer();
        upc.setVisible(true);
        ParticullarDetails prtd =new ParticullarDetails();
        prtd.setVisible(false);
        WholeStatus whSt = new WholeStatus();
        whSt.setVisible(false);
        Advice adv = new Advice();
        adv.setVisible(false);
         AboutDevelopMent adm = new AboutDevelopMent();
        adm.setVisible(false);
    }
      public void showParticualr()
    {
        NewRoom nr = new NewRoom();
        nr.setVerifyInputWhenFocusTarget(false);
        LeaveRoom lr = new LeaveRoom();
        lr.setVisible(false);
        UpdateCustomer upc = new UpdateCustomer();
        upc.setVisible(false);
        ParticullarDetails prtd =new ParticullarDetails();
        prtd.setVisible(true);
        WholeStatus whSt = new WholeStatus();
        whSt.setVisible(false);
        Advice adv = new Advice();
        adv.setVisible(false);
         AboutDevelopMent adm = new AboutDevelopMent();
        adm.setVisible(false);
    }
    public void showWhole()
    {
        NewRoom nr = new NewRoom();
        nr.setVerifyInputWhenFocusTarget(false);
        LeaveRoom lr = new LeaveRoom();
        lr.setVisible(false);
        UpdateCustomer upc = new UpdateCustomer();
        upc.setVisible(false);
        ParticullarDetails prtd =new ParticullarDetails();
        prtd.setVisible(false);
        WholeStatus whSt = new WholeStatus();
        whSt.setVisible(true);
        Advice adv = new Advice();
        adv.setVisible(false);
         AboutDevelopMent adm = new AboutDevelopMent();
        adm.setVisible(false);
    }
    public void showAdvice(){
        NewRoom nr = new NewRoom();
        nr.setVerifyInputWhenFocusTarget(false);
        LeaveRoom lr = new LeaveRoom();
        lr.setVisible(false);
        UpdateCustomer upc = new UpdateCustomer();
        upc.setVisible(false);
        ParticullarDetails prtd =new ParticullarDetails();
        prtd.setVisible(false);
        WholeStatus whSt = new WholeStatus();
        whSt.setVisible(false);
        Advice adv = new Advice();
        adv.setVisible(true);
        AboutDevelopMent adm = new AboutDevelopMent();
        adm.setVisible(false);
        
    }
    public void showAboDev(){
        NewRoom nr = new NewRoom();
        nr.setVerifyInputWhenFocusTarget(false);
        LeaveRoom lr = new LeaveRoom();
        lr.setVisible(false);
        UpdateCustomer upc = new UpdateCustomer();
        upc.setVisible(false);
        ParticullarDetails prtd =new ParticullarDetails();
        prtd.setVisible(false);
        WholeStatus whSt = new WholeStatus();
        whSt.setVisible(false);
        Advice adv = new Advice();
        adv.setVisible(false);
        AboutDevelopMent adm = new AboutDevelopMent();
        adm.setVisible(true);
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1297, 799));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hnet.com-image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenu1.setText("Home");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("New Room");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setText("Leave");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem3.setText("Update ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem4.setText("Particular Record");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem5.setText("Whole Record");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Setting");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Feedback");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem8.setText("Advice");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("About");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem13.setText("About Development");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       leaveRoom();
       showLeave();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        updateRoom();
        showUpdate();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        newroom();
        showNew();
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        particularRecord();
        showParticualr();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        wholeStatus();
        showWhole();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
     advice();
     showAdvice();
      
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        aboutDev();
        showAboDev();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(MDIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
