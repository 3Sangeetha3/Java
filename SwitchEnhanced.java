import java.util.Scanner;

public class SwitchEnhanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String str = sc.next();
        switch (str) {
            case "One" -> System.out.println("One");
            case "Two" -> System.out.println("Two");
            case "Three" -> System.out.println("Three");
            case "Four" -> System.out.println("Four");
            default -> System.out.println("Invalid number");
        }
    }
}
