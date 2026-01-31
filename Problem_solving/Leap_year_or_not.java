package problems;
import java.util.Scanner;
public class Leap_year_or_not {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=scan.nextInt();
		if(year%4==0 || year%400==0 && year%100!=0  ) {
			System.out.println("The given year is leap year.");
		}
		else {
			System.out.println("The given year is not a leap year.");
		}
		scan.close();
	}

}
