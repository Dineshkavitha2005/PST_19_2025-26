package problems;
import java.util.Scanner;
public class Automorphic_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int digit=num;
		int square=digit*digit;
        if(num%10==square%10) {
        	System.out.println("The given number is automorphic number.");
        }
        else {
        	System.out.println("The given number is not automorphic number.");
        }
        sc.close();
	}

}
