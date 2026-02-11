package ASCII;
import java.util.Scanner;
public class ASCII_value_of_string {

	public static void main(String[] args) {
		she();

	}


public static void she() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String ch=sc.next();
	System.out.println("ASCII value of given string:");
	for(int i=0;i<ch.length();i++) {
		char character=ch.charAt(i);
		int a=(int)character;
		
		System.out.println(character+"-"+a);
	
		
	}
	sc.close();
}
}
