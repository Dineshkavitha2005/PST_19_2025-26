package ASCII;

public class ASCII_for_lower_case_a_z {

	public static void main(String[] args) {
	me.a_z();

	}

}
class me{
	public static void a_z(){
		System.out.println("ASCII values for lowercase from a to z:");
	    for(int i=97;i<=122;i++) {
	    	System.out.println((char)i+ "-"+(int)i);
	    }
	   
	}
}