package java_Arrar_Question;

import java.util.Stack;

public class parenthesis_Checker {
    public static boolean checkParenthesis(char open, char close) {
        return open == '(' && close == ')' || open == '[' && close == ']' || open == '{' && close == '}';
    }

    static boolean isParenthesisBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '['){
                st.push(c);
            } else if (c=='}' || c == ')' || c == ']') {
                if (st.isEmpty() || !checkParenthesis(st.pop(),c))
                    return false;
            }

        }

        return st.isEmpty();

    }

    public static void main(String[] args){

        System.out.println(isParenthesisBalanced("{([)])}"));;
    }
}
