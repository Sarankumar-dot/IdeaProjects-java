package StackQueue.Problems;

import java.util.Stack;

//leetcode 921
public class ValidMinimum {

    public int minAddToMakeValid(String s) {
        Stack<Character> ss = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                ss.push(ch);
            }else{
                if(ch == ')'){
                    if(ss.isEmpty() || ss.peek() != '('){
                        ss.push(ch);
                    }else{
                        ss.pop();
                    }
                }
            }
        }
        return ss.size();
    }
}
