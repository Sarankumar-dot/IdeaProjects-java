package oop6.Generics;

public class New {
    public static void main(String[] args) {


        operation2 sum = (a,b) -> (a+b);
        operation2 prod = (a,b) -> (a*b);
        operation2 div = (a,b) -> (a/b);

        New obj = new New();

        System.out.println(obj.operate(10,20,sum));


    }

    int operate(int a , int b , operation2 type){
        return type.operate(a,b);
    }
}

interface operation2{
    int operate(int a , int b);
}
