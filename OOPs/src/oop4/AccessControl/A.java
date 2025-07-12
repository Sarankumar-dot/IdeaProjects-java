package oop4.AccessControl;


// public -- means you can access it anywhere (everywhere)
// private means you can access it only within a class
// protected means you can only accees it within the package
// if nothing is mentioned in the variable or class then it is a default acceess
// default access allow usage in same package not in differnt package


/*
            +----------------+---------+---------+-------------------+---------------------+------------------------------+
            |  Access Level  | Class   | Package | Subclass (same pkg)| Subclass (diff pkg) | World (diff pkg & no subclass) |
            +----------------+---------+---------+-------------------+---------------------+------------------------------+
            | public         |    +    |    +    |         +         |          +          |              +                  |
            | protected      |    +    |    +    |         +         |          +          |                                 |
            | default (~)    |    +    |    +    |         +         |                     |                                 |
            | private        |    +    |         |                   |                     |                                 |
            +----------------+---------+---------+-------------------+---------------------+------------------------------+

*/

// when to use
// private - is for sensitive data (used by getter and setter methods)
// default (no-modifier) - can be used only in inside a package
// protected - can be used outside package with the help of parent class -- only the subclass access the protected member in the base class
// public - can be used everywhere
public class A {
    private int num;
    public String name;
    int[] arr;


    // getter for private int num
    public int get(){
        return num;
    }

    // setter for private int num
    public void set(int num){
        this.num = num;
    }

    // setter for public method string name
    public void set(String name){
        this.name = name;
    }

    public A (int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}
