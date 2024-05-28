//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            Solution ob = new Solution();
            int[] ans = ob.common_digits(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] common_digits(int[] nums)
    {
        // code here
        HashSet<Integer>set = new HashSet<>();
        
        for(int i: nums){
           while(i>0){
                set.add(i%10);
                i/=10;
           }
        }
        int[]arr = new int[set.size()];
        int index=0;
        
        for(int i :set){
            arr[index++]=i;
        }
        
        return arr;
    }
}