package Arrays;
/*
 * https://leetcode.com/problems/two-sum/
 * LeetCode: Two Sum
 * Easy
 * 23 June 2022
 */

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int reqNum = target - nums[i];
            System.out.println("i: "+i+" nums[i]: "+nums[i]+" reqNum: "+reqNum+" Map has reqNum: "+hm.containsKey(reqNum));
            if(hm.containsKey(reqNum)){
                res[0] = hm.get(reqNum);
                res[1] = i;
            }else{
                hm.put(nums[i], i);
            }
            System.out.println("Map: "+hm);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int nums[] = new int[n]; 
        String s = sc.nextLine();
        String str[] = s.trim().split(" ");
        
        int i=0;
        while(i<n){
            nums[i] = Integer.parseInt(str[i]);
            i++;
        }
        int target = sc.nextInt();
        TwoSum ts = new TwoSum();
        int res[] = ts.twoSum(nums, target);

        for(int r: res){
            System.out.print(r+" ");
        }
        sc.close();
    }
}
