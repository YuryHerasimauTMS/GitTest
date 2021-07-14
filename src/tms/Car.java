package tms;

public abstract class Car {

    private final int WHEELS_COUNT = 4;

    public Car(){
    }

    public void drive(){
        System.out.println("Машина едет");
    }

    public void sound(){
        System.out.println("Машина делает бип-бип");
    }

    @Override
    public String toString() {
        return "Car{" +
                "WHEELS_COUNT=" + WHEELS_COUNT +
                '}';
    }
}
