//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package DataBase;

import static DataBase.database.setConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Rooms extends database implements HotelDB
{
    public static ResultSet Select()
    {
        ResultSet rs = null;
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "SELECT * FROM rooms";
            rs = stmt.executeQuery(str);
            return rs;
        }
        catch(SQLException ex)
        {
            System.out.println("the select method is wrong");
        }
        return rs;
    }
    
    public static void Update(String ColumnName, boolean value, int RoomNumber)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE rooms SET " + ColumnName + " = " + value + " WHERE RoomNumber = " + RoomNumber;
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    
    public static void Update(String ColumnName, int value, int RoomNumber)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE rooms SET " + ColumnName + " = " + value + " WHERE RoomNumber = " + RoomNumber;
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    public static void Add(int RoomNumber, int VisitorNo ,boolean Availability)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "INSERT INTO rooms VALUES (" + RoomNumber + "'," + VisitorNo + "','" + Availability + "')";
            stmt.executeUpdate(str);
            con.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


