package SmåÖvningar;

//Skapa ett program som skriver ut n! (fakulteten). n ska läsas in.
//Ex: 3! = 1 * 2 * 3 5! = 1 * 2 * 3 * 4 * 5
//49.Skapa ett program som beräknar f (x)= x
//n
//x och n ska läsas in.
public class övning48Fakultet {
    public static void main(String[] args) {
        int fakultet = 12;
        int produkt = 1;
        for (int i = 1; i <= fakultet; i++) {//Börjar på 1 istället för 0 för annars blir det svårt att gångra med den
            produkt = produkt * i;
            System.out.print(i + " * ");

        }
        System.out.println(" = " + produkt);
    }
}
