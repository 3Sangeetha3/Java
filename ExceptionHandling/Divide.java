package ExceptionHandling;

public class Divide {
    public static void main(String arr[]) {
        try {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = a / b;
            System.out.println("Result is : " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two numbers");
        }
        catch (NumberFormatException e) {
            System.out.println("Please provide only numbers");
        }
        catch (Exception e) {
            System.out.println("Some error occurred");
        }
    }
}
