package oop3.Inheritance1.SingleANDMultilevel;

// multi level inheritance from boxWeight1 and Box1
public class BoxPrice1 extends BoxWeight1 {
    double cost;

    BoxPrice1 (){
        super();
        this.cost = -1;
    }

    BoxPrice1 (BoxPrice1 other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice1 (double side ,double weight , double cost){
        super(side , weight);
        this.cost = cost;

    }

    BoxPrice1(double h , double l , double w , double weight , double cost){
        super(h,l,w,weight);
        this.cost = cost;
    }

}
