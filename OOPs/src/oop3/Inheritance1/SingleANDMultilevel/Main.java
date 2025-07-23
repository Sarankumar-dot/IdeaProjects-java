package oop3.Inheritance1.SingleANDMultilevel;

public class Main {
    public static void main(String[] args) {
//        Box1 obj = new Box1(11.2 , 100.1,5.55);
//        Box1 obj2 = new Box1(obj);
//        obj.display();
//        System.out.println(obj2.h +" " + obj2.w +" " + obj2.l);
//        System.out.println(obj.h +" " + obj.w +" " + obj.l);

        // if you want to access the child class from parent class is not possible
//        System.out.println(obj.weight);


//        BoxWeight1 box = new BoxWeight1(10,20,39,22);
//    System.out.println(box.h + " " + box.weight+ " " + box.w+ " " + box.l); here we can print the parent class variables
//        box.display();

        // you can access the child class from super class by  creating the obj of child class from super class
        // but by creating that also you cannot access the properties of child class

        // the below classes know what are the properties in the above class but the above class does not know what properties in the below classes
        // so we cannot access the below from above

//        Box1 box = new BoxWeight1(2,3,5,4);
//        System.out.println(box.weight); // not able to print weight

        // you can have the parent ref variable on child like the above
        // you cannot have the child ref variable on the parent like below
//        BoxWeight1 box = new Box1(1,2,3);
//        System.out.println(box.h);

        // box price object

//        BoxPrice1 obj = new BoxPrice1(01,2,3,4,5);
//        System.out.println(obj.h +" " + obj.l+" " + obj.w +" " +obj.weight +" " +obj.cost );

//        BoxPrice1 obj1 = new BoxPrice1(4,5,100);
//        System.out.println(obj1.weight + " " + obj1.h+ " " + obj1.l+ " " + obj1.w + " " + obj1.cost);


        // static method cannot be overidden and below are the examples
       // Box1.greet();

//        BoxWeight1 oo = new BoxWeight1();
//        oo.greet(); if we use this direct object creation,it will print it in the child class
        // if boxweight does not contain greet then it checks for the parent and prints it

        // if we create something like this
//        Box1 ooo = new BoxWeight1();
//        ooo.greet(); // it will print the one in the parent class

        // conclusion --- u can inherit static methods but you cannot override
    }
}
