package oop3.Polymorphism;


public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

//        Shapes circlee = new Circle();
//        System.out.println(circlee.sum(1,2)); // if we run anything which is not in the parent class then it gives error after creating the reference vari of paren and object of child

      /*
        to access a method in a class the classes function must be created
       Circle circle1 = new Circle();
        or u can also use
       Shapes circlee = new Circle();
        here the circlee reference variable is created in the shape and points to the object of circle();
        so in this method it is also accessible

        if there is no area() function in shapes class then the output will not be displayed for the circle one

        this is knows as upcasting
          */

        shape.area();
        circle.area();
        triangle.area();
        square.area();

        // how java know what method to run while calling is known as dynamic method dispatch

    }

}

