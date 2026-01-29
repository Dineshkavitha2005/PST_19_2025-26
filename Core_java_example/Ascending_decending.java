package core_java;
import java.util.Scanner;
public class Ascending_decending {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size:");
		int num=scan.nextInt();
		int arr[]=new int[num];
		
		System.out.println("Enter an array element:");
		for(int i=0;i<num;i++) {
			
			arr[i]=scan.nextInt();}
		for(int i=0;i<num-1;i++) {
			for(int j=0;j<num-1;j++) {
		if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}	
			}
			
		}
		System.out.println("Ascending number:");
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" Descending number :");
		for(int i=num-1;i>=0;i--) {
			
		
		System.out.println(arr[i]);
		}
		scan.close();
}
}


