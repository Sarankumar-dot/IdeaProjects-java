package LinkedListTutorial.CircularLinkList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    ///  delete in cll

    public void delete (int val){

        Node node = head;
        if(head == null){
            return;
        }

        if(head.value == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);

    }

    // display CLL
    public void display(){
        Node temp = head;

        if(temp != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("End");
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
