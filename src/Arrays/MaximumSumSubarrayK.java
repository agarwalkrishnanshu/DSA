package Arrays;

// Sliding Window technique
// Find the maximum sum of subarray of size k

import java.io.*;
public class MaximumSumSubarrayK {

    public static int findMaxSumSubArraySizeK(int a[], int n, int k){

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        if(n < k){
            return -1;

        }
        for(int i=0; i<k; i++){
            sum += a[i];
        }
        maxSum = sum;
        for(int j=k; j<n; j++){
            sum = sum + a[j] - a[j-k];
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }


    public static void main (String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        // while(t-->0){
        //     int n = Integer.parseInt(br.readLine().trim());
        //     int arr[] = new int[n];
        //     String inputLine[] = br.readLine().trim().split(" ");
        //     for(int i=0; i<n; i++){
        //         arr[i] = Integer.parseInt(inputLine[i]);
        //     }
        // }
            
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(findMaxSumSubArraySizeK(arr, n, k));
    }
    
}
