package StackQueue.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


// stack is a class
// queue is an interface
// deque is also an interface and in this we can add and delete from both the sides
public class QueueTut {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(2);

        System.out.println(q.peek());
        // returns the first element // but in stack it returns the first element that is last
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q);

        // it is used for bfs and dfs in trees
        // when u convert recursion programs into iteration then you need to use stacks


        // deque
        // u can insert and delete at both the sides
        // that means insert from the front,back also and remove from the  front ,back also

        Deque<Integer> D = new ArrayDeque<>();
        D.addFirst(2);
        D.addFirst(4);
        D.addFirst(3);
        D.addLast(6);

        D.removeLast();

        System.out.println(D);
        // this is faster than linked list and stack
        // this is not thread safe
        // null elements are not allowed in it
        // deque is used in trees mostly

    }
}
