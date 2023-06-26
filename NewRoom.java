
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
public class NewRoom extends javax.swing.JInternalFrame {
public static void main(String args[])
    {
       //new NewRoom();
    }
    /**
     * Creates new form NewRoom
     */
    public NewRoom() {
        initComponents();
         do_connect();
         jPanel3.setEnabled(false);
         this.setSize(465, 540);
    }
    Connection con;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    String sql = null;
    String room="No",food="No",gender= "null";
    int ret =0;
    int bill = 500;
    int days,months,Year;
    int payable,rsf,roomAc;
    int downPayment;
    
    public void do_connect() //throws SQLException, ClassNotFoundException
    {
        try{
            con =  DBConnection.getConnection();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
           
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
    public void nextButt(){
        int a =0;
       String roomId = roomField.getText();
       {
           
       if(nameField.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"please fill name also","Alert",0);
       }
              if(roomField.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"please fill room no","Alert",0);
       }
                     if(mobileField.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"please fill Mobile no. also","Alert",0);
       }
              if(addressField.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"please fill Address also","Alert",0);
       
       }
              a =1;
       }
       try{
        sql = "SELECT *FROM customer WHERE Room_No=?";
            System.out.println("Querry Executed");
            
            pstmt= con.prepareStatement(sql);
            System.out.println(roomId);
            pstmt.setString(1, roomId.trim());
            System.out.println(roomId);
            rs =  pstmt.executeQuery();
            int i =0;
            if(rs.next())
            {
                ++i;
            }if(i>0)
            {
                System.out.println("User Already in database");
                errorLabel.setText("Room is already booked");
                
            }
            else{
                ret =1;
                errorLabel.setText("");
                if(a==1)
                {
                this.setSize(990,600);
                }
            }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    public void submitButt(){
        String roomId,name,mobile,address,checkOutDate;
     Submitbutt.setEnabled(false);
     roomId = roomField.getText();
     String n = nameField.getText();
     name = n.toUpperCase().charAt(0)+n.substring(1,n.length());
     mobile = mobileField.getText();
     address = addressField.getText();
     checkOutDate = outDateField.getText();
     Date d = new Date();
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
     String checkIndate = sdf.format(d);
     System.out.println(d);
     System.out.println(checkIndate);
     
     
    // bill =Integer.parseInt(billField.getText()) ;
     downPayment = Integer.parseInt(downPaymentField.getText());
     if(ret == 1)
     {
     try{
       sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
       pstmt = con.prepareStatement(sql);
       pstmt.setString(1, roomId);
       pstmt.setString(2, name);
       pstmt.setString(3, mobile);
       pstmt.setString(4, address);
       
       pstmt.setString(5, gender);
       pstmt.setString(6, checkIndate);
       
       pstmt.setString(7, food);
       
       pstmt.setString(8, room);
       pstmt.setString(9, checkOutDate);
       pstmt.setInt(10,bill);
       System.out.println(bill);
       pstmt.setInt(11,downPayment);
       
       payable = bill - downPayment;
       System.out.println(payable);
       pstmt.setInt(12, payable);
       
       int i = pstmt.executeUpdate();
       String num = String.valueOf(i);
       System.out.println(i+" records inserted"); 
       if(days>0 && days<=30 && months == 0)
       {
       JOptionPane.showMessageDialog(this,"Room No :"+roomId+"\nName :"+name+"\nMobile :"+mobile+"\n"+food+"="+rsf+"\n"+room+"="+roomAc+"\nCheck out :"+checkOutDate+"\nDays :"+days
               +"\nBill="+bill+"\n Downpayment ="+downPayment+"\nPayable Amount ="+payable              
               +" \n\nThankyou for Using","Succesfuly Booked",1);
       }
       else if(months>0 && months<13 && Year == 0)
       {
           JOptionPane.showMessageDialog(this,"Room No :"+roomId+"\nName :"+name+"\nMobile :"+mobile+"\n"+food+"="+rsf+"\n"+room+"="+roomAc+"\nCheck out :"+checkOutDate+
                                "\nDays :"+days+" Months :"+months
                             +"\nBill="+bill+"\n Downpayment ="+downPayment+"\nPayable Amount ="+payable
                                 +" \n\nThankyou for Using","Succesfuly Booked",1);
       }
       else if(Year>0)
       {
           JOptionPane.showMessageDialog(this,"Room No :"+roomId+"\nName :"+name+"\nMobile :"+mobile+"\n"+food+"="+rsf+"\n"+room+"="+roomAc+"\nCheck out :"+checkOutDate+
                                "\nDays :"+days+" Months :"+months+" Years :"+Year+
                   "\nBill="+bill+"\n Downpayment ="+downPayment+"\nPayable Amount ="+payable
                                 +" \n\nThankyou for Using","Succesfuly Booked",1);
       }
     }catch(Exception e)
     {
         e.printStackTrace();
     }
     }
    }
    public void calculateDate(){
        if(food.equals("Veg"))
       {
           bill = bill +200;
           rsf = 200;
       }
       else if(food.equals("Non-Veg"))
        {
            bill = bill+300;
            rsf = 300;
       }
       if(room.equals("AC"))
       {
           bill = bill+500;
          roomAc =1000;
       }
       else if(room.equals("Non_AC"))
       {
          roomAc =500;
       }
     String arr[] = outDateField.getText().split("/"); // User Given date
     int d = Integer.parseInt(arr[0]);
     int m = Integer.parseInt(arr[1]);
     int y = Integer.parseInt(arr[2]);
     LocalDate d1 = LocalDate.of(y,m,d);// user given date
     LocalDate d2 = LocalDate.now(); // System given date
     Period p = Period.between(d2,d1);
      days = p.getDays();
      months = p.getMonths();
      Year = p.getYears();
     bill = (bill*days) +(bill*30*months)+(bill*365*Year);
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        outDateField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        veg = new javax.swing.JRadioButton();
        nonVeg = new javax.swing.JRadioButton();
        ac = new javax.swing.JRadioButton();
        nonAc = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        roomField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        Back1Butt = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        Malerdio = new javax.swing.JRadioButton();
        femalerdio = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        Submitbutt = new javax.swing.JButton();
        payableField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        downPaymentField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        billField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("New Room Booking");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Food:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Room");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Date of Check Out :");

        outDateField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                outDateFieldFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("New Booking");

        buttonGroup1.add(veg);
        veg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        veg.setText("Veg");
        veg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegActionPerformed(evt);
            }
        });

        buttonGroup1.add(nonVeg);
        nonVeg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nonVeg.setText("Non-Veg");
        nonVeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonVegActionPerformed(evt);
            }
        });

        buttonGroup2.add(ac);
        ac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ac.setText("Ac");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        buttonGroup2.add(nonAc);
        nonAc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nonAc.setText("Non Ac");
        nonAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonAcActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Next");
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
                .addGap(159, 159, 159)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(veg)
                            .addComponent(ac))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nonAc)
                            .addComponent(nonVeg))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veg)
                    .addComponent(nonVeg)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nonAc)
                    .addComponent(ac)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Mobile :");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("Room No:");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Address/pin :");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Gender :");

        roomField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        mobileField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        addressField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Back1Butt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back1Butt.setText("Exit");
        Back1Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ButtActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setText("New Booking");

        errorLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 51, 51));

        buttonGroup3.add(Malerdio);
        Malerdio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Malerdio.setText("Male");
        Malerdio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MalerdioActionPerformed(evt);
            }
        });

        buttonGroup3.add(femalerdio);
        femalerdio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        femalerdio.setText("Female");
        femalerdio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalerdioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back1Butt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 35, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addressField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mobileField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 11, Short.MAX_VALUE)
                                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Malerdio)
                                .addGap(18, 18, 18)
                                .addComponent(femalerdio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Malerdio)
                    .addComponent(femalerdio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextButton)
                    .addComponent(Back1Butt))
                .addGap(29, 29, 29))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        Submitbutt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Submitbutt.setText("Submit");
        Submitbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbuttActionPerformed(evt);
            }
        });

        payableField.setEditable(false);
        payableField.setBackground(new java.awt.Color(255, 255, 255));
        payableField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payableField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                payableFieldFocusLost(evt);
            }
        });
        payableField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payableFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel15.setText("Payable Amount:");

        downPaymentField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        downPaymentField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                downPaymentFieldFocusLost(evt);
            }
        });
        downPaymentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downPaymentFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setText("Down Payment:");

        billField.setBackground(new java.awt.Color(255, 255, 255));
        billField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setText("Bill :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Submitbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(billField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(downPaymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payableField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(downPaymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payableField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submitbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        nextButt();
       Submitbutt.setEnabled(true);
       outDateField.setEnabled(true);
      buttonGroup1.clearSelection();
      buttonGroup2.clearSelection();
      outDateField.setText("");
      outDateField.setEditable(true);
      billField.setText("");
      jPanel1.resetKeyboardActions();
       
        
        
       
    }//GEN-LAST:event_NextButtonActionPerformed

    private void SubmitbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbuttActionPerformed
        submitButt(); 
       this.setSize(465, 540);
       roomField.setText("");
       nameField.setText("");
       mobileField.setText("");
       addressField.setText("");
       buttonGroup3.clearSelection();
    }//GEN-LAST:event_SubmitbuttActionPerformed

    private void vegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegActionPerformed
       if(veg.isSelected())
       {
           food = "Veg";
            System.out.println(food);
          
       }
    }//GEN-LAST:event_vegActionPerformed

    private void nonVegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonVegActionPerformed
       if(nonVeg.isSelected())
       {
           food = "Non-Veg";
          
       }
    }//GEN-LAST:event_nonVegActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        if(ac.isSelected())
       {
           room = "AC";
           System.out.println(room);
          
       }
    }//GEN-LAST:event_acActionPerformed

    private void nonAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonAcActionPerformed
         if(nonAc.isSelected())
       {
           room = "Non-AC";
       }
    }//GEN-LAST:event_nonAcActionPerformed

    private void Back1ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ButtActionPerformed
        MainFrame mnf = new MainFrame();
      mnf.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_Back1ButtActionPerformed

    private void MalerdioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MalerdioActionPerformed
        if(Malerdio.isSelected())
        {
            gender = "Male";
        }
    }//GEN-LAST:event_MalerdioActionPerformed

    private void femalerdioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalerdioActionPerformed
       if(femalerdio.isSelected())
        {
            gender = "Female";
        }
    }//GEN-LAST:event_femalerdioActionPerformed

    private void downPaymentFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_downPaymentFieldFocusLost
     downPayment = Integer.parseInt(downPaymentField.getText());
        payable = bill-downPayment;
        System.out.println(payable);
        payableField.setText(String.valueOf(payable));
    }//GEN-LAST:event_downPaymentFieldFocusLost

    private void downPaymentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downPaymentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downPaymentFieldActionPerformed

    private void outDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_outDateFieldFocusLost
     
    }//GEN-LAST:event_outDateFieldFocusLost

    private void payableFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payableFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_payableFieldFocusLost

    private void payableFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payableFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payableFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
     calculateDate();   
     jPanel2.resetKeyboardActions();
    
     
     billField.setText(String.valueOf(Math.abs(bill)));
    // billField.setEditable(false);
     jPanel3.setEnabled(false);
     downPaymentField.setText("");
     payableField.setText("");
     jButton1.setVisible(false);
     outDateField.setEditable(false);
    /* roomField.setText("");
     nameField.setText("");
     mobileField.setText("");
     addressField.setText("");
     */
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1Butt;
    private javax.swing.JRadioButton Malerdio;
    private javax.swing.JButton NextButton;
    private javax.swing.JButton Submitbutt;
    private javax.swing.JRadioButton ac;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField billField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField downPaymentField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JRadioButton femalerdio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton nonAc;
    private javax.swing.JRadioButton nonVeg;
    private javax.swing.JTextField outDateField;
    private javax.swing.JTextField payableField;
    private javax.swing.JTextField roomField;
    private javax.swing.JRadioButton veg;
    // End of variables declaration//GEN-END:variables
}
