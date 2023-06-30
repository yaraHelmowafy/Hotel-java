//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package hotel;

public abstract class Person {
    private String FirstName ;
    private String LastName ;
    
    public Person(){
    }

    public Person(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }}
    
  