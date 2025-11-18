package PracticeOOP;

public class Main {
    public static void main(String[] args) {
        Student saran = new Student(5);
        System.out.println(saran.name);

        saran.changeName("saran");
        System.out.println(saran.name);
        saran.printAge();
    }
}
