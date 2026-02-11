package Type_convesion;
import java.util.Scanner;
public class Double_to_string {

	public static void main(String[] args) {
		input();

	}
public static void input() {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the double number:");
		double num=sc.nextInt();
		String str=Double.toString(num);
		System.out.println("Converted string:");
		System.out.println(str);
		sc.close();
}
}
