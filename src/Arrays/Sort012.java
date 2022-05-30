import java.io.*;
// Problem: Sort and array of 0s, 1s and 2s
// Algorithm Dutch National Flag


class Sort012
{
    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void sort012(int a[], int n)
    {
        // code here
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(mid<=high){
            if(a[mid] == 0){
                swap(a, mid, low);
                low++;
                mid++;
            }else if(a[mid] == 1){
                mid++;
            }else{
                swap(a, mid, high);
                high--;
            }
        }
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}
