package ExceptionHandling;

import java.util.Scanner;


public class Exception_1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = x/y;
        try{
            System.out.println("Division is: "+z);
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }
        s.close();
    }
}