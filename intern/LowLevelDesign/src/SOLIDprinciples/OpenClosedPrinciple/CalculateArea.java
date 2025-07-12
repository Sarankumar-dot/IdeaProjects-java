package SOLIDprinciples.OpenClosedPrinciple;


//open/closed principle means there must be no modification in the code , if you want to add some new features then you can add it in new class not adding in a existing class
public class CalculateArea {
    public double AreaCalculate (Shape shape){
        return shape.CalculateArea();
    }
}

class Rectangle implements Shape{
    private double length;
    private double bredth;

    public Rectangle(double length ,double bredth){
        this.length = length;
        this.bredth = bredth;
    }

    @Override
    public double CalculateArea(){
        return RectangleArea(this.length , this.bredth);
    }

    public double RectangleArea(double length , double bredth) {
        return length * bredth;
    }
}


class Circle implements Shape{
    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double CalculateArea(){
        return RectangleArea(this.radius);
    }

    public double RectangleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
