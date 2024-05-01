package ARRAYS;
import java.util.Scanner;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        String[] arr2 = new String[4];
        double[] d = new double[5];

        //taking an Integer array input from the user
        System.out.println("Enter the integer array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        //printing the Integer array
        // for(int i=0;i<arr.length;i++) {
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(Arrays.toString(arr));


        System.out.println();

        //taking a String array input from the user
        System.out.println("\nEnter the String array: ");
        for(int i=0;i<arr2.length;i++) {
            arr2[i] = in.next();
        }
        //printing the String array
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println();

        //taking a double array input from the user
        System.out.println("\nEnter the double type array: ");
        for(int i=0;i<d.length;i++) {
            d[i] = in.nextDouble();
        }
        //print the double type array
        for(int i=0;i<d.length;i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println(Arrays.toString(d));
    }
}