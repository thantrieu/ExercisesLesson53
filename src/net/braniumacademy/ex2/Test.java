package net.braniumacademy.ex2;

public class Test {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setName("Tesla Model S");
        myCar.brake();
        myCar.startEngine();
        myCar.turnLight(true);
        myCar.accelarate(100);
        myCar.wipe();
    }
}
