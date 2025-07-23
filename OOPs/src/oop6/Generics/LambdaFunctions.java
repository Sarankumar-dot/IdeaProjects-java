package oop6.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <=5 ; i++) {
            list.add(i);
        }

        list.forEach((item) -> System.out.println(item*2)); // lambda

        // same but adding it in a consumer type function
        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        list.forEach(fun);

        operation sum = (a,b) -> (a+b);;
        operation prod = (a,b) -> (a*b);; 
        operation div = (a,b) -> (a/b);;

        LambdaFunctions me = new LambdaFunctions();
        System.out.println(me.operate(10,20,sum));
        System.out.println(me.operate(10,20,prod));
        System.out.println(me.operate(10,20,div));



    }

    private int operate(int a , int b , operation type){
        return type.operation(a,b);
    }

}

// creating an interface

interface operation{
   abstract  int operation(int a , int b);
   static final int name = 1;
}
