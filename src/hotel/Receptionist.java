//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package hotel;
import java.util.ArrayList;
public class Receptionist extends Employee
{
    private String Language;
    private static int NextID;
    public Receptionist(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email, String Language)
    {
        super(FirstName, LastName, Id, Username, Password, Salary, Email);
        this.Language = Language;
    }
    public String getLanguage()
    {
        return Language;
    }
    public static boolean login(String Username ,String pass)
    { 
        ArrayList<Employee> r = Hotel.getReceptionistList();
        for(int i=0; i<r.size(); i++)
        {
            if(Username.equals(r.get(i).getUsername()))
            {
                Employee.setCurrentStaff(i);
                return (pass.equals(r.get(i).getPassword()));
            }
        }
        return false;
    }
    public static int getNextID()
    {
        return NextID;
    }

    public static void setNextID(int NextID) 
    {
        Receptionist.NextID = NextID + 1;
    }
    public static void delete (int id)
    {
        DataBase.Employee.Delete("reception", id);
    }
}

