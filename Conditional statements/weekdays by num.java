/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int day;
	    day=0;
	    String dayname;
	    switch (day){
	        case 1:
	            dayname="Sunday";
	            break;
	            case 2:
	                dayname="Monday";
	                break;
	                case 3:
	                    dayname="Tuesday";
	                    break;
	                    case 4:
	                        dayname="Wednesday";
	                        break;
	                        case 5:
	                            dayname="Thursday";
	                            break;
	                            case 6:
	                                dayname="Friday";
	                                break;
	                                case 7:
	                                    dayname="Saturday";
	                                    break;
	                                    default:
	                                    dayname="Invalid Date";
	
	    }
		System.out.println(dayname);
	}
}
