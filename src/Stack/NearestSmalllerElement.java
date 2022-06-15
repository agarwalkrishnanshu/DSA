/**
 * InterviewBit: Nearest Smaller Element
 * Easy
 * 15 June 2022
 * https://www.interviewbit.com/problems/nearest-smaller-element/
 */
package Stack;
import java.util.Stack;

public class NearestSmalllerElement {
    public int[] prevSmaller(int[] A) {
        int G[] = new int[A.length];
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i<A.length; i++){
            if(stack.isEmpty()){
                G[i] = -1;
            }else{
                int top = stack.peek();
                if(top<A[i]){
                    G[i] = top;
                }else{
                    while(!stack.isEmpty() && stack.peek() >= A[i]){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        G[i] = -1;
                    }else{
                        G[i] = stack.peek();
                    }
                }
                
            }
            stack.push(A[i]);
        }
        return G;
    }
}
