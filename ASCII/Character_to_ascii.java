package ASCII;
import java.util.Scanner;
public class Character_to_ascii {
public static void main(String args[]) {
	ascii.as();
}
	

}
class ascii{
	public static void as() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an charcter:");
		char a=sc.next().charAt(0);
		int ascii=a;
		System.out.println("The ascii value of the given character is:"+ascii);
		sc.close();
	}
}