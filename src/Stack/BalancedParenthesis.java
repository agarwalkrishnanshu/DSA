/* 
 * InterviewBit: Balanced Parantheses!
 * Easy
 * 14 June 2022
 * https://www.interviewbit.com/problems/balanced-parantheses/
 */

public class BalancedParenthesis {
    public int solve(String A) {
        Stack<Character> stack = new Stack<Character>();
        int isBalanced = 1;
        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    isBalanced = 0;
                    return isBalanced;                    
                }else{
                    stack.pop();
                }
            }
            
        }
        if(!stack.isEmpty()){
            isBalanced = 0;
        }
        return isBalanced;
    }
}


