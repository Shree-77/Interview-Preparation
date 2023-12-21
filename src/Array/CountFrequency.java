package Array;
/**
 * Problem statement: Given an array, we have found the number of occurrences of each element in the array.
 * Input: arr[] = {10,5,10,15,10,5};
 * Output: 10  3
 * 	 5  2
 *         15  1
 * Explanation: 10 occurs 3 times in the array
 * 	      5 occurs 2 times in the array
 *               15 occurs 1 time in the array
 */

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int[]arr={1,10,2,2,13,13};
        System.out.println(Arrays.toString(frequency(arr)));
    }
    public static int[] frequency(int[]arr){
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}
