package LinkedListTutorial.DoublyLinkList;

public class DLL {
    private Node head;
    private int size;

    // for displaying size
    public void getSize(){
        System.out.println(this.size);
    }

    public DLL(){
        this.size = 0;
    }

    /// insertFirst
    public void insertFirst(int val){
        Node node = new Node(val);

        node.next= head;
        node.previous=null;
        if(head!=null){
            head.previous = node;
        }
        head = node;

        size++;
    }

    ///  insert last

    public void insertLast(int val){


        Node node = new Node(val);
        Node last  = head;

        if(head==null){
            node.previous = null;
            head = node;
            return;
        }

        while(last.next!= null){
            last = last.next;
        }

        last.next = node;
        node.next=null;
        node.previous = last;

        size++;
    }

    // travese in dll

    public Node traverse(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // insert after desired element
    public void insert(int val , int after){

        if (after == 0) {
            insertFirst(val);
            return;
        }

        Node position = traverse(after -1 );
        if(position==null){
            System.out.println("does not exist");
        }
        Node node = new Node(val);
        Node nextNode = position.next;

        node.previous = position;
        position.next = node;

        node.next = nextNode;
        if (nextNode != null) {
            nextNode.previous = node;
        }

        size++;

    }

    // deleteFirst in link list
    public void deleteFirst(){
        if(size==0){
            throw new NullPointerException("no elements");
        }

        if(head.next == null){
            head = null;
        }else {
            head = head.next;
            head.previous = null;
        }

        size--;

    }

    // delete last in link list
    public void deleteLast(){

        if(size == 0){
            throw  new NullPointerException("no element");
        }
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        size--;
    }

    // delete at desired index
    public void delete(int index){
        if(index ==0){
            deleteFirst();
        }
        Node temp = head;

        temp = traverse(index-1);

        Node toDelete = temp.next;
        Node nextNode = temp.next.next;

        temp.next = nextNode;

        if(nextNode != null){
            nextNode.previous = temp;
        }

        size--;

    }


    /// display and reversal of linked list
    public void display(){
        Node temp = head;
        Node last = null;

        while(temp!=null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println();
        System.out.println("Reversed Link list");

        while (last!=null){
            System.out.print(last.value + " -> ");
            last = last.previous;
        }
        System.out.println("End");
    }






    private class Node{
        int value;
        Node next;
        Node previous;

        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node next , Node previous){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
