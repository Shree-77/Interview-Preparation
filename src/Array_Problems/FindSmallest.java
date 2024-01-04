package Array_Problems;

/**
 * Problem Statement: Given an array, we have to find the smallest element in the array
 * Example 1:
 * Input: arr[] = {2,5,1,3,0};
 * Output: 0
 * Explanation: 0 is the smallest element in the array.
 */

public class FindSmallest {
    public static void main(String[] args) {
        int[]arr={2,5,1,3,0};
        System.out.println(findSmall(arr));
    }
    public static int findSmall(int [] arr){
        int ans = Integer.MAX_VALUE;

        for(int i:arr){
            if(i<ans){
                ans=i;
            }
        }
        return ans;

    }
}
