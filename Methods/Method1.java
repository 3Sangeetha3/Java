package Methods;
import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

}
