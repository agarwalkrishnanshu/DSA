package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveDuplicate {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution {
    String removeDuplicates(String str) {
        // code here
        char lower[] = new char[26];
        char upper[]  = new char[26];
        String newStr = "";
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            System.out.println("c: "+ (int)c);
            if(c >= 97 && c <= 123 ){
                if(lower[c-97] == 0){
                    newStr += c;
                }
                lower[c-97]++;
            }
            if(c >= 65 && c <= 90 ){
                System.out.println("c: "+c);
                if(upper[c-65] == 0){
                    newStr += c;
                }
                upper[c-65]++;
            }
        }
        return newStr;
    }
}

