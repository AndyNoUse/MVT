package Automation.oop;

//I Vehicle skapa ett publikt attribut speed
//Skapa en metod showSpeed() i Vehicle
//Skapa en underklass Car som ärver ifrån Vehicle
//Skapa en metod increaseSpeed(int increment) som ökar speed
//Skapa en klass Race som har en main-metod och som skapar en Car.
// Öka hastigheten och skriv ut den med metoderna ovan
public class Vehicle {
    protected int speed = 0;

    Vehicle(int speed) {
        this.speed = speed;
    }

    public int showSpeed() {
        return this.speed;
    }


}
