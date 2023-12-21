package Array;

/**
 * Problem Statement: Given an array, we have to find the sum of all the elements in the array.
 * Example :
 * Input: N = 5, array[] = {1,2,3,4,5}
 * Output: 15
 * Explanation: Sum of all the elements is 1+2+3+4+5 = 15
 */
public class SumOfArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(Sum(arr));
    }
    public static int Sum(int[] arr){
        int ans=0;
        for(int i:arr){
            ans+=i;
        }
        return ans;
    }
}
