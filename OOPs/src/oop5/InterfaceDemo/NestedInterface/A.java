package oop5.InterfaceDemo.NestedInterface;

public class A {
    // nested interface

    // thee main difference is the nested interface can be declared as private , ppublic , protected
    // but the normal interface can only be public and default
    public interface Nested{
        boolean isOddorEven(int n);
    }
}

class B implements A.Nested{
    @Override
    public boolean isOddorEven(int n){
        return (n&1) == 1 ;
    }
}

class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOddorEven(2));
    }
}
