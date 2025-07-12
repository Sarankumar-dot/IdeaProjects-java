package SOLIDprinciples.InterfaceSegregationMethods;


interface eat{
    void eat();
}

interface work{
    void work();
}

public class Worker implements eat,work {
    public void eat(){
        System.out.println("worker can eat");
    }

    public void work(){
        System.out.println("worker can  work");
    }
}

class Robot implements work{
    public void work(){
        System.out.println("worker can work");
    }
}

class Main{
    public static void main(String[] args) {
        Worker saran = new Worker();
        saran.work();
        saran.eat();

        Robot jarvis = new Robot();
        jarvis.work();
        // jarvis.eat(); gives error beccause robots cannot eat
    }


}
