import java.util.*;
public class LongestPalindromeSubstring {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        LongestPalindromeSubstring vc = new LongestPalindromeSubstring();
        System.out.println(vc.longestPalindrome(str));
        sc.close();
    }
    public boolean isPalindrome(String str){
        int i=0;
        int j = str.length()-1;
        boolean isPalin = true;
        if(str.length() == 1){
            return isPalin;
        }
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                isPalin = false;
                break;
            }
            i++;
            j--;
        }
        return isPalin;
    }


    public String longestPalindrome(String A) {
        
        String longestPalin = "";
        String str =A;
        
        for(int i=0; i <A.length(); i++){
            String str1 = A.substring(0,i);
            String str2 = A.substring(i);
            System.out.println("i: "+i+" str1: "+str1+ " isPalindrome(str1): "+isPalindrome(str1)+" str2: "+str2+ " isPalindrome(str2): "+isPalindrome(str2)+" longestPalin: "+longestPalin);
            while(!isPalindrome(str1)){
                str1 = str1.substring(0, str1.length()-1);
                if(str1.isBlank()){
                    break;
                }
            }
            if(isPalindrome(str1) && longestPalin.length() < str1.length()){
                longestPalin = str1;
            }
            while(!isPalindrome(str2)){
                str2 = str2.substring(0, str2.length()-1);
                if(str2.isBlank()){
                    break;
                }
            }
            if(isPalindrome(str2) && longestPalin.length() < str2.length()){
                longestPalin = str2;
            }
        }
        
        return longestPalin;
    }
}
