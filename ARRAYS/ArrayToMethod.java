package ARRAYS;
import java.util.Scanner;

//Passing an 2D array to a Method

public class ArrayToMethod {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        System.out.println("rows: " + arr.length);
        System.out.println("columns: " + arr[0].length);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");

        for(int i=0;i<arr.length;i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("The elements of the array are: ");

        System.out.println("Sum: " + printArray(arr));

        in.close();
    }
    static int printArray(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println();
        return sum;
    }
}
