package Hashing;
/*
 * GFG: Sorting Elements of an Array by Frequency
 * Medium
 * 30 June 2022
 * https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1#
 */

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;


class SortElementsByFrequency 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			 ArrayList<Integer> ans = new ArrayList<Integer>();
			 ans = sortByFreq(arr, size);
			 for(int i=0;i<ans.size();i++)
			    System.out.print(ans.get(i)+" ");
		    System.out.println();
			n--;
		}
	}
    //Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        ArrayList<Integer> result = new ArrayList<>();

        TreeMap<Integer, Integer> hm = new TreeMap<>();
        // Storing frequency of all elements in a map
        for(int index=0; index < n; index++){
                hm.put(arr[index], hm.getOrDefault(arr[index],0)+1);
        }
        System.out.println("HM: "+hm);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int key: hm.keySet()){
            pq.add(new Pair(key, hm.get(key)));
        }

        System.out.println("PQ: "+pq.toString());

        int i=0;
        while(pq.size() > 0){
            Pair top = pq.remove();
            System.out.println("Top key: "+top.key+" Value: "+top.value);
            int index = top.value;
            while(index-- > 0){
                result.add(top.key);
            }
        }
        return result;
    }
    static class Pair implements Comparable<Pair>{
        int key,value;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
        public int compareTo(Pair p){
            if(p.value > this.value){
                return 1;
            }else if(p.value < this.value){
                return -1;
            }else{
                return this.key - p.key;
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java

