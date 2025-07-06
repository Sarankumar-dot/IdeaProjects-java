package oop2;

public class Human1 {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;


    static void greet(){
        System.out.println("hello world");
        // you cannot use this keyword in static methods if you use it will give error
//        System.out.println(this.name);
    }
    Human1(int age , String name , int salary , boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married=married;
        Human1.population+=1;
    }
}
