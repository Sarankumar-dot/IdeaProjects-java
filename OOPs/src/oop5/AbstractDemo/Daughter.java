package oop5.AbstractDemo;

public class Daughter extends Parent {

    public Daughter(int num) {
        this.num=num;
    }

    @Override
    void career(String name){
        System.out.println("iam going to be a" + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My husband name is "+ name + "age is "+age);
    }
}
