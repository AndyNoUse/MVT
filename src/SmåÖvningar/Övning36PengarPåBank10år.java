package SmåÖvningar;

public class Övning36PengarPåBank10år {

    /*Skapa ett program som räknar ut hur mycket man har på banken under vart och ett av de
följande 10 åren om man sätter in 1000 kr. Räntan ska läsas in och är densamma för alla
åren.
     */
    public static void main(String[] args) {
        double pengar = 1000;
        double rent = 0.02; //Lägg scanner

        System.out.println("\nSaldo\tÅr");
        System.out.println("--------------");
        for (int år = 0; år <= 10; år++) {
            System.out.println(pengar + " År " + år);
            pengar += pengar * rent ;
        }
    }
}
