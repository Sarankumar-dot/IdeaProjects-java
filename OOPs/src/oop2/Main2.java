package oop2;

public class Main2 {
    public static void main(String[] args) {
//       Human1 saran = new Human1(20,"saran",10000,false);
//        Human1 malik = new Human1(20,"malik",10000,false);
//        Human1 ali = new Human1(20,"malik",10000,false);

        // you can use the static variables from other class without creating an object ***
        // static variables are not dependent on objects without creating an object you can still use it
//        System.out.println(Human1.population);
        /// you can print static variables or methods by using class name of them



        // if we does not use static in the method it will give error
        // inside a static method we cannot use a method which is not static
        //greet("saran");

        Human1.greet();

         /// in the below we are accessing the greet method  by creating an obj
        Main2 sarann = new Main2();
        sarann.greet("saram");

        Human1 objjjj = new Human1(20,"saran",9999999,false);
        System.out.println(objjjj.population);// we can still access static variables by creating methods but it shows us to use the class name instead of obj name

        fun();

        StaticInitialization4 objj = new StaticInitialization4();
        System.out.println(objj.a);


    }

    // this dependent on objects and you can access it by creating an object
     void greet(String name){

        System.out.println("hello "+  name);

        /// but here you can use a static method in a non static one
//         fun(); // fun() is a static method
    }

    static void fun(){
        /// you cannot use a non static method in a static method
        //greet("saran");

        /// if you want to use it you can create an object of the class
        Main2 obj  = new Main2();
        obj.greet("god is great");
    }
}
