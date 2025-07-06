package oop2;

// this is a demo to initialization of static variables
public class StaticInitialization4 {
    static int a = 10;
    static int b;

    // if you want to initialize a static variable you needd to use a static block
    // this block will only run once
    static {
        b = a*5;
        System.out.println("this block will run only once");
    }

    // if u want to print a and b
    public static void main(String[] args) {
        StaticInitialization4 obj = new StaticInitialization4();
        System.out.println(StaticInitialization4.a + " " + StaticInitialization4.b);
        // or you can also print like the following
        System.out.println(a + "  " + b);
        System.out.println(obj.a + " " + obj.b);

        obj.b+=3;

        StaticInitialization4 obj2 = new StaticInitialization4();
        System.out.println(obj2.a + " " + obj2.b);
    }
}
