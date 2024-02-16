package Math_Problems;

/**
 * Find whether the given number is palindrome or not. Don’t use arrays or strings
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
    public static boolean palindrome(int num){
        int n=0; int i=1;int temp=num;
        while(num>0){
            n+=(num%10)*(i);
            num/=10;
            i*=10;
        }
        return n==temp;
    }

}
