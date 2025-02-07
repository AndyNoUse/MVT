package Automation.oop;

//Bicycle har en egen metod nbrOfGears(int nbr)
// där man kan ställa in hur många växlar den har
//increaseSpeed(int force) ökar speed för cykeln
// beroende på vilken växel man har.
// En högre växel ökar speed mer än en låg växel
//Använd metoderna ovan och ställ in antal växlar
// och öka hastigheten på cykeln och skriv ut
// hastigheten i klassen Race
public class Bicycle extends Vehicle {
    private int nbrOfGears = 1;

    Bicycle(int speed) {
        super(speed);
    }

    public void increaseNbrOfGears(int nbr) {
        this.nbrOfGears += nbr;
    }

    public void increaseSpeed(int force){
        this.speed += (int) (nbrOfGears*force);
    }
}