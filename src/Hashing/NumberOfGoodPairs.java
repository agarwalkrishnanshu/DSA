package Hashing;

import java.util.Hashtable;
import java.util.Scanner;

import Util.StopWatch;

/*
 * Leetcode: Number of Good Pairs
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * Easy
 * 23 June 2022
 * https://leetcode.com/problems/number-of-good-pairs/
 */

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        
        for(int i=0; i<nums.length; i++){
            // System.out.println("i: "+i+" nums[i]: "+nums[i]+" ht.contains(nums[i]): "+ht.containsKey(nums[i])+" count: "+count);
            if(ht.containsKey(nums[i])){
                ht.put(nums[i], ht.get(nums[i]) + 1);
                count = count+ ht.get(nums[i]);
            }else{
                ht.put(nums[i], 0);
            }
            // System.out.println(" count: "+count);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        
        int n = Integer.parseInt(sc.nextLine());
        int nums[] = new int[n];
        String s = sc.nextLine();
        String str[] = s.trim().split(" ");
        for(int i=0; i<str.length; i++){
            nums[i] = Integer.parseInt(str[i]);
        }
        NumberOfGoodPairs numOfGood = new NumberOfGoodPairs();

        StopWatch sw = new StopWatch();
        sw.start();
        System.out.println("Result: "+numOfGood.numIdenticalPairs(nums));
        sw.stop();
        System.out.println("Time Elapsed: "+sw.getElapsedTime());
        sw.reset();

        sc.close();
    }
}
