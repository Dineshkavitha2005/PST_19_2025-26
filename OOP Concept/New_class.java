package OOP_concept;

public class New_class {

	public static void main(String[] args) {
		First.first_sem();
		
	}
}
 class First{
	public static void first_sem() {
		System.out.println("Harish");
		second_sem();
	}
 public static void second_sem(){
	 System.out.println("Ajin");
	 mid_sem();
 }
 public static void mid_sem(){
	 System.out.println("Prajith");
	 half_sem();
 }
 public static void half_sem(){
	 System.out.println("Gokul");
	 Second.second_year();
 }

 
 class Second{
	public static void second_year(){
		System.out.println("Rishi");
		third_sem();
		
	}
	public static void third_sem() {
	 System.out.println("Rajan");
	 fourth_sem();
}
	 public static void fourth_sem(){
		 System.out.println("Udhay");
		mid_third();
	 }
	 public static void mid_third(){
		 System.out.println("sarath");
	 }
	
 }

 }