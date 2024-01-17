//Convert celusis to fahrenheit 
import java.util.Scanner;

public class q2 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the celsius degree: ");
        float c = input.nextFloat();
        float f = ((c * 9)/5) + 32;
        System.out.println("Fahrenheit temperature = " + f);
        input.close();
    }
}
