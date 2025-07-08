package oop4.AccessControl;

public class Main {

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

    public static void main(String[] args){
        A obj = new A(1200,"saran");
//        System.out.println(obj.num); we cannot access it by this so we create a getter method
        System.out.println(obj.get());

        // setter method to set the number
        obj.set(2230);
        System.out.println(obj.get());

        // printing the public element name
        System.out.println(obj.name);

        // i can also use get and set on public also
        obj.set("malik");
        System.out.println(obj.name);

    }
}
