package Array_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class subArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Array1 : ");
        int n1 =in.nextInt();
        System.out.println("Enter the size of Array2 : ");
        int n2 = in.nextInt();
        int[]arr = new int[n1];
        int[]arr1 = new int[n2];
        System.out.println("Enter"+ n1 +" elements for Array 1:");
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter" + n2 + " elements for Array 2 : ");
        for(int i=0;i<arr1.length;i+=1){
            arr1[i]=in.nextInt();
        }
        List<int[]>list = subArray(arr,arr1);

        for(int[]sub : list){
            System.out.println(Arrays.toString(sub));
        }
    }
    public  static List<int[]> subArray(int[] arr1 , int[]arr2){
        List<int[]>list = new ArrayList<>();

        for(int start=0;start<= arr1.length- arr2.length;start++){
            int end = start+ arr2.length-1;
            int[]subarray= Arrays.copyOfRange(arr1,start,end+1);

            if(Arraysareequals(subarray,arr2)){
                list.add(subarray);
            }
        }

        return  list;
    }
    public static boolean Arraysareequals(int[]arr , int[] arr1){
        int[]arrCopy = Arrays.copyOf(arr,arr.length);
        int[]arr1Copy = Arrays.copyOf(arr1,arr1.length);

        Arrays.sort(arrCopy);
        Arrays.sort(arr1Copy);

        return Arrays.equals(arrCopy,arr1Copy);

    }

}
