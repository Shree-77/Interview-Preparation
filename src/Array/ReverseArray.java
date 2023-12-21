package Array;

/**
 * Problem Statement: You are given an array. The task is to reverse the array and print it.
 * Example 1:
 * Input: N = 5, arr[] = {5,4,3,2,1}
 * Output: {1,2,3,4,5}
 * Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
 * the second element occupies the fourth position and so on.
 */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    public static int[] reverseArray(int[] arr){
        int[]ans=new int[arr.length];
        int index=0;
        for(int i=arr.length-1;i>=0;i--){
            ans[index]=arr[i];
            index++;
        }
        return ans;
    }

}
