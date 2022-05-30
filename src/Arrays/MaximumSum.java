// Kandan's Algorithm

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
        int nums[] = {-5,-1, -3, -2, -4};
        int maxSum = maxSubArray(nums);
        System.out.println(maxSum);

    }
}