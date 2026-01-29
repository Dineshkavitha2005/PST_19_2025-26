package core_java;
import java.util.Scanner;
public class Length_without_len {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String x=sc.next();
		int count=0;
		for(char c:x.toCharArray()) {
			count++;
		}
		System.out.println("Number of string is:"+count);
		sc.close();

	}

}
