import java.util.Scanner;
public class two_integer {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first integer:");
        int a=scan.nextInt();
        System.out.println("Enter second integer:");
        int b=scan.nextInt();
        int sum=a+b;
        System.out.println("The sum of two integers is: " + sum);
        int diff=a-b;
        System.out.println("The difference of two integers is: " + diff);
        int prod=a*b;
        System.out.println("The product of two integers is: " + prod);
        int quot=a/b;
        System.out.println("The quotient of two integers is: " + quot);
        scan.close();

    }
    
}
