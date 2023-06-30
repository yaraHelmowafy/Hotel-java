//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class database
{
    private static String url = "";
    private static String dbName = "Hotel";
    static Connection con;
    static Statement stmt;
    
    static void setURL(){
        url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&characterEncoding=UTF-8";
    }
    
    static void setConnection(){
        
        try {
            setURL();
            con = DriverManager.getConnection(url, "root", "root");
        }
        catch (SQLException ex) {
            
            System.out.println("url is incorrect");
        }
        
    }
    
   
}

