package oop5.AbstractDemo;

/*
    consider we are having a class named Parent and it contains a method called career
    like   career(String name);

    the parents are giving the choice of choosing the career to their children
     if its inherited by the child1 and child2 classes then they can override it and fill the career name
     // a child class in order to use the method of the parent class then it must override it...

     this is called as  abstract methods

     the main use of abstract is to  make the code look clean
     if you definitely know about you are going to override the parent methods then use abstract
     */

// if you try to create object of an abstract class in the main class then it will give error
// so you cannot create object of an abstract class
// Parent mom = new Parent();




public abstract class Parent {

   int num;

    // same like this we cannot create abstract constructors also
    // abstract Parent();

    // creating an abstract method

    abstract void career(String name);
    //** any class that contains one or more abstract methods then the class also be abstract class ****
    abstract void partner(String name , int age);

    // you cannot create an abstract static method
    // abstract static name(String n);

    // but you can create static methods
     static void name(int n){
         System.out.println("this is my number " + n);
     }

     // they can also contain normal methods
    void normal(){
        System.out.println("this is a normal method");
    }

    // if you have a final key in your class name then your class cannot be inherited,
    // then if you have a final in abstract class then it gives error because we can only access the elements in an abstract class by its subclasses
}

