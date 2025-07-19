package LinkedListTutorial.SingleLinkList;

import java.util.NoSuchElementException;

public class LLimplementation {
    // the are not continuous memory allocations like arrays
    // their elements are stored in different locations in heap and accessed thrpuch arrows or pointers

    // the boxes are called nodes

    // Singly linked list
    //  1 -> 2-> 3-> 4-> 5->  every single items knows the other item knows anout the next item
    //  head-> is a reference variable points to first element
    // tail-> is a reference variable points to last element


    ///  node head ,tail , size

    private Node head;
    private Node tail;
    private int size;

    public LLimplementation(){
        this.size = 0;
    }

    /// inserting in first a linked list

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size = size+1;
    }

    /// inserting in last of a linked list

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size +1;
    }

    /// inserting in desired location
    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i <index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    ///  deleting first
    public int deleteFirst(){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        int value = head.value;
        head = head.next;

        if(head==null){
            tail=null;
        }
        size--;

        return value;
    }

    /// getting index of a node
    public Node get(int index){
        Node temp = head;

        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return temp;
    }
    /// deleteLast

    public int deleteLast(){
        if (size == 0) {
            throw new NoSuchElementException("List is empty");
        }

        if (size == 1) {
            return deleteFirst(); // safely handled now
        }

        int value = tail.value;
        Node SecondLast =get(size-2);


        tail = SecondLast;
        tail.next = null;
        size--;
        return value;
    }

    /// delete at desired index
    public int delete(int index){
        if(index == 1){
            return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }
        Node previous = get(index-1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;


    }

    ///  finding a value in linked list and returning its index
    public int findValue(int value){
        Node temp = head;

        int index = 0;
        while(temp!=null){
            if(temp.value == value){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; // if element not found
    }


    /// displaying the link list

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        ///  for nxt node
        public Node(int value , Node next){
            this.value=value;
            this.next=next;
        }
    }
}
