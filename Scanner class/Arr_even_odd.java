package PST;
import java.util.Scanner;
public class Arr_even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the element:");
		int a=sc.nextInt();
		sc.nextLine();
		int arr[]=new int[a];
		System.out.println("Enter the number:");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				System.out.println("The given number is even.");
			}
			else {
				System.out.println("The given number is odd.");
			}
		}
		
	}
}
