package tms;

public abstract class Car {

    private final int WHEELS_COUNT = 4;
    private final String ENGINE = "Engine";

    public Car(){
    }

    public void drive(){
        System.out.println("Машина едет быстро");
    }

    public void sound(){
        System.out.println("Машина делает бип-бип");
    }
}
