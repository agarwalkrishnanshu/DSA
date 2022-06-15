package String;

/**
 * https://www.interviewbit.com/problems/reverse-the-string/
 */
public class ReverseString {
    public String solve(String A) {
        String res = "";
        String temp[] = A.split(" ");
        
        for(int i=0; i < temp.length; i++){
            if(temp[i].trim().length() >0){
                //System.out.println("temp[i]: "+temp[i]);
                res = temp[i] + " "+ res;
            }
        }
        return res.trim();
    }
}