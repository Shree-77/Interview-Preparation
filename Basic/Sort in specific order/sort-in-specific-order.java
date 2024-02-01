//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution ob = new Solution();
            ob.sortIt(a, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        int odd=0; int even=0;
        
        for(long i : arr){
            if(i%2!=0){
                odd++;
            }else{
                even++;
            }
        }
        Arrays.sort(arr);
        
        long[]oddArray = new long[odd];
        long[]evenArray = new long[even];
        
        int index =0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddArray[index]=arr[i];
                index++;
            }
        }
        
        index =0;
        
          for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenArray[index]=arr[i];
                index++;
            }
        }
        
        index=0;
        
        for(int i =oddArray.length-1;i>=0;i--){
            arr[index]=oddArray[i];
            index++;
        }
        
        for(int i=0;i<evenArray.length;i++){
            arr[index]=evenArray[i];
            index++;
        }
        
    }
}