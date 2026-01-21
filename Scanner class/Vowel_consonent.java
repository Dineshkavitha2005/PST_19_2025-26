package PST;
import java.util.Scanner;
public class Vowel_consonent {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a character:");
	String x=scan.next();
	if(x.equals("a")||(x.equals("e"))||(x.equals("i"))||(x.equals("o"))||(x.equals("u"))) {
		System.out.println("The given character is vowel.");
	}
	else {
		System.out.println("The given character is consonent.");
	}
scan.close();
	}

}
