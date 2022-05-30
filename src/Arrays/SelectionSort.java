import java.io.*;


public class SelectionSort {
    public static void sort(int arr[], int n) {

        System.out.println("n: "+n);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
                // System.out.println("i: "+i+" j: "+j+" min: "+ min+" arr[j]: "+arr[j]);
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
