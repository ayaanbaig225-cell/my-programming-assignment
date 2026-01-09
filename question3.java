
import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

System.out.println("enter original selling price");
float sellp = sc.nextInt();

System.out.println("enter discount percentage");
double discp = sc.nextInt();

System.out.println("discounted selling price");
double calc = sellp - (discp/100 * sellp);

System.out.println(calc);

sc.close();



    }
    
}
