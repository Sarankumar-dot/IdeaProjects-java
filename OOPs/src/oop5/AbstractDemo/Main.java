package oop5.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(19);
        son.career(" Billionaire");
        son.partner("good heart " , 26);
        son.name(1);

        Parent.name(11);

        Daughter daughter = new Daughter(10);
        daughter.career(" doctor");
        daughter.partner("good ",25);
        daughter.name(2);

        System.out.println(son.num);
        System.out.println(daughter.num);


        // if you try to create object of an abstract class then it will give error
        // so you cannot create object of an abstract class
        // Parent mom = new Parent();

        // same like this we cannot create abstract constructors also

    }

}
