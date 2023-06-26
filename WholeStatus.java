
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jitendra
 */
public class WholeStatus extends javax.swing.JInternalFrame {

    /**
     * Creates new form WholeStatus
     */
    public WholeStatus() {
        initComponents();
    
        do_connect();
        
    }
    Connection con ;
    Statement stmt = null;
    ResultSet rs =null;
    
    public void do_connect() 
    {
        try{
       // Class.forName("com.mysql.cj.jdbc.Driver");
        con = DBConnection.getConnection();
        System.out.println("Databases Connected....");
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        String sql = "SELECT *FROM customer";
        String roomNo,name,mobile,address,gender,food,room,booking,leave,bill,donpay,payable;
        rs =  stmt.executeQuery(sql);
      int i=0;
      while(rs.next())
      {
        roomNo = rs.getString(1);
        name = rs.getString(2);
        mobile = rs.getString(3);
        address = rs.getString(4);
        gender = rs.getString(5);
        booking = rs.getString(6);
        food = rs.getString(7);
        room = rs.getString(8);
        leave = rs.getString(9);
        bill = String.valueOf(rs.getInt(10));
        donpay = String.valueOf(rs.getString(11));
        payable = String.valueOf(rs.getString(12));
       
        DefaultTableModel    model =(DefaultTableModel) jTable1.getModel();
       model.addRow( new Object[]{roomNo,name,mobile,address,gender,food,room,booking,leave,bill,donpay,payable});
       }
        
        //System.out.println(name);
        System.out.println("rs Completed.....");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Whole Status");

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Name", "Mobile", "Address", "Gender", "Food", "Room", "Booking", "Leaving", "Bill", "DownPayment", "Payable"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
MainFrame mnf = new MainFrame();
      mnf.setVisible(true);
      this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
