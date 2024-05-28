/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		while(cases-->0){
		    int n = in.nextInt();
		    int[]arr = new int[n];
		    for(int i =0;i<n;i++){
		        arr[i]=in.nextInt();
		    }
		    HashMap<Integer,Integer>map = new HashMap<>();
		    
		    for(int i=0;i<n;i++){
		        map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
		    }
		   PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->{
		       if(map.get(a)==map.get(b)){
		           return a-b;
		       }else{
		           return map.get(b)-map.get(a);
		       }
		   });
		   
		   for(int i : map.keySet()){
		       pq.add(i);
		   }
		   while(!pq.isEmpty()){
		       int val = pq.poll();
		       for(int i =0;i<map.get(val);i++){
		           System.out.print(val+" ");
		       }
		   }
		    
		    System.out.println();
		}
	}
}