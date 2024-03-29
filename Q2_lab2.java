import java.util.Scanner;

public class Q2_lab2 {
    public static void main(String[] args)
    {
        //ax^2=+bx+c
        System.out.println("Enter a, b, c of the quadratic quation");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a == 0)
        {
            System.out.println("Not a quadratic quation");
        }
        else{
            double discriminant = b*b - 4 * a * c;
            if (discriminant < 0) {
                System.out.println("The roots are imaginary");
                } else {
                double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            }
        } 
        input.close();       
    }
}