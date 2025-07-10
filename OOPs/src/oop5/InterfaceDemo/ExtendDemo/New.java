package oop5.InterfaceDemo.ExtendDemo;

public class New {
    public static void main(String[] args) {
        // accessing them
        Main obj = new Main();

        obj.greet();
        obj.fun();
        obj.biriyani();

        // you can only call the static methods by the interface names
        A.noob();
    }
}
