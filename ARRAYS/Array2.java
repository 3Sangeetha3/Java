package ARRAYS;

import java.util.Arrays;

// Java Program to Add Elements in an Array.
// Input:  Array: [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ]
//             Element: 50
// Output: Array: [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 50 ]
// Explanation:  Adding Element in the Array


public class Array2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
        System.out.println("Array: " + Arrays.toString(arr));
        int element = 50;


        int[] arr2 = new int[arr.length + 1];
        for(int i=0;i<arr.length;i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length - 1] = element;
        System.out.println("Array: " + Arrays.toString(arr2));
    }
}
