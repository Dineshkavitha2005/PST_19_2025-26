package OOP_concept;
// Inheritance extends class
//Method overriding
public class Polymorphism_2 {

	public static void main(String[] args) {
		b pst=new b();
		pst.poly_1();
	}

}
class a{
	 void poly_1() {
		System.out.println("HELLO");
	}
}
class b extends  a{
		void poly_1() {
			System.out.println("JAVA");
		}
}
