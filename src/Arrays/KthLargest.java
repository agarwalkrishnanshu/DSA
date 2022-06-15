package Arrays;

import java.io.*;
import java.util.*;

class KthLargest {
    
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    public static void main(String[] args) throws IOException{
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println("Result: "+findKthLargest(nums, k));
    }
}