package Automation.hashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class GatuAdressMain {
    public static void main(String[] args) {
        GatuAdressLogic logic = new GatuAdressLogic();
        HashMap<String, String> lista = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String input1 = "";
        String input2 = "";
        Boolean loop = true;
        //Spara namn, gatuadress och postnummer i
        // en hashmap med namn som nyckel
        //döpa objektet till namn? Och sen
        while (loop) {
            try {
                System.out.println("Skriv namn (eller 'stop' för att avbryta):");
                String namn = scanner.nextLine();
                if (namn.equalsIgnoreCase("stop"))
                    break;

                System.out.println("Skriv adress (eller 'stop' för att avbryta):");
                String adress = scanner.nextLine();
                if (adress.equalsIgnoreCase("stop"))
                    break;

                System.out.println("Skriv postnummer (eller 'stop' för att avbryta):");
                String postnummer = scanner.nextLine();
                if (postnummer.equalsIgnoreCase("stop"))
                    break;

                // Spara i HashMap endast om alla fält är ifyllda
                lista.put(namn, adress + ", " + postnummer);
                System.out.println(namn + " har lagts till!\n");


            } catch (Exception e) {
                System.out.println("Något gick fel!" + e);
            }
        }

        //System.out.println(lista);
        System.out.println("Sparade adresser: ");
        for (String key : lista.keySet()){
            System.out.println(key +": " + lista.get(key));
        }
    }
}
