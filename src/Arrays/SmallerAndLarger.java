package Arrays;

/*  Smaller and Larger
    Problem Statement: Given a sorted array Arr of size N and a value X,
    find the number of array elements less than or equal to X and elements more than or equal to X. 
    URL: https://practice.geeksforgeeks.org/problems/smaller-and-larger4005/1/?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions#
    Time Complexity: O(log N)
*/
// { Driver Code Starts
//Initial Template for Java


import java.io.*;

public class SmallerAndLarger {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans[] = new Solve().getMoreAndLess(arr, n, x);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int result[] = new int[2];
        // Handling few edge cases given the array is already sorted
        if(x < arr[0]){
            result[0] = 0;
            result[1] = n;
            return result;
        }
        if(x > arr[n-1]){
            result[0] = n;
            result[1] = 0;
            return result;
        }
        if(x == arr[0] && x == arr[n-1]){
            result[0] = n;
            result[1] = n;
            return result;
        }
        
        // Using binary search approach because array is already sorted
        int low = 0;
        int high=n-1;
        while(low<= high){
            int mid = low + (high-low)/2;
            
            if(arr[mid] <= x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        result[0] = low;
        
        low=0;
        high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        result[1] = n - high-1;
        return result;
    }
}