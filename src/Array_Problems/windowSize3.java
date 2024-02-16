package Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array of numbers and a window of size k.
 * Print the maximum of numbers inside the window for each step as the window moves from the beginning of the array.
 *   INPUT  :
 *   Enter the array size  :  8
 *   Enter the elements  :  1,3,5,2,1,8,6,9
 *   Enter the window size  :  3
 *
 *   OUTPUT  :
 *   5 5 5 8 8 9
 */
public class windowSize3 {
    public static void main(String[] args) {
//        int n;
//        Scanner in  = new Scanner(System.in);
//        System.out.println("Enter the size of the array : ");
//        n = in.nextInt();
//
//        int[]arr = new int[n];
//        System.out.println("Enter "+n+" elements for array : ");
//
//        for(int i =0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        System.out.println("Enter window Size : ");
//        int  window = in.nextInt();

        System.out.println(Arrays.toString(maximumInWindow(new int[]{1,3,5,2,1,8,6,9},3)));

    }
    public static int[] maximumInWindow(int[]arr , int windowsize){
        int start =0; int end = 0; int max=0;int index=0; int [] result = new int[arr.length-windowsize+1];
        while(end<arr.length){
            max = Math.max(max , arr[end]);
            if(end-start+1 == windowsize){
                result[index]=max;
                index++;
                start++;
            }
            end++;
        }
        return result;
    }
}
