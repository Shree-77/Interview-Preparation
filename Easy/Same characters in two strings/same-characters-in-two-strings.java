//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String A = sc.nextLine().trim();
            String B = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sameChar(A, B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int sameChar(String A, String B) 
    {
        // code here
        int ans=A.length();
        A=A.toLowerCase();
        B=B.toLowerCase();
        
        for(int i =0;i<A.length() ; i++){
            char c = A.charAt(i);
            char c1 = B.charAt(i);
            
            if(c!=c1){
                ans--;
            }
        }
        return ans;
    }
} 