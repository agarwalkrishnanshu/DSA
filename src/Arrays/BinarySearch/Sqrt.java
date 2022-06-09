package BinarySearch;

/*
    https://leetcode.com/problems/sqrtx/
*/

public class Sqrt {
    public int mySqrt(int x) {
        
        if(x ==1 || x == 0){
            return x;
        }
        
        long low = 1;
        long high = x/2;
        long mid=0;
        while(low<=high){
            mid = low + (high-low)/2;
            // System.out.println("low: "+low+" high: "+high+" (high-low)/2: "+(high-low)/2 +" mid: "+mid+" mid^2: "+mid*mid+ " mid*mid > x: "+(mid*mid>x));
            if(mid*mid == x){
                return (int)mid;
            }else if(Math.abs(mid*mid) > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
            //System.out.println("low: "+low+" high: "+high+" (low*low): "+(low*low)+" mid^2: "+mid*mid+ " mid*mid > x: "+(mid*mid>x));
        if(low*low < x){
            return (int)low;
        }else{
            return (int)high;
        }
    }
}
