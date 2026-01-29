package core_java;
import java.util.Scanner;
public class Sum_of_array_elements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array elements:");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the number:");
		int sum=0;
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
			sum +=arr[i];
		}
	System.out.println("The sum of number is:" + sum);
	sc.close();
	}		
}