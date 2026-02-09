package problems;
import java.util.Scanner;
public class Ascii_for_character {

	public static void main(String[] args) {
		character.ascii();

	}

}
class character {
	public static void ascii() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ASCII value:");
		int a=sc.nextInt();
		System.out.println("The character for the given ASCII value is:"+(char)a);
		sc.close();
	}
}