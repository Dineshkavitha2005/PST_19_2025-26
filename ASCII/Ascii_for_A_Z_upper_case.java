package problems;

public class Ascii_for_A_Z_upper_case {

	public static void main(String[] args) {
	ask.A_Z();

	}

}
class ask{
	public static void A_Z(){
		System.out.println("ASCII values for uppercase from A to Z:");
	    for(int i=65;i<=90;i++) {
	    	System.out.println((char)i+ "-"+(int)i);
	    }
	}
}