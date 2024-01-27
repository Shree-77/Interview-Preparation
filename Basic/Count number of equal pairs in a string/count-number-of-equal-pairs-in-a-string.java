//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            
            String s = sc.next ();
            System.out.println (new Sol().equalPairs (s));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    long equalPairs (String s)
    {
        long ans =0;
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) +1);
        }
        
        for(Character i:map.keySet()){
            ans+=map.get(i) * map.get(i);
        }
        return ans;
    }
}