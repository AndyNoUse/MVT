package Automation.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

//Skapa en till klass som representerar ett annat djur (t.ex. Dog)
// med en liknande struktur som i OOP övning 1.
//Skapa en ny klass med main-metod.
// I denna klass skapar du två objekt av samma typ
// (t.ex. Frog) och ge dem olika namn
//Anropa metoderna som skriver ut deras namn och utför
// deras beteende
public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intInput = 0;
        String strInput = "";
        Dog dog1 = new Dog("Fido");
        Dog dog2 = new Dog("Pluto");
        boolean validString = false;
        boolean validInteger = false;
        while (!validInteger || !validString) {
            try {
                if (!validString) {
                    System.out.print("Vad heter din groda?: ");
                    strInput = scanner.nextLine();
                    if (strInput.isEmpty()) {
                        System.out.println("Namnet får inte vara tomt. Försök igen");
                    } else {
                        validString = true;
                    }
                }
                if (!validInteger) {
                    System.out.print("Hur gammal är grodan?: ");
                    intInput = scanner.nextInt();
                    validInteger = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Du måste ange en siffra.");
                scanner.next();
            } catch (Exception e) {
                System.out.println("Något gick fel. Ditt fel är: " + e);
            }
            Frog frog1 = new Frog(strInput, intInput);

            System.out.print("Hur många gånger hoppa grodan?: ");
            intInput = scanner.nextInt();
            frog1.setNrJumps(intInput);

            System.out.print("Hur långt hoppar grodan i längd per hopp i meter?: ");
            intInput = scanner.nextInt();
            frog1.setLengthJump(intInput);

            System.out.println(frog1.behavior(frog1.getNrJumps(), frog1.getLengthJump()));
            System.out.println(frog1.getAge());
        }
        //  System.out.println("Första hunden heter: " + dog1.getName());
        //  System.out.println("Andra hunden heter: " + dog2.getName());
        //  System.out.println(dog1.getName() + " " + dog1.behavior());
        //  System.out.println(dog2.getName() + " " + dog2.behavior());
        //System.out.println(frog1.behavior() +" "+ frog1.getNrJumps()+" gånger" );
        //System.out.println(frog1.getName()+" hoppade totalt "+ frog1.getNrJumps()* frog1.getLengthJump()+ " meter");
    }
}