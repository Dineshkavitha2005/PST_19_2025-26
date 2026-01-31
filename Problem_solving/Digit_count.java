package problems;
import java.util.Scanner;
public class Digit_count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int count=0;
		while(a!=0) {
			count++;
			a/=10;
		}
		System.out.println("Total count:"+count);
		sc.close();
	}
}