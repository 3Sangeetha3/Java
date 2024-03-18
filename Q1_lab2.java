//swap two numbers without using third variable and arthemetic operators
import java.util.Scanner;

public class Q1_lab2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a and b after swapping..");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        input.close();
    }
}