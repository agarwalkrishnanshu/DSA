package Arrays;

// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

public class PermutationInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            long n = Long.parseLong(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];

            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }

            
            System.out.println(isPossible(a, b, n, k) ? 1 : 0);
        }
    }
    public static void merge(long arr[], int l, int m, int r){
        
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        long L[] = new long[n1];
        long R[] = new long[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  

        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(long arr[], long l, long r) {
        
        if(l<r){
            int middle = (int) (l + (r-l)/2);
            mergeSort(arr, (int)l, middle);
            mergeSort(arr, middle+1, (int)r);
            merge(arr, (int)l, middle, (int)r);
        }
    }
    public static boolean isPossible(long a[], long b[], long n, long k) {
        // Your code goes here
        Boolean isPoss = true;
        mergeSort(a, 0, n-1);
        mergeSort(b, 0, n-1);
        for(int i=0; i<n; i++){
            long sum = a[i] + b[(int)(n-i-1)];
            if(sum<k){
                isPoss = false;
            }
        }
        return isPoss;
    }
}
// } Driver Code Ends