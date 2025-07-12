package oop7;

import java.util.Collection;
import java.util.Vector;

public class CollectionFramework {

    ///  which is used to make our work easier , write code faster , use the one's which are already exists
    ///  collection is an interface which contains some methods

    // vector in java similar to arraylist , but it is very slow
    //because in arraylist multiple thread can access it but in vector if a thred is accessing it then the nexxt thread should wait for the completion of first thread
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        System.out.println(vector);
    }




}
