import java.util.Scanner;

public class question2{

    public static void main(String[] args) {
        

Scanner sc = new Scanner(System.in);

System.out.println("enter the radius of circle");
float rad = sc.nextInt();

System.out.println("Circumference");
double circ = (2 * Math.PI * rad);
System.out.println(circ);

System.out.println("area");
double are = (Math.PI * Math.pow(rad, 2) );
System.out.println(are);

sc.close();






    }
}