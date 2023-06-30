//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package hotel;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.scene.chart.PieChart.Data;
public class Visitor extends Person 
{
    private int VisitorNo;
    private String NationalId;
    private String Phone;
    private int NumbersOfRooms;
    private int Nights;
    private double Deposite;
    private double TotalAmount;
    private static int VisitorNextNo;
    private static int CurrentVisitorNo;
    public Visitor(int VisitorNo, String FirstName,String LastName,String NationalId,String Phone,int NumbersOfRooms,int Nights,double Deposite,double TotalAmount)
    {
        super(FirstName, LastName);
        this.VisitorNo = VisitorNo;
        this.NationalId = NationalId;
        this.Phone = Phone;
        this.NumbersOfRooms = NumbersOfRooms;
        this.Nights = Nights;
        this.Deposite = Deposite;
        this.TotalAmount = TotalAmount;
    }
    public static int getCurrentVisitorNo() {
        return CurrentVisitorNo;
    }
    public static void setCurrentVisitorNo(int CurrentVisitorNo) {
        Visitor.CurrentVisitorNo = CurrentVisitorNo;
    }
    public static int getVisitorNextNo() {
        return VisitorNextNo;
    }
    public static void  setVisitorNextNo(int VisitorNextNo) {
        Visitor.VisitorNextNo = VisitorNextNo + 1;
    }
    public int getVisitorNo() {
        return VisitorNo;
    }
    public String getNationalId() {
        return NationalId;
    }
   
    public String getPhone() {
        return Phone;
    }
   
    public int getNumbersOfRooms() {
        return NumbersOfRooms;
    }
 
    public int getNights() {
        return Nights;
    }
    public double getDeposite() {
        return Deposite;
    }
    public double getTotalAmount() {
        return TotalAmount;
    }
    public static int Search(String name)
    { 
        ArrayList<Visitor> g = Hotel.getVisitorList();
        String Name[] = name.split(" ");
        for(int i=0; i<g.size(); i++)
        {
            if(Name[0].equals(g.get(i).getFirstName()))
            {
                return i;
            }
        }
        return -1;
    }
    public static boolean login(String Rooms ,String passCode)
    { 
        ArrayList<Rooms> g = Hotel.getRoomsList();
        for(int i=0; i<g.size(); i++)
        {
            if(Rooms.equals(g.get(i).getRoomNumber()))
            {
                Visitor.setCurrentVisitorNo(i);
                return (passCode.equals(g.get(i).getVisitorNo()));
            }
        }
        return false;
    }
    /*** @param VisitorNo the VisitorNo to set*/
    public void setVisitorNo(int VisitorNo) {
        this.VisitorNo = VisitorNo;
    }
}