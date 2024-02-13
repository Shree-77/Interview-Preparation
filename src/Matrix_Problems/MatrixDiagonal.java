package Matrix_Problems;

/**
 * Matrix Diagonal sum
 * Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom left
 * I/P:
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * O/P: 30
 */
public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] arr= new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(DiagonalSum(arr));
    }
    public static int DiagonalSum(int [][] arr){
        int ans =0;int ans1=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    ans+=arr[i][j];
                }if((j+i)==(arr.length-1)){
                    ans1+=arr[i][j];
                }
            }
        }
        return ans+ans1;
    }
}
