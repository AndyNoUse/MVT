package Automation.NumbersToArrayErrorHandling;
//1. Skriv ett program som läser in heltal med Scanner-metoden nextInt().
// Fånga InputMismatchException om användaren skriver något som inte är ett heltal.

//2. Läs in fem heltal och lägg dem i en array.
// Se till att inläsningen pågår tills det att användaren har fyllt i fem heltal.
// Användaren ska få ett tydligt felmeddelande om den skriver fel.

//3. Låt användaren välja vilket index de vill se av heltalen.
// Hantera ArrayIndexOutOfBoundsException.
// Användaren ska kunna använda denna funktionalitet i all oändlighet.

//4. Skriv ut ett informativt felmeddelande om användaren
// får ett InputMismatchException eller ArrayIndexOutOfBoundsException.
// Räkna antalet gånger som respektive felmeddelande uppstår.
//5. Om användaren skriver in stop så ska programmet avslutas och antalet
// felaktiga input för respektive felmeddelande ska visas.

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validHeltal = false;
        int[] numbers = new int[5];
        int errorCount = 0;
        int imeCount = 0;
        int aioobeCount = 0;
        int nfeCount = 0;

        for (int i = 0; i < 5; i++) {
            validHeltal = false;
            while (!validHeltal) {
                try {
                    System.out.println("Skriv in ett heltal för att lägga till listan eller skriv Stop för att avsluta: ");
                    String input = scanner.nextLine().trim();

                    if (input.equalsIgnoreCase("stop")) {
                        errorCount = aioobeCount + imeCount + nfeCount;
                        System.out.println("Totalt antal fel: " + errorCount);
                        System.out.println("Antal InputMismatchException: " + imeCount);
                        System.out.println("Antal ArrayIndexOutOfBoundsException: " + aioobeCount);
                        System.out.println("Antal NumberFormatException: " + nfeCount);
                        return;
                    }

                    numbers[i] = Integer.parseInt(input);
                    // numbers[i] = scanner.nextInt();
                    validHeltal = true;
                } catch (NumberFormatException nfe) {
                    System.out.println("Fel: Du måste skriva in ett giltigt heltal.");
                    System.out.println("Försök igen utan bokstäver eller specialtecken.");
                    nfeCount++; // Öka räknaren

                } catch (InputMismatchException ime) {
                    System.out.println("Du måste skriva in ett heltal.");
                    System.out.println("Heltalet får inte vara större än 2,147,483,647.");
                    System.out.println("Försök igen");
                    imeCount++;
                    scanner.next();

                } catch (ArrayIndexOutOfBoundsException aioobe) {
                    System.out.println("Du försöker lägga till ett nummer i en cell som inte finns.");
                    System.out.println(aioobe);
                    aioobeCount++;

                } catch (Exception e) {
                    System.out.println("Något gick, fel se nedan för ditt felmeddelande och googla det");
                    System.out.println(e);
                }
            }
        }
        System.out.print("Vilket index vill du se? 1-5 nr: ");
//        try {
//            int myChoice = scanner.nextInt();
//            switch (myChoice) {
//                case 1:
//                    System.out.println("Du valde index 1 det är nr: " + numbers[0]);
//                    break;
//                case 2:
//                    System.out.println("Du valde index 2 det är nr: " + numbers[1]);
//                    break;
//                case 3:
//                    System.out.println("Du valde index 3 det är nr: " + numbers[2]);
//                    break;
//                case 4:
//                    System.out.println("Du valde index 4 det är nr: " + numbers[3]);
//                    break;
//                case 5:
//                    System.out.println("Du valde index 5 det är nr: " + numbers[4]);
//                    break;
        try {
            int myChoice = scanner.nextInt();
            if (myChoice >= 1 && myChoice <= 5) {
                System.out.println("Du valde index " + myChoice + " det är nr: " + numbers[myChoice - 1]);
            } else {
                System.out.println("Ogiltigt val. Välj mellan 1-5.");
            }
        } catch (Exception e) {
            System.out.println("Något gick fel, se nedan för mer info");
            System.out.println(e);
        }
        errorCount = aioobeCount + imeCount + nfeCount;
        System.out.println("Totalt antal fel: " + errorCount);
        System.out.println("Antal InputMismatchException: " + imeCount);
        System.out.println("Antal ArrayIndexOutOfBoundsException: " + aioobeCount);
//        System.out.println("De angivna numbers är: ");
//        System.out.println();// + numbers[0] + numbers[1] + numbers[2] + numbers[3]);
//         for (int bajs : numbers) {
//             System.out.print(bajs + " ");
//        }
    }
}
