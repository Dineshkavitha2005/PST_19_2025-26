package Type_convesion;
import java.util.Scanner;
public class Integer_to_string {

	public static void main(String[] args) {
		input();

	}
public static void input(){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer number:");
		int a=sc.nextInt();
	    String str=Integer.toString(a);
	    System.out.println("Converted string:");
	    System.out.println(str);
sc.close();	
}
}
