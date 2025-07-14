package LinkedListTutorial.Basics;

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
