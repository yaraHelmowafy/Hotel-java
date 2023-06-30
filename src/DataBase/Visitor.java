//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package DataBase;

import static DataBase.database.setConnection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Visitor extends database implements HotelDB
{
   public static ResultSet Select()
    {
        ResultSet rs = null;
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "SELECT * FROM visitor";
            rs = stmt.executeQuery(str);
            return rs;
        }
        catch(SQLException ex)
        {
            System.out.println("the select method is wrong");
        }
        return rs;
    }
   
   public static void Add( String Name, int Residence,String NationalID,String Phone,int NumberOfRooms,int Deposite,int TotalAmoun)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "INSERT INTO visitor VALUES ('"+ Name + "'," +  Residence + ",'" + NationalID + "','" + Phone + "'," + NumberOfRooms + "," + Deposite + "," + TotalAmoun + ")";
            stmt.executeUpdate(str);
            con.close();
        } 
        catch (SQLException ex)
        {
           System.out.println("the add method is wrong");
        }
        
    }
    
    public static void Delete(int PassCode)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "DELETE FROM Visitor WHERE PassCode = " + PassCode;
            stmt.executeQuery(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the Delete method is wrong");
        }
    }
    
}
  

