package problems;
import java.util.Scanner;
public class Strong_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int original=num;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			int factorial=1;
			for(int i=1;i<=digit;i++) {
				factorial*=i;
			}
			sum=sum+factorial;
			num=num/10;
			}
			if(sum==original) {
				System.out.println("The given number is strong number.");
			}
			else {
				System.out.println("The given number is not a strong number.");
			}
	
		
sc.close();
	}

	}

