package OOP_concept;
import java.util.Scanner;
public class Argument_passing_scanner_class {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:");
	int num1=sc.nextInt();
	System.out.println("Enter the second number:");
	int num2=sc.nextInt();
	System.out.println(add(num1,num2));
	System.out.println(sub(num1,num2));
	System.out.println(mul(num1,num2));
	System.out.println(mod(num1,num2));
	System.out.println(div(num1,num2));
sc.close();
}
public static int add(int num1, int num2) {
	System.out.println("Addition:");
return num1+num2;
}
public static int sub(int num1, int num2) {
	System.out.println("Subtraction:");
return num1-num2;
}
public static int mul(int num1, int num2) {
	System.out.println("Multipilcation:");
return num1*num2;
}
public static int mod(int num1, int num2) {
	System.out.println("Modulus:");
return num1%num2;
}
public static int div(int num1, int num2) {
	System.out.println("Division:");
return num1/num2;

}

}


	


