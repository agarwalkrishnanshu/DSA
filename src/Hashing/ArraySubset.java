package Hashing;
/*
 * GFG: Array Subset of another array
 * Easy
 * 30 June 2022
 * https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1#
 */
// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class ArraySubset {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
        
        // Storing all elements in a1 to hashmap
        for(int index = 0; index < n; index++){
            hm.put(a1[index], index);
        }

        // Iterate on a2 and check if the elements are present in the map or not
        int count = 0;
        for(int index=0; index < m; index++){
            if(hm.containsKey(a2[index])){
                count++;
            }
        }
        if(count == m){
            return "Yes";
        }
        return "No";
    }
}
