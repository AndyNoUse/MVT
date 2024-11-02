package SmåÖvningar;

public class Övning11FirstIsHighest {
    public static void main(String[] args) {
        /*Skapa ett program där två tal läses in och det första talet skrivs ut om det är störst.*/
        int a = 15;
        int b = 7;
        boolean firstIsHighest = a > b;
        if (firstIsHighest) {
            System.out.println("true");
            System.out.println(a + " is bigger than " + b);
        } else {
            System.out.println("false");
            System.out.println(b + " is actually bigger than " + a);
        }


        //Hur en riktig utvecklar hade skrivit detta
        System.out.println((a > b) ? a : b);
    }
}
