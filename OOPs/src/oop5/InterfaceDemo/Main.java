package oop5.InterfaceDemo;


// you do not use interfaces in performance critical code
public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();
//        car.start();
//        car.stop();


//        Media car2 = new Car();
//        car2.stop();
        // for this problem of printing the other one as output we are creating separate classes for each interfaces
        // first class iam going to create a cd player which only implements media
        // then we are creating the class for power engine , electric engine
        // and then i create a normal car main class which accesses all of these

        // we are creating the normal car obj

        NormalCar obj = new NormalCar(); // you can also add engines in your constructor
        obj.start();
        obj.stop();
        obj.startMusic();
        obj.stopMusic();

        // upgrading electric engine
        obj.upgradeElecEngine();
        obj.start();
        obj.stop();
        obj.stopMusic();
    }
}
