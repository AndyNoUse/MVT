package Automation.oop;

public class Race {
    public static void main(String[] args) {
        Car car1 = new Car(0);
        Bicycle bicycle1 = new Bicycle(0);

        System.out.println("Bilen börjar med hastighet: "+ car1.showSpeed());
        car1.increaseSpeed(10);
        System.out.println(car1.showSpeed());
        car1.increaseSpeed(10);
        System.out.println("Nu har bilen ökat i fart och har hastighet: "+ car1.showSpeed());

        System.out.println("Cykeln börjar med hastighet: "+ bicycle1.showSpeed());
        bicycle1.increaseSpeed(2);
        System.out.println(bicycle1.showSpeed());
        bicycle1.increaseNbrOfGears(1);
        bicycle1.increaseSpeed(2);
        System.out.println("Nu har cykeln hastighet: "+bicycle1.showSpeed());
    }
}
