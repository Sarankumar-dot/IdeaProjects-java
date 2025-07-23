package oop5.InterfaceDemo.ExtendDemo;

// extending interfaces
public interface A {

    void fun();

    // starting from java 8 you can add some default implementation to the methods in interface

    default void biriyani(){
        System.out.println("iam inside  biriyani meth");
    }

    // static methods can be inherited but cannot be overidden
    // so for that only in interfaces static methods must have a body
    // you can only call the static methods by the interface names

    static void noob(){
        System.out.println("you are a noob");
    }
}
