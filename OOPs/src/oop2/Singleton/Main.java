package oop2.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton6 a = Singleton6.getInstance();

        Singleton6 b = Singleton6.getInstance();

        Singleton6 c = Singleton6.getInstance();

        // all 3 reference variables are pointing to one object

    }
}
