import java.io.*;

public class InsertionSort {
    public static void sort(int arr[], int n) {

        System.out.println("n: "+n);
        for(int i=1; i<n; i++){
            int current = arr[i];
            int j=i-1; 
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
                // System.out.println("i: "+i+" j: "+j+" min: "+ min+" arr[j]: "+arr[j]);
            }
            arr[j+1] = current;
            
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];
        String inputLine[] = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }
        // bubble sort
        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
