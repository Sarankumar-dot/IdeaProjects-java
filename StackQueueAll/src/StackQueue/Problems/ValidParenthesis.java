package StackQueue.Problems;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        String s = "{[()]";
        boolean ans = isValid(s);
        System.out.println(ans);

    }
// leetcode
    static boolean isValid(String s){
        Stack<Character> ss = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                ss.push(ch);
            }else{
                if(ch == '}') {
                    if (ss.isEmpty() || ss.pop() != '{') {
                        return false;
                    }
                }
                if(ch == ']') {
                    if (ss.isEmpty() || ss.pop() != '[') {
                        return false;
                    }
                }
                if(ch == ')') {
                    if (ss.isEmpty() || ss.pop() != '(') {
                        return false;
                    }
                }
                }
            }


        return ss.size() == 0;
    }
}
