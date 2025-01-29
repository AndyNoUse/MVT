package Automation.NumbersToArrayErrorHandling;
//1. Skriv ett program som läser in heltal med Scanner-metoden nextInt().
// Fånga InputMismatchException om användaren skriver något som inte är ett heltal.

//2. Läs in fem heltal och lägg dem i en array.
// Se till att inläsningen pågår tills det att användaren har fyllt i fem heltal.
// Användaren ska få ett tydligt felmeddelande om den skriver fel.

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validHeltal = false;
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            validHeltal = false;
            while (!validHeltal) {
                try {
                    System.out.println("Skriv in ett heltal för att lägga till listan: ");
                    numbers[i] = scanner.nextInt();
                    validHeltal = true;
                } catch (InputMismatchException exception) {
                    System.out.print("VARNING:");
                    System.out.println("Du måste skriva in ett heltal.");
                    System.out.println("Heltalet får inte vara större än 2,147,483,647.");
                    System.out.println("Försök igen");
                    scanner.next();
                } catch (Exception e) {
                    System.out.println("Något gick fel se nedan för ditt felmeddelande och googla det");
                    System.out.println(e);
                    scanner.next();
                }
            }
        }
        System.out.print("De angivna numbers är: ");// + numbers[0] + numbers[1] + numbers[2] + numbers[3]);
        for (int bajs : numbers) {
            System.out.print(bajs + " ");
        }
    }
}
