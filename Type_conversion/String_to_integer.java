package Type_convesion;
import java.util.Scanner;
public class String_to_integer {

	public static void main(String[] args) {
		
	    alt();
        
	}
public static void alt() {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string number:");
	    String str=sc.next();
	int number=Integer.valueOf(str);
	System.out.println("Converted integer:");
	System.out.println(number);
	sc.close();
}
}
