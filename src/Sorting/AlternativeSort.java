package Sorting;

import java.util.Arrays;

/**
 * Input: {1, 2, 3, 4, 5, 6, 7}
 * output: {7, 1, 6, 2, 5, 3, 4}
 */
public class AlternativeSort {
    public static void main(String[] args) {
        int[]arr= new int[]{1,2,3,4,5,6,7,8,9};
        alternativeSort(Sort(arr));
    }
    public static int[] Sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void alternativeSort(int[]arr){
        int i=0; int j=arr.length-1;

        while(i<j){
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }
        if(arr.length%2!=0){
            System.out.println(arr[arr.length/2]);
        }
    }
}
