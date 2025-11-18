package oop3.Inheritance1.SingleANDMultilevel;

public class Box1 {
    // anything that starts with a private keyword the you can only acecss within that file or class
    double h;
    double l;
    double w;

    static void greet(){
        System.out.println("hello broo we are in box1");
        // static methods can be inherited but cannot be overidden , if we have this same meth in  boxweight's object boxweight with some differnt printing statement  we can print it, but if we have some other classes refernce and object we cant print it
    }


    Box1(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box1(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }
    Box1(double height , double length , double width){
        this.h = height;
        this.l = length;
        this.w = width;
    }
    // copy constructor
    Box1(Box1 cons){
        this.h = cons.h;
        this.l = cons.l;
        this.w = cons.w;
    }

    private void display(){
        System.out.println("this code is running");
    }

    public static void main(String[] args) {

        // inheritance means the parent have some things the child can also use it
        // by using inheritance

        // the child class can use the properties of the parent class
        // the parent class cannot use the properties of child class

    }
}
