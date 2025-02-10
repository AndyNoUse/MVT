package Automation.hashMaps;
import java.util.HashMap;

public class GatuAdressLogic2 {
    private HashMap<String, String> adressLista;

    public GatuAdressLogic2() {
        adressLista = new HashMap<>();
    }

    // Metod för att lägga till en adress
    public void addAdress(String namn, String adress, String postnummer) {
        adressLista.put(namn, adress + ", " + postnummer);
    }

    // Metod för att hämta en adress
    public String getAdress(String namn) {
        return adressLista.getOrDefault(namn, "Ingen adress hittad för det namnet.");
    }

    // Metod för att visa alla sparade adresser
    public void showAllAdresses() {
        System.out.println("\nSparade adresser:");
        for (String key : adressLista.keySet()) {
            System.out.println(key + ": " + adressLista.get(key));
        }
    }
}

