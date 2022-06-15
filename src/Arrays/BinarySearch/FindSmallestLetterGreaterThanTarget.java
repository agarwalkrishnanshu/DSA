package Arrays.BinarySearch;
/**
 * Leetcode: Find smallest letter greater than target
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int low=0;
        int high=letters.length-1;
        int mid =0;
        while(low<=high){
            
            mid = low+(high-low)/2;
            // System.out.println("low: "+low+" high: "+high+" (high-low)/2: "+(high-low)/2 +" mid: "+mid+" letters[mid]: "+letters[mid]+ " target: "+ target);
            if(letters[mid] <= target){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        //System.out.println("low: "+low+" high: "+high+" (high-low)/2: "+(high-low)/2 +" mid: "+mid+" letters[mid]: "+letters[mid]+ " target: "+ target);
        return letters[low%letters.length];
    }
}
