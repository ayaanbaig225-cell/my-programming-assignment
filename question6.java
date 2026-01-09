
import java.util.Scanner;

public class question6 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

     System.out.print("Enter length of first parallel side: ");
        double fps = sc.nextDouble();

        System.out.print("Enter length of second parallel side: ");
        double sps = sc.nextDouble();

        System.out.print("Enter perpendicular distance: ");
        double perpD = sc.nextDouble();

        
        double area = 0.5 * (fps + sps) * perpD;

        
        System.out.println("Area of the trapezoid = " + area);

        sc.close();


}

}
