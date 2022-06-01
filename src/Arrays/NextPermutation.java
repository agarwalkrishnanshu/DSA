public class NextPermutation {
        public void reverse(int nums[], int low, int high){
            // Reversing the remaining array
            int temp;
            while(low<high){
                temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }
        public void nextPermutation(int[] nums) {
            
            int index1 = -1;
            int index2 = -1;
            for(int i=0; i<nums.length-1; i++){
                if(nums[i] < nums[i+1]){
                     index1 = i;
                }
            }
            if(index1 == -1){
                reverse(nums, 0, nums.length-1);
                return; 
                
            }
            for(int i=nums.length-1; i>0; i--){
                if(nums[index1] < nums[i]){
                     index2 = i;
                    break;
                }
            }
            
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
            
            
            int low = index1 + 1;
            int high = nums.length-1;
            // Reversing the remaining array
            reverse(nums, low, high);
            
        }
}
