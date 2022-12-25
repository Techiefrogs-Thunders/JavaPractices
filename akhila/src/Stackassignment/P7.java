package Stackassignment;
import java.util.Stack;
public class P7 {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if(ch == '(') {
                if(stack.size() > 0) {
                    ans.append(ch);
                }
                stack.push(ch);
            } else {
                if(stack.size() > 1) {
                    ans.append(ch);
                }
                stack.pop();
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        P7 p7=new P7();
        System.out.println(p7.removeOuterParentheses("((()())())"));
    }
}
