package PracticeOOP;

public class Student {

    int roll;
    String name;
    int age;


    Student(){
        this.roll = 1;
        this.name = "noobie";
        this.age = 0;
    }

    Student(int roll,String name,int age){
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    Student(int n){
        this(n,"random - person",1);
    }

    public void changeName(String name){
        this.name = name;
    }

    public void printAge(){
        System.out.println(this.age);
    }

}
