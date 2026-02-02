package problems;
import java.util.Scanner;
public class Armstrong_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=scan.nextInt();
		int temp=x;
		int original_number=x;
		long count=0;
		while(x!=0) {
			count++;
			x/=10;
		}
		long sum=0;
		while(temp!=0) {
			int digit=temp%10;
			long power=1;
			for(int i=0;i<count;i++) {
				power*=digit;
			}
			sum+=power;
			temp/=10;
			
		}
		if(sum==original_number) {
			System.out.println("The given number is an armstrong number.");
		}
		else {
			System.out.println("The given number is not an armstrong number.");
		}
			scan.close();
		}
	

	}


