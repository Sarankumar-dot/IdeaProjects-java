package oop5.InterfaceDemo;

public class Car implements Engine,Brake,Media{


    @Override
    public void brake() {
        System.out.println("i brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("i acc like a normal car");

    }
}
