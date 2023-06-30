//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package hotel;
public class supplier extends Person {
    private String company;
    private int SupplierID;
    public supplier(String company, int SupplierID, String FirstName, String LastName) {
        super(FirstName, LastName);
        this.company = company;
        this.SupplierID = SupplierID;
    }
    /*** @return the company*/
    public String getCompany() {
        return company;
    }
    /*** @param company the company to set*/
    public void setCompany(String company) {
        this.company = company;
    }
    public int getSupplierID() {
        return SupplierID;
    }
    /*** @param SupplierID the SupplierID to set*/
    public void setSupplierID(int SupplierID) {
        this.SupplierID = SupplierID;
    }
}