
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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
public class UpdateCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateCustomer
     */
    public UpdateCustomer() {
        initComponents();
        do_connect();
        this.setSize( 660,295);
        nextCustomerButt.setVisible(false);
    }
    Connection con;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    String bookingdate; 
    int ret =0,payable,oldbill;
    String sql ;
    String roomId ="Null",text1;
    int days1,roomAc,rsf,newbill;
    String name,mobile,gender="Null",address,checkInDate,checkOutDate,room ,food;
    
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        gobutt = new javax.swing.JButton();
        nextCustomerButt = new javax.swing.JButton();
        erroLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Malerdio = new javax.swing.JRadioButton();
        Femalerdio = new javax.swing.JRadioButton();
        updateAmount = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        checkOut = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        downpayField = new javax.swing.JTextField();
        updateButt = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        payableField = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Update Information");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Update Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Name  :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Room No  :");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        gobutt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gobutt.setText("Go");
        gobutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobuttActionPerformed(evt);
            }
        });

        nextCustomerButt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nextCustomerButt.setText("Next Customer");
        nextCustomerButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextCustomerButtActionPerformed(evt);
            }
        });

        erroLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        erroLabel.setForeground(new java.awt.Color(255, 51, 51));
        erroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(erroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nextCustomerButt, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(gobutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextCustomerButt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(erroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gobutt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Edit Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Name  :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Gender :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Mobile");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonGroup1.add(Malerdio);
        Malerdio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Malerdio.setText("Male");
        Malerdio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MalerdioActionPerformed(evt);
            }
        });

        buttonGroup1.add(Femalerdio);
        Femalerdio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Femalerdio.setText("Female");
        Femalerdio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemalerdioActionPerformed(evt);
            }
        });

        updateAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        updateAmount.setText("Update Amount");
        updateAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAmountActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Check outDate  :");

        checkOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkOut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                checkOutFocusLost(evt);
            }
        });
        checkOut.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                checkOutInputMethodTextChanged(evt);
            }
        });
        checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(updateAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Malerdio)
                                .addGap(9, 9, 9)
                                .addComponent(Femalerdio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(checkOut)))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Malerdio)
                            .addComponent(Femalerdio)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(updateAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Updated Amount", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        downpayField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        downpayField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                downpayFieldFocusLost(evt);
            }
        });
        downpayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downpayFieldActionPerformed(evt);
            }
        });

        updateButt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        updateButt.setText("Update");
        updateButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Payable :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("DownPay :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Payment :");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        payableField.setEditable(false);
        payableField.setBackground(new java.awt.Color(255, 255, 255));
        payableField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payableField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                payableFieldFocusGained(evt);
            }
        });
        payableField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payableFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(downpayField))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addComponent(payableField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(downpayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(payableField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(updateButt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gobuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobuttActionPerformed
        downpayField.setEditable(false);
        checkOut.setEditable(true);
        updateAmount.setEnabled(true);
        jTextField4.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        gobutt.setEnabled(false);
        updateButt.setEnabled(false);
        roomId = jTextField1.getText();
   String n = jTextField2.getText();
   String name1 = n.toUpperCase().charAt(0)+n.substring(1,n.length());  
   try{
       sql = "SELECT Name ,Mobile,Address,Gender,Exit_Date,Bill,"
               + "DownPayment,Booking_Date,food,Room from customer WHERE Room_No =? && Name =?";
       pstmt = con.prepareStatement(sql);
       pstmt.setString(1, roomId);
       pstmt.setString(2, name1);
       System.out.println(roomId);
       rs = pstmt.executeQuery();
       int i =0;
       if(rs.next())
       {
           ++i;
       }if(i>0)
       {
            ret = 1;
       this.setSize(782, 656);
       //MDIForm mdiform = new MDIForm();
//       mdiform.setSize(700, 700);
       erroLabel.setText("");
       jTextField4.setText(rs.getString(1));
       jTextField5.setText(rs.getString(2));
       jTextField3.setText(rs.getString(3));
       checkOut.setText(rs.getString(5));
       text1 = checkOut.getText();
       jTextField7.setText(String.valueOf(rs.getInt(6)));
       oldbill = Integer.parseInt(jTextField7.getText());
       downpayField.setText(String.valueOf(rs.getInt(7)));
       bookingdate = rs.getString(8);
       food = rs.getString(9);
       room = rs.getString(10);
       gender =rs.getString(4);
       payable = oldbill - Integer.parseInt(downpayField.getText());
     payableField.setText(String.valueOf(payable));
       System.out.println(gender);
       if(gender.equals("Male"))
       {
           System.out.println(gender);
           Malerdio.doClick();
           
       }
       if(gender.equals("Female"))
       {
           System.out.println(gender);
           Femalerdio.doClick();
        }
        }
       else{
           erroLabel.setText("Name or Room not found in Hotel");
           jTextField1.setEditable(true);
           jTextField2.setEditable(true);
            gobutt.setEnabled(true);
           System.out.println("Not Found");
       }
       //Calculating Date 
       //Booking date
        String barr[] = bookingdate.split("/");
        int d1 = Integer.parseInt(barr[0]);
        int m1 = Integer.parseInt(barr[1]);
        int y1 = Integer.parseInt(barr[2]);
        LocalDate bdate = LocalDate.of(y1, m1,d1);
        //Leave date
        String larr[] = checkOut.getText().split("/");
        int d2 = Integer.parseInt(larr[0]);
        int m2 = Integer.parseInt(larr[1]);
        int y2 = Integer.parseInt(larr[2]);
        LocalDate ldate = LocalDate.of(y2, m2,d2);
        Period p = Period.between(bdate, ldate);
         int day = p.getDays();
         int month = p.getMonths();
         int year = p.getYears();
         days1 = day +(30*month)+(365*year);
         System.out.println("Old Date :"+days1);
         System.out.println("old dates :"+bdate);
         System.out.println("new dates :"+ldate);
        System.out.println("days1 :"+days1);
         System.out.println("New days :"+day);
          System.out.println("months :"+month);
           System.out.println("year  :"+year);
       
   
    }catch(Exception e)
   {
       e.printStackTrace();
   }
       
    }//GEN-LAST:event_gobuttActionPerformed

    private void updateButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtActionPerformed
      try{
          
        sql = "UPDATE customer SET Name=?,Mobile=?,Address=?,Gender=?,"
                + "Exit_Date=?,Bill=?,DownPayment=?,Payable=? WHERE Room_No="+roomId;

       pstmt = con.prepareStatement(sql);
       pstmt.setString(1, jTextField4.getText());
       pstmt.setString(2, jTextField5.getText());
       pstmt.setString(3, jTextField3.getText());
       pstmt.setString(5, checkOut.getText());
       //int rent =Integer.parseInt(jTextField7.getText());
       pstmt.setInt(6,newbill);
       pstmt.setInt(7, Integer.parseInt(downpayField.getText()));
       pstmt.setInt(8, payable);
       pstmt.setString(4,gender);
       //pstmt.setString(5,newfood);
       
       int i = pstmt.executeUpdate();
       JOptionPane.showMessageDialog(this,"Room No :"+roomId+"\nName :"+jTextField4.getText()+"\nMobile :"+jTextField5.getText()+"\nCheck out :"+checkOut.getText()
                                 +" \n\nThankyou for Using","Succesfuly Updated",1);
       this.setSize( 675,300);
       nextCustomerButt.setVisible(true);
       nextCustomerButt.setEnabled(true);
      }catch(Exception e)
      {
          e.printStackTrace();
      }
    }//GEN-LAST:event_updateButtActionPerformed

    private void MalerdioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MalerdioActionPerformed
     if(Malerdio.isSelected())
     {
         System.out.println(gender);
      gender ="Male";   
     }
    }//GEN-LAST:event_MalerdioActionPerformed

    private void FemalerdioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemalerdioActionPerformed
        if(Femalerdio.isSelected())
     {
      gender ="Female";   
     }
    }//GEN-LAST:event_FemalerdioActionPerformed

    private void updateAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAmountActionPerformed
       downpayField.setEditable(true);
        jTextField4.setEditable(false);
        jTextField4.setEditable(false);
      jTextField5.setEditable(false);
      checkOut.setEditable(false);
        updateAmount.setEnabled(false);
              jLabel10.setText("New Bill:");
        downpayField.setText("");
        
        
        
       //Calculating Date 
       //Booking date
        String barr[] = bookingdate.split("/");
        int d1 = Integer.parseInt(barr[0]);
        int m1 = Integer.parseInt(barr[1]);
        int y1 = Integer.parseInt(barr[2]);
        LocalDate bdate = LocalDate.of(y1, m1,d1);
        //Leave date
        String larr[] = checkOut.getText().split("/");
        int d2 = Integer.parseInt(larr[0]);
        int m2 = Integer.parseInt(larr[1]);
        int y2 = Integer.parseInt(larr[2]);
        LocalDate ldate = LocalDate.of(y2, m2,d2);
        Period p = Period.between(bdate, ldate);
        int day = p.getDays();
        int month = p.getMonths();
        int year = p.getYears();
        //Calculating Bill coresponding to Days
         
         //int difdays = Math.abs(days2-days1);
        // System.out.println("Difference days:"+difdays);
        int roomRs=0,foodrs=0;
        if(food.equals("Veg"))
       {
           foodrs =200;
           rsf = 200;
       }
       else if(food.equals("Non-Veg"))
        {
            foodrs = 300;
            rsf = 300;
       }
       if(room.equals("AC"))
       {
           roomRs = 1000;
          roomAc =1000;
       }
       else if(room.equals("Non_AC"))
       {
          roomRs = 500;
       }
       
       newbill = ((roomRs+foodrs)*day) +((roomRs+foodrs)*30*month)+((roomRs+foodrs)*365*year);
         
     
    
        jTextField7.setText(String.valueOf(newbill));
        
         
      
      
      
    }//GEN-LAST:event_updateAmountActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void downpayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downpayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downpayFieldActionPerformed

    private void checkOutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checkOutFocusLost
         
    }//GEN-LAST:event_checkOutFocusLost

    private void payableFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payableFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payableFieldActionPerformed

    private void downpayFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_downpayFieldFocusLost
     
        payable = newbill - Integer.parseInt(downpayField.getText());
     payableField.setText(String.valueOf(payable));
    }//GEN-LAST:event_downpayFieldFocusLost

    private void checkOutInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_checkOutInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_checkOutInputMethodTextChanged

    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkOutActionPerformed

    private void payableFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payableFieldFocusGained
      updateButt.setEnabled(true);
    }//GEN-LAST:event_payableFieldFocusGained

    private void nextCustomerButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextCustomerButtActionPerformed
      jTextField1.setText("");
      jTextField2.setText("");
        jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        nextCustomerButt.setEnabled(false);
        gobutt.setEnabled(true);
    }//GEN-LAST:event_nextCustomerButtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);;
       MDIForm mdi= new MDIForm();
       mdi.exitmdi();
       MainFrame mnf = new MainFrame();
       mnf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Femalerdio;
    private javax.swing.JRadioButton Malerdio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField checkOut;
    private javax.swing.JTextField downpayField;
    private javax.swing.JLabel erroLabel;
    private javax.swing.JButton gobutt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton nextCustomerButt;
    private javax.swing.JTextField payableField;
    private javax.swing.JButton updateAmount;
    private javax.swing.JButton updateButt;
    // End of variables declaration//GEN-END:variables
}