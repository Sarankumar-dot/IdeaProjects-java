package oop2;


// in here outside classes cannot be static
public class Innerclass5 {
    // inside a class the class can be static or public anything else

    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("saran");
        Test b = new Test("malik");
        System.out.println(a.name);
        System.out.println(b.name);
    }

}
