import java.util.Scanner;
public class celsius_farenhiet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");
        double celsius=sc.nextDouble();
        double farenhiet=(celsius*1.8)+32;
        System.out.println("The temperature in farenhiet:"+ farenhiet);
        sc.close();
    }
    
}
