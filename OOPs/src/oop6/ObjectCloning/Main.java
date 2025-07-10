package oop6.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human obj = new Human(20,"saran");
//        Human obj2 = new Human(obj);

        // clone means we are creating an exact copy of an object
        // there is another method to clone an object
        // its a bit faster and useful if we have bigger thing to clone
        Human twin = (Human) obj.clone();
//        System.out.println(twin.name);
//        System.out.println(obj.name);

       // System.out.println(Arrays.toString(twin.arr));

       // twin.arr[0] = 10;
        // this is shallow copy

        ///  this means when we make changes in the copied array then the changes also gets reflected in the parent objects arrays
        // this means it only creates variables for primitives like int,char etc
        // and then it only points the same objects in the super class for String , Arrays etc
        // in other words it creates new variable for primitives and uses the same elements created in the super class

//        System.out.println(Arrays.toString(obj.arr));


        ///  there is another one known as deep copy
        ///  which changes eveything newww with same values then when we make a chages in the arr then it does not reflect in the parent array
        ///  this is called deep copy

        // implementation of deep copy
        ///  here if we change twin the paren will nit be changed
        twin.arr[0] = 10;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(obj.arr));



    }
}
