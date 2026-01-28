package PST;
import java.util.Scanner;
public class number_palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int number= sc.nextInt();
		int originalNumber= number;
		int reversedNumber=0;
		while(number!=0) {
			int value=number % 10;
			reversedNumber=reversedNumber * 10 + value;
			number /=10;
		}
		if(originalNumber==reversedNumber) {
			System.out.println("The given number is palindrome.");
		}
		else {
			System.out.println("The given number is not a palindrome.");
		}
		
	sc.close();
	}

}
