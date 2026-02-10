package Type_convesion;
import java.util.Scanner;
public class Character_to_string {

	public static void main(String[] args) {
		hello();

	}
public static void hello() {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		String str= Character.toString(ch);
		System.out.println("Converted string:");
		System.out.println(str);
		sc.close();
}
}
