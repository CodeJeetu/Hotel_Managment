
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jitendra
 */
public class DBConnection {
   static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    static final String Db_Url = "jdbc:mysql://localhost:3306/hotel";
    static final String user = "root";
    static final String pass = "root";
   
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
         Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection(Db_Url, user, pass);
                return con;
    
}
}