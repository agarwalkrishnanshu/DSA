/**
 * InterviewBit: Redundant Braces
 * Easy
 * 15 June 2022
 * https://www.interviewbit.com/problems/redundant-braces/
 */
package Stack;
import java.util.Scanner;
import java.util.Stack;;
public class RedundantBraces {
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                String exp = sc.next();
                Solution ob = new Solution();
                System.out.println(ob.braces(exp));
                t--;
            }
            sc.close();
        }
    
}
class Solution {
    public int braces(String A) {
        Stack<Character> stack = new Stack<Character>();
        int res = 0;
        
        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i);
            if(ch!= ')'){
                stack.push(ch);
            }else{
                Boolean isOperator = true;
                char top = stack.peek();
                stack.pop();
                
                while(top != '('){
                    if(top == '+' || top == '-' || top == '/' || top == '*'){
                        isOperator = false;
                    }
                    top = stack.peek();
                    stack.pop();
                }

                if(isOperator){ 
                    res = 1;
                    return res;
                }
            }
        }
        return res;
    }
}

