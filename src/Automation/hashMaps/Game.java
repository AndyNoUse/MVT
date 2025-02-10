package Automation.hashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> mapCompleted = new HashMap<>();
        mapCompleted.put("start", "Vilket djur vill du lägga till i ditt zoo? Lejon, Zebra, Elefant");
        mapCompleted.put("lejon", "RAWR! Stort leende! Du har adopterat ett lejon!");
        mapCompleted.put("zebra", "Snort! Se vad bra! Du har adopterat en zebra!");
        mapCompleted.put("elefant", "Tut tutt! Vilken trumpet! Du har adopterat en elefant!");

        Scanner scanner = new Scanner(System.in);
        map.put("start", "Vilket djur vill du lägga till i ditt zoo? Lejon, Zebra, Elefant");

        System.out.println(map.get("start"));
        while (true) {
            switch (scanner.nextLine().toLowerCase()) { // Gör inmatningen skiftlägesokänslig
                case "lejon":
                    map.put("lejon", "RAWR! Stort leende! Du har adopterat ett lejon!");
                    System.out.println(map.get("lejon"));
                    break;
                case "zebra":
                    map.put("zebra", "Snort! Se vad bra! Du har adopterat en zebra!");
                    System.out.println(map.get("zebra"));
                    break;
                case "elefant":
                    map.put("elefant", "Tut tutt! Vilken trumpet! Du har adopterat en elefant!");
                    System.out.println(map.get("elefant"));
                    //   System.out.println(map);
                    //   System.out.println(mapCompleted);
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen!");
                    continue;
            }

            if (map.equals(mapCompleted)) {
                System.out.println("BRAVO! Du har adopterat alla djur till ditt zoo!");
                break;
            }
        }
    }
}
