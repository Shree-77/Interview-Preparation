package Array_Problems;

import java.util.Arrays;

/**
 * Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.
 * Example :
 * Input: N = 5, array[] = {1,2,3,4,5} K=2
 * Output: {3,4,5,1,2}
 * Explanation: Rotate the array to right by 2 elements.
 */

public class RotateByK {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int k=4;
        System.out.println(Arrays.toString(RotateArray(arr,k)));
    }
    public static int[] RotateArray(int [] arr, int k){
        if(k==arr.length||k==1){
            return arr;
        }
        int[]ans=new int[arr.length];

        k = k%arr.length;
        int index=0;

        for(int i=0;i< arr.length;i++){
            if(i<k){
                ans[index]=arr[arr.length+i-k];
            }else{
                ans[index]=arr[i-k];
            }
            index++;
        }
        return ans;
    }

}
