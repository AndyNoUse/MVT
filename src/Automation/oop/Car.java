package Automation.oop;

public class Car extends Vehicle{

    Car(int speed) {
        super(speed);
    }
    public void increaseSpeed(int increment) {
        speed += increment;
    }
}
