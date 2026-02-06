package OOP_concept;

public class Polymorphism {
//Inherit multiple methods (inheritance)
	public static void main(String[] args) {
	System.out.println(method1());

	}
 public static int method1() {
	 int a=50;
	System.out.println(method2());
	return a;
	
}
 public static float method2() {
	 float b=23;
	 System.out.println(method3());
	 return b;
 }
 public static String method3() {
	 String c= "Hello";
	 return c;
 }
}
