package Automation.hashMaps;

import java.util.HashMap;

public class NameAndAgeLogic {
    //Skapa en ny klass som innehåller en metod med en HashMap för att lagra namn och ålder.
    // Lägg till några namn och deras motsvarande ålder.
    // Metoden ska returnera en ålder beroende på vilket namn man har som inparameter.
    // Skapa metoden med TDD
    private HashMap<String, Integer> lista = new HashMap<>();

    public void addPerson(String name, int age) {
        lista.put(name, age);
    }

    public void addAllPersons() {
        lista.put("Tomas", 54);
        lista.put("Love", 29);
        lista.put("Hannes", 34);
    }

    public int getAgeOfPerson(String input) {
        return lista.getOrDefault(input, -1); //nedanför är samma sak som getOrDefault
//        try{
//            return lista.get(input);
//        }catch (Exception e){
//            System.out.println(e);
//            return -1;
//      }
    }
}

