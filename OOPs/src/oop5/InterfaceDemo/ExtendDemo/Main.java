package oop5.InterfaceDemo.ExtendDemo;

public class Main implements B{

    @Override
    public void fun(){
        System.out.println("this is fun ");
    }

    // annotation is internally an interface
    @Override
    public void greet(){
        System.out.println("hello");
    }
}
