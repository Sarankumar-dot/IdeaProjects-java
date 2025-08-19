package StackQueue.Stsck;

import java.util.Arrays;
import java.util.Stack;

public class StackTut {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(40);
        s.push(30);
        s.push(20);
        s.push(1);


        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek()); // gets the last inserted element in the stack
        System.out.println(Arrays.toString(s.toArray()));
        System.out.println(s.removeElement(2));
        s.pop();
        System.out.println(s.empty()); // checks if the stack is empty or not
        System.out.println(s);

    }
}
