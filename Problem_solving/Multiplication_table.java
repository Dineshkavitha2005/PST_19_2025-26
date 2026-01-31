package problems;
import java.util.Scanner;
public class Multiplication_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		System.out.println("The multiplication table of a given number is:");
		 for (int i=1;i<=20;i++) {
			System.out.println(i+"X"+ a +"="+(a*i));	
sc.close(); 
	}

}
}