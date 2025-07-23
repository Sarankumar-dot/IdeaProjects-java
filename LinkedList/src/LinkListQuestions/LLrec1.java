package LinkListQuestions;

import java.util.NoSuchElementException;

// this is the same code as the single link list but we are inserting elements by using recursion f
public class LLrec1 {
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

    public LLrec1(){
        this.size = 0;
    }

    // insert using recursion

    public void InsertREC(int index , int val){
        Node temp = head;
        if(index == 0 || temp == null){
            insertFirst(val);
            return;
        }else{
            InsertRec(index , val , temp);
        }

    }
    private  void InsertRec(int index , int val , Node node){
        if (node == null) {
            throw new IndexOutOfBoundsException("Index exceeds list length");
        }

        if(index == 1){
            Node temp = new Node(val);
            temp.next = node.next;
            node.next = temp;
            size+=1;
            return;
        }

        InsertRec(index-1 , val , node.next);
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

    // leetcode 83 Remove duplicates
    // 2
    public void RemoveDup(){
        Node temp = head;

        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }else{
                temp = temp.next;
            }
        }

        tail = temp;
        tail.next = null;
    }

    // leetcode 21 Merge two sorted lists
    // 3
    public static LLrec1 merge(LLrec1 first , LLrec1 second){
        Node f = first.head;
        Node s = second.head;

        LLrec1 ans = new LLrec1();

        while(f.next != null && s.next!=null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    // leetcode 141 linked list cycle
    // the below two questions are asked on amazon and microsoft
    // 4
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }

        return false;
    }

    // length of linked list cycle
    // 5
    public int LengthCycle(LLrec1 list) {
        Node fast = list.head;
        Node slow = list.head;

        int countLength = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                Node temp = slow;
               do{
                   temp = temp.next;
                   countLength +=1;

               }while (temp != fast);
                break; // ✅ Break only after cycle length is counted
            }

        }
        return countLength;
    }

    // linked list cycle 2
    // leetcode - 142  medium

   /*
    public ListNode detectCycle(ListNode head) {

        // step 1 finding the length of the cycle
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length = length+1;
                } while(temp != slow);
                break;
            }

        }

        // if no elements found return null
        if(length == 0){
            return null;
        }

        ListNode f = head;
        ListNode s = head;

        // step 2 moving the second node to the length
        while(length > 0){
            s = s.next;
            length--;
        }

        // step 3 moving both first and second node till they meet eachother at the start index
        while(f != s){
            f = f.next;
            s = s.next;
        }

        // we can return anything f or s
        return f;
    }

    */

    // happy number - 202 (Leetcode)
    // 7
    static boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            slow = Square(slow);
            fast = Square(Square(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }

        return false;
    }

    static int Square(int num){
        int ans = 0;
        while(num>0){
            int last = num%10;
            ans += last * last;
            num/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        boolean ans = isHappy(19);
        System.out.println(ans);
    }

    /// leetcode 876 - Middle of a linked list
//    public ListNode middleNode(ListNode head) {
//        ListNode f = head;
//        ListNode s = head;
//
//        while(f != null && f.next != null){
//            f = f.next.next;
//            s = s.next;
//        }
//
//        return s;
//    }


    // recursion Linked list reverse
    // 10

    public void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // inplace reversal of recursion
    // leetcode 206





}
