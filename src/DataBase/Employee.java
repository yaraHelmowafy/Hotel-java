//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Employee extends database implements HotelDB
{
    public static ResultSet Select()
    {
        ResultSet rs = null;
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "SELECT * FROM employee";
            rs = stmt.executeQuery(str);
            return rs;
        }
        catch(SQLException ex)
        {
            System.out.println("the select method is wrong");
        }
        return rs;
    }
    
    public static ResultSet Select(int id)
    {
        ResultSet rs = null;
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "SELECT * FROM Employee WHERE ID = " + id;
            rs = stmt.executeQuery(str);
        }
        catch(SQLException ex)
        {
            System.out.println("the select method is wrong");
        }
        return rs;
    }
    
    public static void Add(int id, String username, double salary, String typestaff, String email)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "INSERT INTO employee VALUES (" + id + ",'" + username + "'," + salary + ",'" + typestaff + "','" + email + "')";
            stmt.executeUpdate(str);
            con.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void Delete(String table,int id)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "DELETE FROM " + table + " WHERE ID = " + id;
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the Delete method is wrong");
        }
    }
    
   


    
   
    }
    



