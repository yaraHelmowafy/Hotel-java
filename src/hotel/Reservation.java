//Created By (19100910 Yara Elmowafy ),(19102301 Habiba Gehad),(19103591 Sarah Mahfouz)
package hotel;
public class Reservation {
    private final static double SingleRoom =1000;
    private final static double DoubleRoom = 1500 ;
    private final static double SweetRoom = 2500 ;
        public static double TotalAmount(int RoomsNo[], int Nights)
    {
        return (RoomsNo[2]*SingleRoom + RoomsNo[1]*DoubleRoom + RoomsNo[0]*SweetRoom)*Nights;
    }
    public static String CalculateDate(String Arrivals_str, int nights)
    {
        String Arrivals[] = Arrivals_str.split("-");
        String Departure_str = Arrivals[0] + "-" + 
                    (Integer.parseInt(Arrivals[1])+(Integer.parseInt(Arrivals[2])+nights)/(31+Integer.parseInt(Arrivals[1])%2)) + "-" + 
                    ((Integer.parseInt(Arrivals[2])+nights)%(31+Integer.parseInt(Arrivals[1])%2));
        return Departure_str;
    }
    public static int CalculateNights(String Arrivals_str, String Departure_str)
    {
        String Arrivals[] = Arrivals_str.split("-");
        String Departures[] = Departure_str.split("-");
        int nights = Integer.parseInt(Departures[2])-Integer.parseInt(Arrivals[2])
                +(Integer.parseInt(Departures[1])-Integer.parseInt(Arrivals[1]))
                *(31+Integer.parseInt(Departures[1])%2+Integer.parseInt(Arrivals[1])%2);
        return nights;
    }    
}

