package problems;
import java.util.Scanner;
public class Pattern_horizontal_vertical {

	public static void main(String[] args) {
		pst obj=new pst();
	    obj.hello();
	}
}
class pst{
	void hello() { 
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Pattern in vertical:");
		for(int i=0;i<num;i++) {
			System.out.println("*");
			
		}
		System.out.println("Pattern in horizontal:");
		for(int j=0;j<num;j++) {
			System.out.print("*");
		}
		sc.close();
	}
}
