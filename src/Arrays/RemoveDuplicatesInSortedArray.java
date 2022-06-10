import java.util.*;
// Remove Duplicates from Sorted Array
// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesInSortedArray {
    public static int removeDuplicates(ArrayList<Integer> a) {
        
        int low = 0;
        int high = 1;
        int n = a.size();
        while(low<n && high<n){
            System.out.println("low: "+low+" high: "+high+" a.size(): "+n+ " a[low]: "+a.get(low) + " a[high]: "+ a.get(high) +" a[low]==a[high] "+(a.get(low).equals(a.get(high))));
            if(a.get(low).equals(a.get(high))){
                System.out.println("high++");
                high++;
            }else{
                Collections.swap(a, low+1, high);
                System.out.println("low++");
                low++;
                high++;
            }
            System.out.println("Array Size: "+a.size());
        }        
        return low+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s =sc.nextLine();
        String ar[] = s.split(" ");
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i=0; i<ar.length; i++){
            a.add(Integer.parseInt(ar[i]));
        }

        int n = RemoveDuplicatesInSortedArray.removeDuplicates(a);
        for(int i=0; i<n; i++){
            System.out.print(a.get(i)+" ");
        }
        sc.close();
    }
}
