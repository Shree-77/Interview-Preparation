package Matrix_Problems;

import java.util.Scanner;

/**
 * Matrix Addition
 * Given n integer arrays of different size, find the addititon of numbers represented by the arrays
 * I/P: 4
 * 3 5 4 2
 * 2 4 5
 * 4 5 6 7 8
 * 4 9 2 1
 * 1 2
 *
 * O/P: 54398
 */
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int rows=scanner.nextInt();
        int[][]arr = new int[rows][];

        for(int i =0;i<rows;i++){
            System.out.println("Enter the number of elements for the row" + (i+1));
            int col = scanner.nextInt();
            arr[i]=new int[col];
            System.out.println("Enter the elements : ");
            for(int j=0;j< col;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(returnAddtion(arr));
    }
    public static int returnAddtion(int[][]arr){
        int ans =0;
        for (int[] ints : arr) {
            String row = "";
            for (int anInt : ints) {
                row += anInt;
            }
            ans += Integer.parseInt(row);
        }
        return  ans;
    }

}
