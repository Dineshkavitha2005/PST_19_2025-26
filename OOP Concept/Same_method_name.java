package OOP_concept;

public class Same_method_name {
//Method overloading
	public static void main(String[] args) {
		int a=12;
		int b=34;
		int c=56;
	 System.out.println(hello(a,b));
	 System.out.println(hello(a,b,c));
	}
public static int hello(int a,int b) {
	return a+b;
}
public static int hello(int a,int b,int c) {
	return a+b+c;
}
}
