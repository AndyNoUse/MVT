package oop;

import java.util.Scanner;

//Skapa ett rättstavningsprogram där man tävlar i att skriva ut rätt ord.
// Användaren får ett ord skrivet på skärmen och skall sedan repetera detta ordet på kommandoraden.
// Skriver användaren rätt får den 1 poäng annars inget poäng.
// Repetera detta för några ord (3 ord räcker som exempel) och skriv sen ut totalt antal poäng.
// När du skapar ditt program försök att lägga logiken samt sparande av data i en class och
// låt classen med mainmetoden enbart läsa in text och skriva ut resultatet.
public class SpellingGameRun {
    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);
        System.out.println("Skriv ordet: "   );
        String word = playerInput.next();
    }
}
