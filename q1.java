//Unary operators in java
import java.util.Scanner;

public class q1 {
    public static void main(String args[])
    {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("++n = "+ ++n);
        System.out.println("n++ = "+ n++);
        System.out.println("--n = "+ --n);
        System.out.println("n-- = "+ n--);

        System.out.println("Enter the value of x : ");
        int x = input.nextInt();
        System.out.println("x = " + x);
        System.out.println("+x = " + +x);
        System.out.println("-x = " + -x);
        input.close();
    }
}
