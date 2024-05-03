package ARRAYS;
import java.util.Scanner;
import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        //int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}
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
        for(int i=0;i<arr.length;i++) {
            // for(int j=0; j<arr[i].length; j++) {
            //     System.out.print(arr[i][j] + " ");
            // }
            // System.out.println();
            System.out.println(Arrays.toString(arr[i]));
        }

        in.close();
    }
}
