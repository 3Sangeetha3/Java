package ARRAYS;
import java.util.Scanner;
import java.util.Arrays;

//Return an array from the method

public class ReturnArrayFromMethod {
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
        for(int i=0;i<arr.length;i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The elements of the array after doubling are: ");
        int[][] NewArray = Method(arr);

        for(int i=0;i<NewArray.length;i++) {
            for(int j=0; j<NewArray[i].length; j++) {
                System.out.print(NewArray[i][j] + " ");
            }
            System.out.println();
        }
    
        in.close();
    }

    static int[][] Method(int[][] arr) {
        int[][] arr2 = new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr2[i][j] = arr[i][j] * 2;
            }
        }

        return arr2;
    }
}
