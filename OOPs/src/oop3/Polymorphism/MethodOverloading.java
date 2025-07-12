package oop3.Polymorphism;

// types of polymorphism
// 1. static poly / compile time poly -- achieved via method overloading
// method overloading -- means a class contains many methods with same name and different parameters
// eg : multiple constructors with same name  A a = new A();   A a = new A(1,2); etc...
public class MethodOverloading {
    int sum(int a , int b){
        return a + b;
    }

    int sum (int a , int b , int c){
        return a + b + c ;
    }

    int prod(int a , int b){
        return a * b;
    }

    int prod(int a , int b ,int c){
        return a * b * c;
    }

    public static void main(String[] args) {
        MethodOverloading num = new MethodOverloading();
        System.out.println(num.sum(1,2));
        System.out.println(num.sum(1,2,9));
        System.out.println(num.prod(1,2));
        System.out.println(num.prod(1,2,6));
    }

}
