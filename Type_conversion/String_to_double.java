package Type_convesion;
import java.util.Scanner;
public class String_to_double {

	public static void main(String[] args) {
		output();

	}
public static void output() {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string number:");
		String num=sc.next();
		Double d= Double.valueOf(num);
		System.out.println("Converted double:");
		System.out.println(d);
		sc.close();
}
}
