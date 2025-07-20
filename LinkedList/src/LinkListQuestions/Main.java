package LinkListQuestions;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LLrec1 list = new LLrec1();
        LLrec1 list2 = new LLrec1();


        list.insertLast(1);
        list.insertLast(3);
        list.insertLast(5);

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);

        LLrec1 ANS = LLrec1.merge(list , list2);
        ANS.display();

        // insert using recursion
//        list.InsertREC(4,555);


//        list.display();
//        // remove duplicates leetcode 83
//        list.RemoveDup();
//        list.display();



    }
}
