package oop5.AbstractDemo;

public class Son extends Parent{

    public Son(int num){
        this.num = num;
    }

    @Override
    void career(String name) {
        System.out.println("iam going to be a" + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My wife name is "+ name + "age is "+age);
    }
}
