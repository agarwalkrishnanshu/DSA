package Hashing;

/*
 * GFG: Top K Frequent Elements in Array
 * https://practice.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1#
 * Easy
 * 7 July 2022
 * 
 */
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class TopKFrequentElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            TopKFrequentElementsSolution obj = new TopKFrequentElementsSolution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends

class TopKFrequentElementsSolution {
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)+1);
        }

        System.out.println("HM: "+hashMap);

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int element : hashMap.keySet()){
            pq.add(new Pair(element, hashMap.get(element)));
        }
        System.out.println("PQ: "+pq.toString());

        int i=0;
        int result[] = new int[k];
        while(pq.size() > 0 && i<k){
            Pair top = pq.remove();
            System.out.println("Top key: "+top.key+" Value: "+top.value);
            int index = top.value;
            result[i] = top.key;
            i++;
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
                if(p.key > this.key){
                    return 1;
                }else if(p.key < this.key){
                    return -1;
                }else{
                    return this.key - p.key;
                }
            }
        }
    }
}