//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package hotel;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Hotel {
    private static ArrayList<Employee> ReceptionistList = new ArrayList<Employee>();
    private static ArrayList<Employee> ManagerList = new ArrayList<Employee>();
    private static ArrayList<Visitor> VisitorList = new ArrayList<Visitor>();
    private static ArrayList<Rooms> RoomsList = new ArrayList<Rooms>();
    public static ArrayList<Employee> getReceptionistList() {
        return ReceptionistList;
    }
    public static void AddReceptionist(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email, String Language) {
        ReceptionistList.add(new Receptionist(FirstName, LastName, Id, Username, Password, Salary, Email, Language)); 
    }
    public static ArrayList<Employee> getManagerList() {
        return ManagerList;
    }
    public static void AddManagerList(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email, String Position)
    {
        ManagerList.add(new Manager(FirstName, LastName, Id, Username, Password, Salary, Email, Position));   
        
    }
    public static ArrayList<Visitor> getVisitorList() {
        return VisitorList;
    }
    public static ArrayList<Rooms> getRoomsList() {
        return RoomsList;
    }
    public static void setRoomsList(ArrayList<Rooms> HotelRoomList) {
        Hotel.RoomsList = HotelRoomList;
    }
    public static void AddVisitorList(int VisitorNo, String FirstName, String SecondName, String LastName,String NationalId,
                                      int Age, String Phone, String National, int RoomNo, String Arrival, int Nights, String Departure, 
                                      double Deposite, double TotalAmount, String Status) {
       VisitorList.add(new Visitor(VisitorNo, FirstName,LastName, NationalId,Phone,RoomNo,Nights,Deposite, TotalAmount));
    }
   public static void LoadReceptionist ()
    {
        Receptionist.setNextID(0);
        ResultSet rs = DataBase.Employee.Select(0);
        try 
        {
            while(rs.next())
            {
              Employee RecEmp = new Receptionist(rs.getString("FirstName"), rs.getString("LastName"), 
                                                 rs.getInt("ID"), rs.getString("username"), rs.getString("pass"),
                                                 rs.getDouble("salary"), rs.getString("email"), rs.getString("language"));
                ReceptionistList .add(RecEmp);
                Receptionist.setNextID(rs.getInt("ID"));
            }
            rs.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void LoadManager ()
    {
       ResultSet rs = DataBase.Employee.Select();
        try 
        {
            while(rs.next())
            {
                Employee mng = new Manager(rs.getString("FirstName"), rs.getString("LastName"),
                                           rs.getInt("ID"), rs.getString("username"), 
                                           rs.getString("pass"), rs.getDouble("salary"), rs.getString("email"), 
                                           rs.getString("position"));
                ManagerList.add(mng);
            }
            rs.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void LoadVisitor ()
    {
        Visitor.setVisitorNextNo(0);
       ResultSet rs = DataBase.Visitor.Select();
        try 
        {
            while(rs.next())
            {
                Visitor gst = new Visitor(rs.getInt("VisitorNo"), rs.getString("FirstName"), 
                                          rs.getString("LastName"), rs.getString("NationalID"),
                                          rs.getString("phone"), rs.getInt("NumbersOfRooms"),  
                                          rs.getInt("nights"), rs.getDouble("deposit"), rs.getDouble("TotalAmount"));
                VisitorList.add(gst);
                Visitor.setVisitorNextNo(rs.getInt("VisitorNo"));
            }
            rs.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   private static void LoadHotelRooms ()
    {
        ResultSet rs = DataBase.Rooms.Select();
        try 
        {
            while(rs.next())
            {
                Rooms hr = new Rooms(rs.getBoolean("Availability"), rs.getInt("VisitorNo"));
                RoomsList.add(hr);
            }
            rs.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void LoadData ()
    {
        LoadReceptionist();
        LoadManager ();
        LoadVisitor ();
        LoadHotelRooms ();
    }
}

