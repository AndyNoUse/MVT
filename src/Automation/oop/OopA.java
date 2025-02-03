package Automation.oop;

//OOP Övning 1
//
//Skapa en klass som representerar ett djur (t.ex. Frog)
//Lägg till en konstruktor till klassen med en parameter för djurets namn
//Spara djurets namn i ett attribut
//Skapa en metod som skriver ut djurets namn
//Lägg till en metod som representerar
// ett enkelt beteende (t.ex. Jump) för djuret som skrivs ut
public class OopA {
    //attribut
    public int aPublic = 0;
    private int aPrivate = 1;
    int aNothing = 2;
    protected int aProtected = 3;

    public int getaPrivate() {
        return aPrivate;
    }

    public void setaPrivate(int aPrivate) {
        this.aPrivate = aPrivate;
    }
}
