package LinkedListTutorial.DoublyLinkList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(44);
        list.insertFirst(4433);
        list.insertFirst(4555);

        list.insertFirst(1111);
        list.insertLast(111111);

        list.insert(55,6);
        list.insert(33,5);

        list.display();

        list.getSize();
    }


}
