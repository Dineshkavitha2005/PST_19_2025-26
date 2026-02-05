package problems;
import java.util.Scanner;
public class Duck_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		   int Zero=0;
		   while(num!=0) {
			    if(num%10==0 && num/10!=0) {
			    	
			    	Zero=1;
			    	break;
			    }num/=10;
		   
		   }
		   if(Zero==1) {
			   System.out.println("This is Duck Number");
		   }
		   else {
			   System.out.println("This is not Duck Numaber");
		   }
		   sc.close();
}
} 