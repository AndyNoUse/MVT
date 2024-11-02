package SmåÖvningar;

public class Prestationslön {
    // En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
    //försäljningssumman. Skapa ett program som beräknar lönesumman under en period. 30k i försäljnings summa
    public static void main(String[] args) {

        int groundPay  = 8000;

        double sales = 30000 * 0.09;

        double result = groundPay + sales;

        System.out.println("The payout will be " +result);

    }
}
