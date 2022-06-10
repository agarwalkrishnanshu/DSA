import java.util.*;
/**
 * https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
 */
public class SubarrayWithGivenSum {
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum =0;
        int low=0;
        int i=0;
        while(i<n){
            sum += arr[i];
            //System.out.println("i: " + i + " arr[i]: "+arr[i]+" sum: "+sum);
            
            if(sum == s){
                // System.out.println("Sum: "+sum+" == s: "+s);
                result.add(low+1);
                result.add(i+1);
                break;
            }else if(sum > s){
                //System.out.println("Sum: "+sum+" > s: "+s);
                low++;
                i=low;
                sum=0;
            }else{
                i++;
            }
        }
        if(result.size() == 0){
            result.add(-1);
        }
        return result;
    }
}
