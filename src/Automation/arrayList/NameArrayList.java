package Automation.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Använd ArrayList för att göra följande:
//
//Spara namn som man läser in
//
//Avsluta sparandet när man skriver stop
//
//Skriva ut alla namnen som har sparats
//
//Skriva över med ett nytt namn på första platsen i ArrayList
//
//Byta plats på första och sista namnet
public class NameArrayList {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Skriv namn du vill spara. Skriv 'stop' för att avsluta.");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop"))
                break;
            if (input.trim().isEmpty()) {
                System.out.println("Listan är tom.");
                continue;
            }

            nameList.add(input);
        }

        System.out.println("Sparade namn är: " + nameList);

        nameList.set(0,"Larsa");
        System.out.println("Nu med första namnet utbytt! " + nameList);


        String firstName = nameList.getFirst();
        String lastName = nameList.getLast();
        nameList.set(0,lastName);
        nameList.set(nameList.size()-1,firstName);

        System.out.println("Sista och Första namnet switchat! " + nameList);
    }
}
