package Automation.hashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        //Skapa en HashMap för att lagra namn och ålder. Lägg till några namn och deras motsvarande ålder.
        HashMap<String, Integer> list = new HashMap<>();
        list.put("Tomas", 54);
        list.put("Love", 29);
        list.put("Hannes", 34);
        System.out.println("Här kommer dom första 3 namn i listan:");
        for (String key : list.keySet())
            System.out.println(key + " - " + list.get(key));

//Uppdatera programmet så att det skriver ut åldern på det namn man har läst in med Scanner och som matchar namn lagrade i din HashMap
        NameAndAgeLogic naal = new NameAndAgeLogic();
        naal.addAllPersons();
        Scanner scanner = new Scanner(System.in);
        //  System.out.println("Skriv ett av namnen i listan för att få ut åldern: Love - Nilsson - Hannes ");
        System.out.println("Skriv ett av namnen i listan för att få ut åldern: Love Tomas Hannes");
        String input = scanner.nextLine();
       // System.out.println(naal.getAgeOfPerson(input));
        System.out.println(list.get(input));
    }
}
