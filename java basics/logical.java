/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int x,y,z;
	    x=25;
	    y=35;
	    z=10;
	    if(x<y&&y<z){
		System.out.println("true");
	        
	    }
		else{
		    System.out.println("false");
		}
         if(x<y||y<z){
		System.out.println("true");
	        
	    }
		else{
		    System.out.println("false");
		    
		}
		if(x<y != y<z){
		System.out.println("true");
	        
	    }
		else{
		    System.out.println("false");
		    
		}
	}
}
