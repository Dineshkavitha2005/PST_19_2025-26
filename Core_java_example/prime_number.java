package PST;
import java.util.Scanner;
public class prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int temp=0;
		for(int i=2;i<a;i++) {
			if (a%i==0) {
				temp=1;
				break;}
		}
		if(temp==1) {
				System.out.println("The given number is not a prime number.");
			}
			else {
				System.out.println("The given number is prime number.");
			}
			sc.close();
		}
		

	}
