package problems;
import java.util.Scanner;
public class Reverse_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int i=0;
		while(num!=0) {
			int b=num%10;
		i=i*10+b;
		num/=10;
		}
System.out.println("Reverse of a given number:"+i);
sc.close();
	}

}
