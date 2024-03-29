import java.util.Scanner;

public class Q3_lab2 {
    public static void main(String[] args)
    {
        System.out.println("Enter values of a, b, c :");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int max = a;
        if(b>=max)
        {
            max = b;
        }
        if(c>=max)
        {
            max = c;
        }

        /*
         *  int max = num1 > num2 ? num1 : num2;
            max = max > num3 ? max : num3;
         */
        System.out.println("max : " + max);
        input.close(); 
    }     
}
