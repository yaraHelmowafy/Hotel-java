//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package hotel;

/**
 *
 * @author Dell
 */

public abstract class Employee extends Person{
    private int Id ;
    private String Username ;
    private String Password ;
    private double Salary ;
    private String Email ;
    private static int CurrentStaff;
    private static boolean TypeStaff;

    public Employee(){
    
    }

    public Employee(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email) {
        super(FirstName, LastName);
        this.Id = Id;
        this.Username = Username;
        this.Password = Password;
        this.Salary = Salary;
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public double getSalary() {
        return Salary;
    }

    public String getEmail() {
        return Email;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public static int getCurrentStaff() {
        return CurrentStaff;
    }

    public static void setCurrentStaff(int CurrentStaff) {
        Employee.CurrentStaff = CurrentStaff;
    }

    public static boolean isTypeStaff() {
        return TypeStaff;
    }

    public static void setTypeStaff(boolean TypeStaff) {
        Employee.TypeStaff = TypeStaff;
    }
    
    
    
    public void update(String coloum_name ,String updated){}
    public void update(String coloum_name ,double updated){}
    
    
}
