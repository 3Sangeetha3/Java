import java.io.*;
import java.text.DecimalFormat;

public class DecimalFormating {
    public static void main(String[] args) {
        double num = 1234567.1234567;
        System.out.println("num = " + num);
        System.out.printf("num = %.2f\n", num);
        System.out.printf("num = %.4f\n", num);
        System.out.printf("num = %.6f\n", num);
        System.out.printf("num = %.8f\n", num);
        System.out.printf("num = %.10f\n", num);

        System.out.format("%.2f", num);


        //Using DecimalFormat Class 

        DecimalFormat obj = new DecimalFormat("#.##");
        System.out.println("\nnum = " + obj.format(num));
    }
}
