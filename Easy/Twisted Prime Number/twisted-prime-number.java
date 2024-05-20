//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTwistedPrime(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isTwistedPrime(int N) {
        // code here
        return isPrime(reverse(N)) && isPrime(N) ? 1 : 0;
        
    }
    boolean isPrime(int N){
        if(N<=1)return true;
        
        int c = 2;
        
        while(c*c<=N){
            if(N%c++ == 0)return false;
        }
        return true;
    }
    int reverse(int N){
        int rem=0;
        
        while(N>0){
            rem = rem*10 + (N%10);
            
            N/=10;
        }
        return rem;
    }
}