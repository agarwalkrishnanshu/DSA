package Arrays;
/*
 * GFG: Largest subarray of 0's and 1's
 * Easy
 * Given an array of 0s and 1s. Find the length of the largest subarray with equal number of 0s and 1s.
 * 28 June 2022
 * Link: https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1#
 */

// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.util.HashMap;

class LargestSubarrayOf0And1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++)
                a[i] = sc.nextInt();

            LargestSubarrayOf0And1_Solution g = new LargestSubarrayOf0And1_Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
        sc.close();
    }
}
// } Driver Code Ends

class LargestSubarrayOf0And1_Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array

    // return the maximum length of the subarray
    // with equal 0s and 1s
    public int maxLen(int[] arr, int N) {
        // Your code here
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0, -1);
        
        for (int i = 0; i < N; i++) {   
            // System.out.println("i: "+i+" arr[i]"+arr[i]+" j: "+ j+" arr[j]: "+arr[j]);
            if(arr[i] == 0){
                sum = sum - 1;
            }else{
                sum +=1;
            }
            if(hm.containsKey(sum)){
                maxLen = Math.max(maxLen, i-hm.get(sum));
            }else{
                hm.put(sum, i);
            }
            // System.out.println("Sum: "+sum);
        }
        return maxLen;
    }
}
