package Excercise7StringManager;

import java.util.Scanner;

public class excercise7ForString {
    public static void main(String[] args) {
        //Läs in en String
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        //Om man skriver ordet "ägg" så skrivs menigen "ägg är knasigt ut
        //låg förut under for loopen men det här är snyggare
        if (text.equals("ägg")) {
            System.out.println("ägg är knasigt");
        } else {

            //Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen
            for (int i = 0; i < text.length(); i++)
                System.out.print(text.charAt(i) + " ");


        }

    }

}

