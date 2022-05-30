// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

 // } Driver Code Ends

// { Driver Code Starts.
class RopeCutting {
    public static void merge(int arr[], int l, int mid, int r) {

        // Size of both sides
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Creating arrays for Left and Right part
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copying data temporarily
        for(int i=0; i<n1; i++){
            L[i] = arr[l+i];
        }
        for(int i=0; i<n2; i++){
            R[i] = arr[mid + 1 + i];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){

            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int arr[], int l, int r){
        if(l<r){
            int mid = l + (r-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    // Function for finding maximum and value pair
    public static ArrayList<Integer> RopeCutting(int arr[], int n) {
        // Complete the Function
        mergeSort(arr, 0, n-1);
        for(int i: arr)
		        System.out.print(i + " ");
		    System.out.println();
        ArrayList<Integer> results = new ArrayList<Integer>();

        int count;
        for(int i=0; i<n-1; i++){
            count = 0;
            while(i<n-1 && arr[i] == arr[i+1]){
                i++;
            }
            if(n-i-1 > 0){
                results.add(n-i-1);
            }
        }
        return results;
    }
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// int testcases = Integer.parseInt(br.readLine());
		
		// // looping through all testcases
		// while(testcases-- > 0){
		//     int sizeOfArray = Integer.parseInt(br.readLine());
		//     int arr [] = new int[sizeOfArray];
		    
		//     String line = br.readLine();
		//     String[] elements = line.trim().split("\\s+");
		//     for(int i = 0;i<sizeOfArray;i++){
		//         arr[i] =  Integer.parseInt(elements[i]);
		//     }
		    
		    ArrayList<Integer> res;
            int sizeOfArray = 22;
            int arr[]={122, 95, 122, 122, 94, 95, 94, 122, 122, 93, 95, 95, 122, 95, 93, 122, 95, 94, 122, 94, 5, 36};
		    res = RopeCutting(arr, sizeOfArray);
		    for(int i: res)
		        System.out.print(i + " ");
		    System.out.println();
		// }
	}
}
// } Driver Code Ends

//User function Template for Java
