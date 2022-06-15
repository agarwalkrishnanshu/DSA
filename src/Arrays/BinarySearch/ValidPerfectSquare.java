package Arrays.BinarySearch;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        
        if(num ==1){
            return true;
        }
        
        long low = 1;
        long high = num/2;
        while(low<=high){
            long mid = low + (high-low)/2;
            // System.out.println("low: "+low+" high: "+high+" (high-low)/2: "+(high-low)/2 +" mid: "+mid+" mid^2: "+mid*mid+ " mid*mid > num: "+(mid*mid>num));
            if(mid*mid == num){
                return true;
            }else if(Math.abs(mid*mid) > num){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
    
}
