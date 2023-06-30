//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package hotel;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;


public class Manager extends Employee {
    String Position;
    
    public Manager(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email, String Position) {
        super(FirstName, LastName, Id, Username, Password, Salary, Email);
        this.Position = Position;
    }
    
    public static boolean login(String Username ,String pass)
    { 
        ArrayList<Employee> m = Hotel.getManagerList();
        for(int i=0; i<m.size(); i++)
        {
            if(Username.equals(m.get(i).getUsername()))
            {
                Employee.setCurrentStaff(i);
                return (pass.equals(m.get(i).getPassword()));
            }
        }
        return false;
    }
    
   public static void delete (int id)
    {
        DataBase.Employee.Delete("manager", id);
    }
    
   
}
