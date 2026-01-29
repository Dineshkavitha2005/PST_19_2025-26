package core_java;
import java.util.Scanner;
public class Largest_element_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		
		System.out.println("Enter the size of array:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the elemets:");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();}
		
			int largest=arr[0];
			for(int i=0;i<num;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		
		
}System.out.println("The largest number is:"+largest);
sc.close();
}
}



