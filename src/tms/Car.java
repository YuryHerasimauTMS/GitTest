package tms;

public abstract class Car {

    private final int WHEELS_COUNT = 4;
    private final String MODEL = "Tesla";

    public Car(){
    }

    public void drive(){
        System.out.println("Машина едет");
    }

    public void sound(){
        System.out.println("Машина делает бип-бип");
    }

    public void accelerate() {
        System.out.println(MODEL + "accelerate");
    }
}
