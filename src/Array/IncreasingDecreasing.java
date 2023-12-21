package Array;

import java.util.Arrays;

/**
 * Problem Statement: Rearrange the array such that the first half is arranged in increasing order,
 * and the second half is arranged in decreasing order
 * Example 1:
 * Input: 8 7 1 6 5 9
 * Output: 1 5 6 9 8 7
 * Explanation: First three elements are in the ascending order and next three elements are in the descending order.
 */

public class IncreasingDecreasing {
    public static void main(String[] args) {
        int[]arr={8,7,1,6,5,9};
        System.out.println(Arrays.toString(increaseDecrease(arr)));
    }
    public static int[] increaseDecrease(int[]arr){
        int[]ans=new int[arr.length];
        Arrays.sort(arr);
        System.arraycopy(arr, 0, ans, 0, arr.length / 2);
        int index=arr.length/2;

        for(int i=arr.length-1;i>=arr.length/2;i--){
            ans[index]=arr[i];
            index++;
        }
        return ans;
    }
}
