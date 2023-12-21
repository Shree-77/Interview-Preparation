package Array;

/**
 * Problem Statement : Find the Largest Number in the array.
 * Example 1:
 * Input: arr[] = {2,5,1,3,0};
 * Output: 5
 * Explanation: 5 is the largest element in the array.
 */

import java.util.Arrays;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,612,231,32,12};
        int n= arr.length;
        System.out.println(largestElement(arr,n));
    }

    static int largestElement(int[] arr, int n) {

        Arrays.sort(arr);
        return arr[n-1];

    }
}
