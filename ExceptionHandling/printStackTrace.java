package ExceptionHandling;

//Methods to print the Exception information: 

// 1. printStackTrace() : This method prints exception information in the format of the Name of the exception: description of the exception, stack trace.

public class printStackTrace {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        try{
            System.out.println("division: " + a/b);
        }
        catch(ArithmeticException d){
            d.printStackTrace();
        }
    }
}
