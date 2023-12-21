package question3;

/**
 * Problem Statement: Given an array, find the second smallest and second-largest element in the array.
 * Print ‘-1’ in the event that either of them doesn’t exist.
 * Example 1:
 * Input: [1,2,4,7,7,5]
 * Output: Second Smallest : 2
 * 	Second Largest : 5
 * Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
 */

public class SecondSmallestLargest {
    public static void main(String[] args) {
        int[]arr={1,2,4,7,7,5};
        System.out.println(SecondLargest(arr));
        System.out.println(SecondSmallest(arr));
    }
    static int SecondLargest(int []arr){
        int second = Integer.MIN_VALUE; int max = Integer.MIN_VALUE;

        if(arr.length<2){
            return -1;
        }

        for (int j : arr) {
            if (j > max) {
                second = max;
                max = j;
            } else if (j > second && j != max) {
                second = j;
            }
        }

        return second;
    }
    static  int SecondSmallest(int[]arr){
        int second = Integer.MAX_VALUE; int min = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < min) {
                second = min;
                min = j;
            } else if (j < second && j != min) {
                second = j;
            }
        }

        return second;
    }

}
