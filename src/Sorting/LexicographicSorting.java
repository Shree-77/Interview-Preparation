package Sorting;

import java.util.Arrays;

public class LexicographicSorting {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Lexicography(new String[]{"car", "bus", "train", "bike"})));
    }
    public static String[] Lexicography(String[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                int len = Math.max(arr[j].length(), arr[j - 1].length());
                int k=0;
                while(k<len){
                    if(arr[j].charAt(k)!=arr[j-1].charAt(k)){
                        if(arr[j].charAt(k)<arr[j-1].charAt(k)){
                            String temp = arr[j];
                            arr[j]=arr[j-1];
                            arr[j-1]=temp;
                        }
                        break;
                    }
                    k++;
                }
            }
        }
        return arr;
    }

}
