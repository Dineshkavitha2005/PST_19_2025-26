package Type_convesion;
import java.util.Scanner;
public class String_to_character {

	public static void main(String[] args) {
		temp();

	}
public static void temp() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=sc.next();
	char[] ch=str.toCharArray();
	System.out.println("Converted character:");
	System.out.println(ch);
	sc.close();
	
	
}
}
