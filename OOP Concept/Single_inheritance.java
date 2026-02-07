package OOP_concept;

public class Single_inheritance {

	public static void main(String[] args) {
     pt obj=new pt();
     obj.hello(); 
     obj.java();
     
	}

}
class pst {
	 void hello() {
		 System.out.println("Hello");
		
	}
	
}
class pt extends pst{
	 void java() {
		System.out.println("World");
	}
}