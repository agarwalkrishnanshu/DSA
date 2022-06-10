import java.util.*;
// https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/discussion/
public class MergeTwoSortedList {
    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int sizea = a.size();
        int sizeb = b.size();
        int i=0;
        int j=0;
        int k=0;
        while(i<sizea && j<sizeb){
            if(a.get(k) >= b.get(j) ){
                a.add(k,b.get(j));
                k++;
                j++;
            }else if(a.get(i) < b.get(j)){
                k++;
                i++;
            }
        }

        while(j<sizeb){
            a.add(k,b.get(j));
            j++;
            k++;
        }
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s =sc.nextLine();
        String ar[] = s.split(" ");
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i=0; i<ar.length; i++){
            a.add(Integer.parseInt(ar[i]));
        }

        String s2 =sc.nextLine();
        String second[] = s2.split(" ");
        ArrayList<Integer> b = new ArrayList<Integer>();

        for(int i=0; i<second.length; i++){
            b.add(Integer.parseInt(second[i]));
        }
        MergeTwoSortedList.merge(a, b);
        for(int i=0; i<a.size(); i++){
            System.out.print(a.get(i)+" ");
        }
        sc.close();
        
    }
}
