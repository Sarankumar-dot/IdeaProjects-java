package oop6.ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

//    public Human(Human other){
//        this.name = other.name;
//        this.age = other.age;
//    }

    public Human(int age , String name){
        this.age = age;
        this.name = name;
        this.arr = new int[] {4,3,2,4,2};
    }
//
//    public Object clone() throws CloneNotSupportedException{
//        // this is shallow copy
//
//        // this means it only creates variables for primitives like int,char etc
//        // and then it only points the same objects in the super class for String , Arrays etc
//        // in other words it creates new variable for primitives and uses the same elements created in the super class
//
//        return super.clone();
//    }


    public Object clone() throws CloneNotSupportedException{


        Human twin = (Human) super.clone(); // this is actually shallow copy

        // this is deep copy
        twin.arr = new int [twin.arr.length];

        for (int i = 0; i <twin.arr.length ; i++) {
             twin.arr[i] = this.arr[i];
        }

        return twin;


    }


}
