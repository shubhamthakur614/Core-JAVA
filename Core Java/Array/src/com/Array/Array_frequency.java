package com.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array_frequency {

     public static void frequency1(int[] arr,int n)
     {
    	 //create new array to store repeat
    	 System.out.println("Frequency by bruteforce method:");
    	 
    	 int[] fre=new int[n];
    	 
    	 int visited=-1;
    	 
    	 for(int i=0;i<n;i++)
    		 
    	 {
    		 int count=1;
    		 for(int j=i+1;j<n;j++)
    		 {
    			 if(arr[i]==arr[j])
    			 {
    				 count++;
    				 //to avoid again calculation
    				 fre[j]=visited;
    			 }
    		 }
    		 if(fre[i]!=visited)	 
    		 {
    			 fre[i]=count;
    		 }
    	 }
    	 for(int i=0;i<fre.length;i++)
    	 {
    		 if(fre[i]!=visited)
    		 {
    			 System.out.println(arr[i]+" "+fre[i]);
    		 }
    	 }
    	 
     }
      
     public static void frequency2(int[] arr,int n)
     {
    	 System.out.println("\n frequency by hashmap: \n");
    	 Map<Integer,Integer> hm=new HashMap<>();
    	 for(Integer digit:arr)
    	 {
    		
    		 if(hm.containsKey(digit))
    		 {
    			 hm.put(digit, hm.get(digit)+1);
    		 }
    		 else
    		 {
    			 hm.put(digit, 1);
    		 }
    	 }
    	 
    	 Set<Entry<Integer,Integer>>entryset=hm.entrySet();
    	 {
    		 for(Entry<Integer,Integer> entry:entryset)
    		 {
    			 System.out.println(entry.getKey()+" "+entry.getValue());
    		 }
    	 }
    	 
     }
     public static void main(String[] args)throws Exception
	{
		
		int[] arr={1, 2, 8, 3, 2, 2, 2, 5, 1};
		int n=arr.length;
		frequency1(arr,n);
		frequency2(arr,n);
		
	}
}
