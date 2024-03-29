//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int height[], int n) { 
        // Your code here
         
        int left=0; int right =height.length-1;
        int maxL = height[left]; int maxR = height[right];long water=0;
        
        while(left<right){
            if(maxL<maxR){
                left++;
                maxL=Math.max(maxL,height[left]);
                water+=maxL-height[left];
            }else{
                right--;
                maxR=Math.max(maxR,height[right]);
                 water+=maxR-height[right];
            }
        }
        return water;
    
    } 
}


