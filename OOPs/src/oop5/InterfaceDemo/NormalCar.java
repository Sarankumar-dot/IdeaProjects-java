package oop5.InterfaceDemo;

public class NormalCar {
    // this car can contain its default engine
    private Engine engine;
    private Media player = new Cdplayer();

    // default one is the power engine
    public NormalCar() {
       engine = new PowerEngine();
    }

    // you can add an engine of your own
    public NormalCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    // changing the engine
    public void upgradeElecEngine(){
        this.engine = new ElectricEngine();
    }

}
