package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr1= new int[]{2,3,41,23,41,2,1};
       insertSort(arr1);
        System.out.println( Arrays.toString(arr1));
    }
    public static void insertSort(int[]arr){
        for(int i=1;i< arr.length;i++){
            int curr = arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }
}
