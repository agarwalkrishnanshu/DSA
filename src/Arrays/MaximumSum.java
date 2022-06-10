// Kandan's Algorithm
// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class MaximumSum {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
            
        }
        
        for(int i=0; i<nums.length; i++){
            
            sum += nums[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {8, -47, 43, 94, -94, -93, -59, 31, -86};
        int maxSum = maxSubArray(nums);
        System.out.println(maxSum);

    }
}