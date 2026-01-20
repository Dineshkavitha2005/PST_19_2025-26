import java.util.Scanner;
public class total_average {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter mark 1:");
        int mark1 = scan.nextInt();
        System.out.println("Enter mark 2:");
        int mark2 = scan.nextInt();
        System.out.println("Enter mark 3:");
        int mark3 = scan.nextInt();
        int total = mark1 + mark2 + mark3;
        int average = total / 3;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        scan.close();
    }
    
}
