package BinarySearch;

public class ThreeSum {
    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        int i=0;
        int low = 0;
        int high = 2;
        
        while(i<A.length){
            low = i+1;
            high = A.length-1;
            int findSum = B - A[i];
            while(low<high){
                int sum = A[low] + A[high];
                if(sum == findSum){
                    return B;
                }else if(sum > findSum){
                    if(high-1!=low){
                        high--;
                    }else{
                        break;
                    }
                }else{
                    low++;
                }
            }
            i++;
        }
    }
    
}
