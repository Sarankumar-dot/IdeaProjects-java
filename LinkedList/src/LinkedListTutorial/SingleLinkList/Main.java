package LinkedListTutorial.SingleLinkList;

public class Main {
    public static void main(String[] args) {
        LLimplementation list = new LLimplementation();
//        list.insertFirst(5);
//        list.insertFirst(599);
//        list.insertFirst(99);


        list.insertLast(5);
        list.insertLast(599);
        list.insertLast(99);
        list.insertLast(223);
        list.insertLast(922);
        list.insertLast(9344);

        // insert at desired location
        list.insert(100,1);

        //deleteFirst
        System.out.println(list.deleteFirst());

        //delete last
        System.out.println(list.deleteLast());

        list.display();

        // delete desired element
        System.out.println(list.delete(4));

        // findingElements
        System.out.println(list.findValue(2232));



        list.display();
    }
}
