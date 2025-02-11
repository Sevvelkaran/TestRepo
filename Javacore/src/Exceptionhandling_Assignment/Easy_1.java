package Exceptionhandling_Assignment;
import java.util.*;
class NoMatchException extends Exception {
    public NoMatchException() {
        super("Invalid Country: Citizenship must be of India");
    }
}
class Details{
	 String aadhar, name, city, state, country;
	    
	    Details(String aadhar, String name, String city, String state, String country) throws NoMatchException {
	        if (!country.equalsIgnoreCase("India")) throw new NoMatchException();
	        this.aadhar = aadhar;
	        this.name = name;
	        this.city = city;
	        this.state = state;
	        this.country = country;
	    }
	    void display () {
	    	System.out.println("Aadhar: " + aadhar + "\nName: " + name + "\nCity: " + city + "\nState: " + state + "\nCountry: " + country);
	    }
}
public class Easy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);


try {
System.out.println("Aadhar");
String AadharNumber = sc.next();
System.out.println("City");

String City = sc.next();
System.out.println("Name");

String Name = sc.next();
System.out.println("State");

String State = sc.next();
System.out.println("Country");

String Country = sc.next();
	
Details c = new Details(AadharNumber, Name, City, State, Country);
c.display();
}
catch(NoMatchException e) {
	System.out.println(e);
}

	}

}
