package ExceptionHandling;

// Methods to print the Exception information:

// The getMessage() method prints only the description of the exception.

public class getMessage {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        try{
            System.out.println("division: " + a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
