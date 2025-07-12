package oop3.Inheritance1.SingleANDMultilevel;
// single level inheritance from box1
public class BoxWeight1 extends Box1 {
    double weight;

    static void greet(){
        System.out.println("hello broo iam in boxweight");
        // static methods can be inherited but cannot be overidden , if we have this same meth in with boxweights object boxweight with some differnt printing statement  we can print it, but if we have some other classes refernce and object we cant print it
        // we can acces it by creating the object of itself only
    }

    BoxWeight1(){
        super();
        this.weight = -1;
    }

    BoxWeight1(double h , double l , double w , double weight){
        // this keyword 'super' calls the parent class constructor properties

        super(h,l,w); // we have to always initialize the supper before the child class initialization of weight

        // you can also use the super class to get information from the parent class
        System.out.println(super.h); // which prints the height
        this.weight = weight;

//        super(h,l,w); this will give error
    }

    BoxWeight1 (double side , double weight){
        super(side);
        this.weight = weight;
    }

     BoxWeight1(BoxPrice1 other) {
        super(other);
        this.weight = other.weight;
    }
}
