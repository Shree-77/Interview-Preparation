package Array_Problems;

/**
 * Your task is to complete a function “count_heads()” that takes two inputs N and R. The function should return the probability of getting exactly R heads on N successive tosses of a fair coin. A fair coin has an equal probability of landing a head or a tail (i.e. 0.5) on each toss.
 * Example 1
 * Input: 1 1
 * Output: 0.500000
 * Example 2
 * Input: 4 3
 * Output: 0.250000
 */
public class CountsHead {
    public static void main(String[] args) {
        System.out.println(counts_head(4,3));
    }
    public static double counts_head(int N, int R){
        double probability_head;
        probability_head=fact(N)/fact(R)*(fact(N-R));
        probability_head/=Math.pow(2,N);
        return probability_head;
    }
    public static double fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
}
