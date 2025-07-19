package LinkedListTutorial.CircularLinkList;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insert(4);
        list.insert(3);
        list.insert(55);

        list.display();

        list.delete(55);

        list.display();

    }
}
