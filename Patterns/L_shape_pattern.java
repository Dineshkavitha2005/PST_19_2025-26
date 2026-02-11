package Pattern;
import java.util.Scanner;
public class L_shape_pattern {

	public static void main(String[] args) {
		patt();

	}
public static void patt() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	System.out.println("L shaped pattern:");
	for(int i=0;i<num-1;i++) {
		System.out.println("*");
		
	}
	for(int j=0;j<num;j++) {
		System.out.print("*");
	}
	sc.close();
}
}
