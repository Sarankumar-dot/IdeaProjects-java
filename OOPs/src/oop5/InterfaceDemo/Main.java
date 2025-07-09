package oop5.InterfaceDemo;


// you do not use interfaces in performance critical code
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.acc();
        car.start();
        car.stop();
    }
}
