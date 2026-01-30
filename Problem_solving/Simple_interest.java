package problems;
import java.util.Scanner;
public class Simple_interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of p:");
		int a=sc.nextInt();
		System.out.println("Enter the value of r:");
		int b=sc.nextInt();
		System.out.println("Enter the value of t:");
		int c=sc.nextInt();
		float interest=(a*b*c)/100;
System.out.println("Simple interest:"+interest);
sc.close();
	}

}
