package SmåÖvningar;

public class Övning12FirstIsDouble {

    public static void main(String[] args) {
        /*12.Läs in två tal. Testa om det första talet är mer än dubbelt så stort som det andra talet.
         Isåfall ska meddelandet “För stort“ skrivas ut.
         */

        int number1 = 20;
        int number2 = 10;
        boolean firstIsDouble = number1 > number2 * 2;

        if (firstIsDouble) {
            System.out.println("För stort " + number1);
        } else if (number1 == number2) {
            System.out.println("Dom är lika stora");
        } else {
            System.out.println("Det första talet är inte mer än dubblet " + "'" + number2 + "'");
        }
    }
}
