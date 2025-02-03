package Automation.oop;
//Skapa en till klass som representerar ett annat djur (t.ex. Dog)
// med en liknande struktur som i OOP övning 1.
//Skapa en ny klass med main-metod.
// I denna klass skapar du två objekt av samma typ
// (t.ex. Frog) och ge dem olika namn
//Anropa metoderna som skriver ut deras namn och utför
// deras beteende
public class Dog {
    private String name;
    private String behavior = "skäller";
    Dog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String behavior(){
        return behavior;
    }
}
