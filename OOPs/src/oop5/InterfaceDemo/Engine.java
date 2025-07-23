package oop5.InterfaceDemo;

public interface Engine {
    // if you create a variable int interface it is static and final by default in interface
    static final int price = 7000000;
    // you can see that static and final are blurred in the above

    // these are the abstract methods by default cuz abstract is blurred in the below line
    abstract void start();
    void stop();
    void acc();
}
