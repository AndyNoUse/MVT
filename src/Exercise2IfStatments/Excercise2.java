package Exercise2IfStatments;

public class Excercise2 {

    public static void main(String[] args) {
        /* Jämför två tal. Om det första är större än det andra skriv ut ”Första talet är störst”,
         samt ”Andra talet är störst” om det är tvärt om*/
        int num1 = 5;
        int num2 = 7;

        if (num1 > num2) {
            System.out.println("Första talet är störst");
        } else if (num2 > num1) {
            System.out.println("Andra talet är störst");
        }
        System.out.println("End of first part");
        System.out.println();

        /*Jämför två tal. Om det första är jämt delbart med det andra skriv ut ”Jämt delbart”,
         annars skriv ut ”Inte jämt delbart”*/
        int num3 = 21;
        int num4 = 7;
        if (num3 % num4 == 0) {
            System.out.println("Jämt delbart");
        } else {
            System.out.println("Inte jämt delbart");
        }
        System.out.println("End of second part");

    }
}