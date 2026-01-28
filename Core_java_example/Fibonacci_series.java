package PST;
import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int a = scan.nextInt();
		int first = 0;
		int second = 1;
		System.out.print(first + " " + second);
		for (int i = 2; i < a; i++) {
		int next = first + second;
		System.out.print(" " + next);
		first = second;
		second = next;
			}
		scan.close();
	}
}