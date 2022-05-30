// Link: https://practice.geeksforgeeks.org/problems/rearranging-array1648/1/?page=1&difficulty[]=-1&difficulty[]=0&category[]=Arrays&sortBy=accuracy#
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class RearrangingArray {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            int answer[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n, answer);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public static void Rearrange(int a[], int n, int answer[])
    {
        Arrays.sort(a);
        try {
            int k = 0;
            for (int i = 0, j=a.length-1; i <=j ; i++,j--) {
                answer[k] = a[i];
                if(k+1 < n){
                    answer[k+1] = a[j];
                }
                k+=2;
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Solution.Rearrange(): Exception: " + e.getStackTrace());
            System.err.println("Error: "+e.getMessage());
        }
        
    }
}
