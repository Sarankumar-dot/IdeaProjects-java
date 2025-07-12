package oop4.AccessControl;

import java.util.Objects;

public class ObjectDemo {
    int num ;

    public ObjectDemo(int num) {
        this.num = num;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ObjectDemo that = (ObjectDemo) o;
        return num == that.num;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(num);
    }

    @Override
    public String toString() {
        return "ObjectDemo{}";
    }

    public static void main(String[] args) {



        ObjectDemo obj = new ObjectDemo(10);
        ObjectDemo obj2 = new ObjectDemo(10);


        // the object class the first class that is inherited or extended when we create a class

        // gives random codes in numbers
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

        // we will create out own hashcode method

        // here the equal to method used to compare that these refernce variables are pointing to the same object or not
        System.out.println(obj == obj2);

        // here the .equals method checks the values are equal or not
        System.out.println(obj.equals(obj2));

        // how to check an object is an object of a class
        System.out.println(obj instanceof ObjectDemo);

        // get class mehtod used to find the name of the class
        System.out.println(obj.getClass().getName());

        final int a = 10;

       // a = 90;
    }
}
