import java.util.Scanner;
public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the float value:");
        float scan=sc.nextFloat();
        double area=3.14*scan*scan;
        System.out.println("The area of circle is: " + area);
    }
    
}
