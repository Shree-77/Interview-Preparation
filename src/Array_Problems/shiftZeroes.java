package Array_Problems;

import java.util.Arrays;

/**
 * Given an array of integers of size n. Convert the array in such a way that if next valid number
 * is same as current number, double its value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end.
 * Input : arr[] = {2, 2, 0, 4, 0, 8}
 * Output : 4 4 8 0 0 0
 * Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
 * Output : 4 2 12 8 0 0 0 0 0 0
 */
public class shiftZeroes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Shift(new int[]{0, 2, 2, 2, 0, 6, 6, 0, 0, 8})));
    }
    public static int[] Shift(int[]arr){

        for(int i=1;i< arr.length;i++){
            if(arr[i]==arr[i-1] && arr[i]!=0){
                arr[i-1]*=2;
                arr[i]=0;
                i++;
            }
        }
        return swapZero(arr);
    }

    public static int[] swapZero(int[]arr){
       int []arr1 = new int[arr.length];
       int index=0;
        for (int j : arr) {
            if (j != 0) {
                arr1[index] = j;
                index++;
            }
        }
        return arr1;
    }

}
