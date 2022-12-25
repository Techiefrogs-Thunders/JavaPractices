package Stackassignment;
import java.util.Stack;
public class P6 {
    public static boolean backspaceCompareUsingStack(String S, String T) {
 
        Stack<Character> st1 = backspaceOperationWithStack(S);
        Stack<Character> st2 = backspaceOperationWithStack(T);

        return st1.equals(st2);
     }

     private static Stack<Character> backspaceOperationWithStack(String str) {

         Stack<Character> st = new Stack<>();

         //Traverse a string
         for(int i = 0; i < str.length(); i++) {

           char ch = str.charAt(i);

           /*
             If current char is not a backspace,
             then push them in a stack. Else pop the
             last pushed character from a stack.
           */
           if(ch != '#') {
            st.push(ch);

           } else if (!st.isEmpty()){
              st.pop();
          } 
        }

        return st;
    }
    public static void main(String[] args) {
        String str1="aa";
        String str2="bb";
        boolean result = backspaceCompareUsingStack(str1, str2);
 
         System.out.println(result);
    }
}
