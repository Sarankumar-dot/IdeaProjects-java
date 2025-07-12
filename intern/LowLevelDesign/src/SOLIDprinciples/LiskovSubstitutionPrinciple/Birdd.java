package SOLIDprinciples.LiskovSubstitutionPrinciple;

public class Birdd {
    public static void main(String[] args) {
        Sparrow Sparrow = new Sparrow();
        Sparrow.sound();
        Sparrow.fly();
    }
}
