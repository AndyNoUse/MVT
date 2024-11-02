package SmåÖvningar;

//66.I en array finns ett personnummer. Skapa ett program som kontrollerar
//att födelsedatum och de fyra sista siffrorna åtskiljs av ett bindestreck.
//Skriv ut ett felmeddelande om så ej är fallet
// 67.Om den näst sista siffran är jämn i personnumret är det en kvinna,
// om den är ojämn är det en man. Avgör om personen i föregående uppgift är man eller kvinna.
public class Övning66FödelseDatum {
    public static void main(String[] args) {
        String[] personnummerArray = {"19950403-0371", "199504030371", "19981212-3456", "20030505-1264"};

        // Gå igenom varje personnummer i arrayen
        for (int i = 0; i < personnummerArray.length; i++) {
            String personnummer = personnummerArray[i];

            //Bindestreck check
            if (!personnummer.contains("-")) {
                System.out.println("Inget Bindestreck finns mellan 8 första tecken och 4 sista (xxxxxxxx-xxxx)");
            } else {
                // Om bindestrecket finns på rätt plats, skriv ut personnumret
                System.out.println(personnummer);
            }
            // Kontrollera om personnumret tillhör en man eller kvinna
            // Hämta den näst sista siffran i personnumret, vilket avgör kön
            char genderDigit = personnummer.charAt(personnummer.length() - 2);

            // Om den näst sista siffran är udda är det en man, annars en kvinna
            if ((genderDigit - '0') % 2 != 0) {
                System.out.println("Man");
            } else {
                System.out.println("Kvinna");
            }
        }
    }
}
