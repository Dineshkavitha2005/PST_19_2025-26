package problems;
import java.util.Scanner;
public class Neon_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int square=num*num;
		int sum=0;
		int digit;
		while(square>0) {
			digit=square%10;
			sum+=digit;
			square=square/10;
			
		}
		if(sum==num) {
				System.out.println("The given number is neon number.");
			}
			else {
				System.out.println("The given number is not a neon number.");
			}
sc.close();
	}

}
