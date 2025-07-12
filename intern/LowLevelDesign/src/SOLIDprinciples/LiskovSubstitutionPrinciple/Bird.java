package SOLIDprinciples.LiskovSubstitutionPrinciple;

abstract class Bird  {
    abstract void sound();
}

interface fly  {
     void fly();
}


class Sparrow extends Bird implements fly{

    @Override
    public void fly(){
        System.out.println("Sparrow can fly");
    }

    public void sound(){
        System.out.println("chirip chirip");
    }
}

class Penguin extends Bird {
    public void sound(){
        System.out.println("penguin sound");
    }
}

class Main{
    public static void main(String[] args) {
        Bird Sparrow = new Sparrow();
        Bird Penguin = new Penguin();
        Sparrow.sound();
        Penguin.sound();


        fly bird = new Sparrow();
        bird.fly();
    }
}



