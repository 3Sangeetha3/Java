import java.util.*;
public class Solution {

    public static int search(int []nums, int target) {
        // Write your code here.
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low<=high){
            int mid = (high + low)/2;
            if(nums[mid] == target){
                index = mid;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.nextLine();
        String[] strNumbers = input.split(" ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(strNumbers[i]);
        }
        int target = sc.nextInt();
        int result = search(nums, target);
        System.out.println(result);
        sc.close();
    }
}