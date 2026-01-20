import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
    Scanner x =new Scanner(System.in);
    System.out.println("enter your age:");
    int a=x.nextInt();
    System.out.println("Enter your name:");
    String b=x.next();
    System.out.println("enter float value:");
    float c=x.nextFloat();
    System.out.println("enter double value:");
    double d=x.nextDouble();
    System.out.println("enter boolean value:");
    boolean e=x.nextBoolean();
    System.out.println("enter string value:");
    String f=x.nextLine();

    x.close();
    }
    
}
