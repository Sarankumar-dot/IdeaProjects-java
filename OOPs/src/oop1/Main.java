package oop1;

public class Main {
    public static void main(String[] args) {
        int[] roll = new int[5];
        String[] name = new String[5];
        String[] gender = new String[5];
        


        // if we want to add those above three in a single line you need classes

        // to call the below class we use
        Student[] details = new Student[5];

        // obj creation
        Student saran = new Student(13,"saraaaan",99.99f); // here Student() is a constructor
        // default values without assigning before

//        saran.rno = 11;
//        saran.name = "saran";
//        saran.marks = 88.66f;

//        System.out.println(saran.rno);
//        System.out.println(saran.name);
//        System.out.println(saran.marks);

        // changing the name
        saran.changename("sarankumar");
        saran.greeting();

        //changing marks
        saran.changeMarks(99.99f);
        System.out.println(saran.name);
        System.out.println(saran.marks);



        // int the object saran the Student() is a constructor, it is a function that runs when you create a class and allocate some variables
        // you can use the constructor to add values into the objects
        // for now we create a new stud called malik

        System.out.println();

        Student malik = new Student();
        System.out.println(malik.rno);
        System.out.println(malik.name);
        System.out.println(malik.marks);

        malik.greeting();

        System.out.println();
        // random object
        Student random = new Student(malik);
        System.out.println(random.rno);
        System.out.println(random.name);


        // calling a constructor from another constructor
        // for this i have created a new class so that it will not get confused

        Employee Ali = new Employee(1,"saran");
        Employee Ali2 = new Employee();

        System.out.println(Ali.empid);
        System.out.println(Ali2.empid);
        System.out.println(Ali.name);
        System.out.println(Ali2.name);


        System.out.println();
        // memory allocation of new keyword
        // here we  are creating two new objects in which one object is equal to another object
        // if we make changes in one object it will the reflected in the another object also

        Student one = new Student(1,"Saran",89.33f);
        Student two = one;

        System.out.println(one.marks);

    }
}
// to create a class you need
// class is basically a template of an object && an object is an instance of a class
// real life examples of classes are car,fruits
class Student{
    // all the variables that  are inside your object is called instance varibles[instance means reference or example]
    int rno;
    String name;
    float marks;

    // printing hello bro using objects and this keyword
    void greeting(){
        System.out.println("hello broo " + this.name);
    }

    // changing the name of an object using this keyword
    void changename(String naae){
        this.name = naae;
    }

    // changing marks
    void changeMarks(float marks){
        this.marks = marks;
    }

    // when you create an object with 0 values as parameter the system uses this constructor
    Student(){
        // for assigning the rno,name,marks we use this keyword
        // this keyword is replacing it with the name of the reference variable eg( saran , malik )
        this.rno=1;
        this.name="noobie";
        this.marks = 99.99f;
    }

    // when you create an object with 3 values as parameter the system uses this constructor
    Student(int roll , String name , float marks){
        // for assigning the rno,name,marks we use this keyword
        // this keyword is replacing it with the name of the reference variable eg( saran , malik )

        // """this is the best method we can add all values in one line"""
        this.rno=roll;
        this.name=name;
        this.marks =marks;
    }

    // we can also get the other object values as an input for our current object lets see how
    // for this we are creating an object called random
    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}


class Employee{
    int empid = 0;
    String name = "default";

    Employee(int empid , String name){
        this.empid = empid;
        this.name=name;
    }

    Employee(){
        // this is how you can call one constructor from another construtor
        // internally it is Ali(1,"saran"); and for Ali2(1,"saran");
        this (1,"random-default-person");
    }
}

// in java primitives are stored in the stack memory so we does not need to create any object or (primitive data types are not implemented as objects)

