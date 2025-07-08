package oop3.EncapANDabstration;

// encapsulation
// wrappin up the implementation of the data members and methods inside a class
// the datamembers are variable , methids etc....
// it encapsulates the data so that it cannot be accesd  by the outside world
// people confuses encapsulation with abstraction

// abstraction
// hiding unnecessary details and showing valuable information
//abstraction is the process of gaining information
// encapsulation is the process of containing information
// for abstraction we use abstract classes and interfaces

// data hiding is achieved via encapsulation and encapsulation is the subprocess of datahiding

// for in depth check notes and video
public class Main {

    public static void main(String[] args) {
        example obj = new example();
        obj.setMarks(88.88);
        System.out.println(obj.getMarks());
    }

}
