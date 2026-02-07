package OOP_concept;

public class Argument_passing {
//Passing Argument
	public static void main(String[] args) {
		int num1=70;
		int num2=50;
		System.out.println(add(num1,num2));
		System.out.println(sub(num1,num2));
		System.out.println(mul(num1,num2));
		System.out.println(mod(num1,num2));
		System.out.println(div(num1,num2));

	}
public static int add(int num1, int num2) {
	return num1+num2;
}
public static int sub(int num1, int num2) {
	return num1-num2;
}
public static int mul(int num1, int num2) {
	return num1*num2;
}
public static int mod(int num1, int num2) {
	return num1%num2;
}
public static int div(int num1, int num2) {
	return num1/num2;
}
}

