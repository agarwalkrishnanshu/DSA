package Arrays.BinarySearch;
/*
    35. Search Insert Position
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.
    https://leetcode.com/problems/search-insert-position/
*/

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        
        int low =0;
        int high = nums.length-1;
        
        while(low<high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        // Case if not found i.e. not returned from the above block then
        if(nums[low] < target){
            return low+1;
        }else{
            return low;
        }        
    }
}