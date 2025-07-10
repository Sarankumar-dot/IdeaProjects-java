package oop6.GenericInterface;

public class Main implements Generic<Integer>{



    @Override
    public void display(Integer value) {
        System.out.println("this is running " + value);
    }

    public static void main(String[] args) {
         Main obj = new Main();

         obj.display(10);
    }


}
