package Sorting;

import java.util.Arrays;

public class bubbleSorting {
    public static void main(String[] args) {
        int[]arr = new int[]{1,3,4,5,2,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[]arr){
        var isSorted = false;
        for(int i=0;i< arr.length;i++){
            isSorted=true;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    isSorted=false;
                }
            }
            if(isSorted)return;
        }
    }
    private static void swap (int[]arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
