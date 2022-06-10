
import java.util.*;
/**
 * https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1/#
 * 
 * https://www.interviewbit.com/problems/pair-with-given-difference/
 * 42 -533 -666 -500 169 724 478 358 -38 -536 705 -855 281 -173 961 -509 -5 942 -173 436 -609 -396 902 -847 -708 -618 421 -284 718 895 447 726 -229 538 869 912 667 -701 35 894 -297 811 322 
369
 * 
 */
public class PairWithGivenDifference {
    public static boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        while(i<size && j<size){
            
            if(i!=j && arr[j] - arr[i] == n){
                return true;
            }else if(arr[j]-arr[i] < n){
                j++;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        String s =sc.nextLine();
        String ar[] = s.split(" ");
        int A[] = new int[ar.length];
        for(int i=0; i<ar.length; i++){
            A[i] = Integer.parseInt(ar[i]);
        }
        int B = sc.nextInt();
        System.out.println(PairWithGivenDifference.findPair(A, A.length, B));
        
    }
    
}
