import java.util.*;
public class VowelAndConsonantSubstrings {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        VowelAndConsonantSubstrings vc = new VowelAndConsonantSubstrings();
        System.out.println(vc.solve(haystack));
        sc.close();
    }
    public boolean isVowel(char ch){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public boolean check(String str){

        boolean res = false;
        if(str.length() == 0){
            return res;
        }
        if(isVowel(str.charAt(0)) && !isVowel(str.charAt(str.length()-1)) ){
            res = true;
        }
        if(!isVowel(str.charAt(0)) && isVowel(str.charAt(str.length()-1)) ){
            res = true;
        }
        return res;

    }
    public int solve(String A) {
        int count = 0;
        if(A.length() <= 1){
            return count;
        }
        int vowel = 0;
        int con = 0;
        
        for(int i=0; i<A.length(); i++){
            if(isVowel(A.charAt(i))){
                vowel++;
            }else{
                con++;                
            }
        }
        return (vowel*con % 1000000007);
    }
    
}
