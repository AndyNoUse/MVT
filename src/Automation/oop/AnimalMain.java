package Automation.oop;

//Skapa en till klass som representerar ett annat djur (t.ex. Dog)
// med en liknande struktur som i OOP övning 1.
//Skapa en ny klass med main-metod.
// I denna klass skapar du två objekt av samma typ
// (t.ex. Frog) och ge dem olika namn
//Anropa metoderna som skriver ut deras namn och utför
// deras beteende
public class AnimalMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido");
        Dog dog2 = new Dog("Pluto");
        Frog frog1 = new Frog("Prinsen", 2);
        //frog1.setAge(2);
        frog1.setNrJumps(6);

        System.out.println("Första hunden heter: " + dog1.getName());
        System.out.println("Andra hunden heter: " + dog2.getName());

        System.out.println(dog1.getName() + " " + dog1.behavior());
        System.out.println(dog2.getName() + " " + dog2.behavior());
        System.out.println(frog1.behavior());

        //System.out.println(frog1.behavior() +" "+ frog1.getNrJumps()+" gånger" );
        //System.out.println(frog1.getName()+" hoppade totalt "+ frog1.getNrJumps()* frog1.getLengthJump()+ " meter");
        System.out.println(frog1.getAge());
    }

}
