package ExceptionHandling;

//Methods to print the Exception information:

//The toString() method prints exception information in the format of the Name of the exception: description of the exception. 

public class toString {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        try{
            System.out.println("division: " + a/b);
        }
        catch(ArithmeticException d){
            System.out.println(d.toString());
        }
    }
}
