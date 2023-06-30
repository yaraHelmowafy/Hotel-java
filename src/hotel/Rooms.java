//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package hotel;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class Rooms  implements Information
{ 
int RoomNumber;
  private boolean Availability;
    private int VisitorNo;
    public Rooms( boolean Availability, int VisitorNo) 
    {
      this.Availability = Availability;
        this.VisitorNo = VisitorNo;
    }
    Scanner scan = new Scanner(System.in);
    public boolean isAvailability() {
        return Availability;
    }
    public void setAvailability(boolean Availability) 
    {
        this.Availability = Availability;
        DataBase.Rooms.Update("Availability", Availability, RoomNumber);
    }
    public int getVisitorNo() {
        return VisitorNo;
    }
    public void setVisitorNo(int VisitorNo)
    {
        this.VisitorNo = VisitorNo;
        DataBase.Rooms.Update("VisitorNo", VisitorNo, RoomNumber);
    }
    public static int Search(String room)
    { 
        ArrayList<Rooms> h = Hotel.getRoomsList();
        for(int i=0; i<h.size(); i++)
        {
            if(room.equals(h.get(i).getRoomNumber()))
            {
                return h.get(i).getVisitorNo();
            }
        }
        return 0;
    }
    @Override
    public int getRoomNumber() 
    {
        System.out.println("Enter the RoomNumber");
         RoomNumber = scan.nextInt();      
          return RoomNumber;
    }
    @Override
      public String getRoomType()
      {
     System.out.println("Enter the type");    
     String Type = scan.nextLine();
     return Type;
    }
    public static int Search(int VisitorNo)
    { 
        ArrayList<Rooms> h = Hotel.getRoomsList();
        for(int i=0; i<h.size(); i++)
        {
            if(VisitorNo == h.get(i).getVisitorNo())
            {
                return h.get(i).getRoomNumber();
            }
        }
      return 0;
       }
}

    


