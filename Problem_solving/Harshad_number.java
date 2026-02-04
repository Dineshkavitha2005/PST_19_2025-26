package problems;
import java.util.Scanner;
public class Harshad_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		if(temp%sum==0) {
			System.out.println("The given number is harshad number.");
		}
		else {
			System.out.println("The given number is not a harshad number.");
		}
		sc.close();
	}

}
