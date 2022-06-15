package String;

import java.util.Scanner;
/**
 * https://leetcode.com/problems/implement-strstr/submissions/
 * https://www.interviewbit.com/problems/implement-strstr/
 */
class NeedleHaystack {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        NeedleHaystack nh = new NeedleHaystack();
        System.out.println(nh.strStr(haystack, needle));
        sc.close();
    }
    public int strStr(String haystack, String needle) {
        int needleIndex = -1;
        if(needle.length() == 0){
            return 0;
        }
        int LA = haystack.length(); // haystack
        int LB = needle.length(); // needle
        int i=0;
        int j=0;
        while(i<LA){
            System.out.println("i: "+i+" haystack[i]: "+haystack.charAt(i)+ " needle[i]: "+needle.charAt(0)+
                                " haystack[i] == needle[i]: "+ (haystack.charAt(i) == needle.charAt(0)));
            if(haystack.charAt(i) == needle.charAt(0)){
                j=0;
                int index = i;
                needleIndex = i;
                System.out.println(" inside if j: "+j+" haystack[i]: "+haystack.charAt(index)+ " needle[i]: "+needle.charAt(j));
                while(j<LB){
                    System.out.println("while j: "+j+" haystack[i]: "+haystack.charAt(index)+ " needle[i]: "+needle.charAt(j));
                    if(index >= LA){
                       needleIndex = -1;
                       break; 
                    }
                    if(haystack.charAt(index) != needle.charAt(j)){
                        needleIndex = -1;
                        break;
                    }
                    index++;
                    j++;
                }
                if(needleIndex!=-1){
                    return needleIndex;
                }
            }
            i++;
        }
        
        return needleIndex;
        
    }
}
