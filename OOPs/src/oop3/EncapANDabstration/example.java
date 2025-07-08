package oop3.EncapANDabstration;

public class example {
    private double marks = 1.33;

    // data hiding is known as encapsulation
    // if a variable is declared as private, then you can access it outside the class via get method
    public double getMarks() {
        return marks;
    }

    // you can also set the marks by using setter
    public void setMarks(double marks) {
        this.marks = marks;
    }
}
