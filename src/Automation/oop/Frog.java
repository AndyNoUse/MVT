package Automation.oop;

//Skapa en klass som representerar ett djur (t.ex. Frog)
//Lägg till en konstruktor till klassen med en parameter för djurets namn
//Spara djurets namn i ett attribut
//Skapa en metod som skriver ut djurets namn
//Lägg till en metod som representerar ett enkelt beteende
// (t.ex. Jump) för djuret som skrivs ut

//2.Uppdatera klassen Frog så att man kan läsa in två olika
// parametrar. Nu ska man kunna läsa in djurets namn och
// hur gammal den
//Uppdatera en beteende-metoden ifrån uppgift 5 så att den läser
// in två olika parametrar (t.ex. length och numberOfJumps)
//Använd dessa båda parametrar så att de används i metoden
// (t.ex. skriver ut hur långt grodan hoppar totalt)
public class Frog {
    private String name;   //Attribut
    private int age = 0;
    private int nrJumps = 0;
    private int lengthJump = 0;

    Frog(String name, int age) { // Konstruktor med inparameter namn
        this.name = name;   //sätter vi attributets namn med this till parameterns namn
        this.age = age;
    }

    public String getName() {// String betyder att vi returnerar en Sträng
        return name; // Om man har något annat än void måste man ha return i metoden
    }

    public String behavior(int nrJumps, int lengthJump) {
        return name + " hoppar " + nrJumps + " gånger, totalt " + nrJumps * lengthJump + " meter";
    }

    public String getAge() {
        return name + " är " + age + " år";
    }

    public int getNrJumps() {
        return nrJumps;
    }

    public void setNrJumps(int nrJumps) {
        this.nrJumps = nrJumps;
    }

    public int getLengthJump() {
        return lengthJump;
    }
    public void setLengthJump(int lengthJump) {
        this.lengthJump = lengthJump;
    }

}
