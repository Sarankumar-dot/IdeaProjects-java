package oop5.InterfaceDemo;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("I start like a power engine");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a power engine");
    }

    @Override
    public void acc() {
        System.out.println("power engine accelerate");
    }
}
