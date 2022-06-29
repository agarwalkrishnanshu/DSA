package Hashing;
/**
 * GFG: Find All Four Sum Numbers
 * Medium
 * 29 June 2022
 * https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1#
 */
// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class FourSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        Arrays.sort(arr);
        
        int l, r;

        for(int i=0; i<arr.length-3; i++){

            // System.out.println("i: "+i+" arr[i]: "+arr[i]);

            for(int j=i+1; j<arr.length-2; j++){

                l = j+1;
                r = arr.length - 1;

                while(l<r){
                    
                    // System.out.println("x: "+x+" arr[x]: "+arr[x]+" reqNum: "+reqNum+" Map has reqNum: "+hm.containsKey(reqNum));
                    if(arr[i] + arr[j] + arr[l] + arr[r] == k){
                        ArrayList<Integer> res = new ArrayList<>();
                        res.add(arr[i]);
                        res.add(arr[j]);
                        res.add(arr[l]);
                        res.add(arr[r]);
                        Collections.sort(res);
                        if(!result.contains(res)){
                            result.add(res);
                        }
                        // System.out.println("res: "+res);
                        l++;
                        r--;
                    }else if(arr[i] + arr[j] + arr[l] + arr[r] < k){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        return result;
    }
}
