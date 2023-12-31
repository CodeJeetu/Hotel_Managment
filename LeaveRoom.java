
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jitendra
 */
public class LeaveRoom extends javax.swing.JInternalFrame {

    /**
     * Creates new form LeaveRoom
     */
    public LeaveRoom() {
        initComponents();
        do_connect();
        this.setSize(606,320);
    }
    Connection con;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    String room = "Null";
    String sql,name,exitdate ;
    
    public void do_connect() //throws SQLException, ClassNotFoundException
    {
        try{
            con =  DBConnection.getConnection();
                    //stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
           
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception se)
        {
            System.out.println(se);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        FindButt = new javax.swing.JButton();
        errorLabell = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bookingDate = new javax.swing.JTextField();
        payabelField = new javax.swing.JTextField();
        downpyField = new javax.swing.JTextField();
        leaveButt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        billField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        finalAmountField = new javax.swing.JTextField();
        submitAmountbutt = new javax.swing.JButton();
        p1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Leave Room");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leave Room", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Room No:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("Name    :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        FindButt.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        FindButt.setText("Find");
        FindButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtActionPerformed(evt);
            }
        });

        errorLabell.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        errorLabell.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FindButt, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(errorLabell, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabell, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(FindButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Amount Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setText("Date of Booking:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel4.setText("Bill :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setText("PayablePayment:");

        bookingDate.setEditable(false);
        bookingDate.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        bookingDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        payabelField.setEditable(false);
        payabelField.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        payabelField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        downpyField.setEditable(false);
        downpyField.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        downpyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        leaveButt.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        leaveButt.setText("Leave");
        leaveButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("Down Payment :");

        billField.setEditable(false);
        billField.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        billField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Final Amount");

        finalAmountField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        finalAmountField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finalAmountField.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                finalAmountFieldComponentAdded(evt);
            }
        });
        finalAmountField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                finalAmountFieldFocusLost(evt);
            }
        });

        submitAmountbutt.setText("Submit Amount");
        submitAmountbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAmountbuttActionPerformed(evt);
            }
        });

        p1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(downpyField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(submitAmountbutt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(finalAmountField, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(payabelField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(leaveButt, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(billField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(finalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(downpyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payabelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(submitAmountbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(leaveButt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FindButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtActionPerformed
    leaveButt.setEnabled(false);
        room = jTextField1.getText();
   String n = jTextField2.getText();
    name = n.toUpperCase().charAt(0)+n.substring(1,n.length());  
   try{
       sql = "SELECT Booking_Date ,DownPayment,Bill,Payable,Exit_Date from customer WHERE Room_No =? && Name =?";
       pstmt = con.prepareStatement(sql);
       pstmt.setString(1, room);
       pstmt.setString(2, name);
        System.out.println(room);
       rs = pstmt.executeQuery();
       int i =0;
       if(rs.next())
       {
           ++i;
       }if(i>0)
       {
           errorLabell.setText("");
           jPanel2.setSize(566, 297);
           FindButt.setVisible(false);
           this.setSize(667,650);
               bookingDate.setText(rs.getString(1));
               downpyField.setText(String.valueOf(rs.getInt(2)));
               billField.setText(String.valueOf(rs.getInt(3))); 
               payabelField.setText(String.valueOf(rs.getInt(4))); 
               exitdate = rs.getString(5);
       }
       else{
           System.out.println("Not Found");
           errorLabell.setText("Name or Room No is not in Hotel");
       }
           
           
   }catch(Exception e)
   {
       e.printStackTrace();
   }
    }//GEN-LAST:event_FindButtActionPerformed

    private void leaveButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveButtActionPerformed
     String barr[] = bookingDate.getText().split("/"); // User Given date
        int d1 = Integer.parseInt(barr[0]);
        int m1 = Integer.parseInt(barr[1]);
        int y1 = Integer.parseInt(barr[2]);
        LocalDate bdate = LocalDate.of(y1, m1,d1);
        //Leave date
        String larr[] = exitdate.split("/");
        int d2 = Integer.parseInt(larr[0]);
        int m2 = Integer.parseInt(larr[1]);
        int y2 = Integer.parseInt(larr[2]);
        LocalDate ldate = LocalDate.of(y2, m2,d2);
        Period p = Period.between(bdate, ldate);
         int day = p.getDays();
         int month = p.getMonths();
         int year = p.getYears();
        int days = day +(30*month)+(365*year); 
        int roomRs = 0,foodRs =0;
        // Calculation of roo and food
      //Init block
        {
        
        if(Integer.parseInt(billField.getText())%7==0)
        {
            roomRs = 500;
            foodRs = 200;
        }
        else if(Integer.parseInt(billField.getText())%13==0)
        {
            roomRs =1000;
            foodRs = 300;
        }
        else if(Integer.parseInt(billField.getText())%2==0)
        {
            roomRs =1000;
            foodRs = 200;
        }else 
        {
            roomRs = 500;
            foodRs = 300;
        }
    }
      try{
         stmt = con.createStatement();      
      String sql = "DELETE FROM customer WHERE Room_No ="+room;
      stmt.executeUpdate(sql); 
      JOptionPane.showMessageDialog(this,"Room No :"+room+"\nName = "+name+""
              + "\nDays ="+days+"\nRoom"+roomRs+"nFood"+foodRs+"\nFinal amount ="+(Integer.parseInt(downpyField.getText()) + 
                               Integer.parseInt( finalAmountField.getText()))
                      +"\n\ncheck Out Succesfully\nThankyou for Using","Succesfuly CheckOut",1);
      MainFrame mnf = new MainFrame();
      mnf.setVisible(true);
      MDIForm mdi = new MDIForm();
      mdi.setVisible(false);
     }catch(Exception e)
     {
         e.printStackTrace();
     }
    }//GEN-LAST:event_leaveButtActionPerformed

    private void finalAmountFieldComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_finalAmountFieldComponentAdded
       
    }//GEN-LAST:event_finalAmountFieldComponentAdded

    private void finalAmountFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_finalAmountFieldFocusLost
             
    }//GEN-LAST:event_finalAmountFieldFocusLost

    private void submitAmountbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAmountbuttActionPerformed
        System.out.println(Integer.parseInt(payabelField.getText()));
        System.out.println(Integer.parseInt(finalAmountField.getText()));
        if(Integer.parseInt(payabelField.getText()) == Integer.parseInt(finalAmountField.getText()))
        {
         int payable = Integer.parseInt(billField.getText()) -
               (Integer.parseInt(downpyField.getText()) + 
                               Integer.parseInt( finalAmountField.getText()));
       payabelField.setText(String.valueOf(payable));
       finalAmountField.setEditable(false);
       leaveButt.setEnabled(true);
        }
        else{
            p1.setText("Payament should be full and final");
        }
    }//GEN-LAST:event_submitAmountbuttActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindButt;
    private javax.swing.JTextField billField;
    private javax.swing.JTextField bookingDate;
    private javax.swing.JTextField downpyField;
    private javax.swing.JLabel errorLabell;
    private javax.swing.JTextField finalAmountField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton leaveButt;
    private javax.swing.JLabel p1;
    private javax.swing.JTextField payabelField;
    private javax.swing.JButton submitAmountbutt;
    // End of variables declaration//GEN-END:variables
}
