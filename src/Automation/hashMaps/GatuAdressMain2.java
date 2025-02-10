package Automation.hashMaps;

import java.util.Scanner;

public class GatuAdressMain2 {
    public static void main(String[] args) {
        GatuAdressLogic2 logic = new GatuAdressLogic2();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            try {
                System.out.println("Skriv namn (eller 'stop' för att avbryta):");
                String namn = scanner.nextLine();
                if (namn.equalsIgnoreCase("stop")) break;

                System.out.println("Skriv adress (eller 'stop' för att avbryta):");
                String adress = scanner.nextLine();
                if (adress.equalsIgnoreCase("stop")) break;

                System.out.println("Skriv postnummer (eller 'stop' för att avbryta):");
                String postnummer = scanner.nextLine();
                if (postnummer.equalsIgnoreCase("stop")) break;

                // Använd logik-klassen för att spara adressen
                logic.addAdress(namn, adress, postnummer);
                System.out.println(namn + " har lagts till!\n");

            } catch (Exception e) {
                System.out.println("Något gick fel: " + e.getMessage());
            }
        }

        // Visa alla adresser efter inmatning
        logic.showAllAdresses();

        // Möjlighet att söka efter en specifik persons adress
        System.out.println("\nSök efter en adress. Skriv ett namn:");
        String searchNamn = scanner.nextLine();
        System.out.println(logic.getAdress(searchNamn));

        scanner.close();
    }
}


