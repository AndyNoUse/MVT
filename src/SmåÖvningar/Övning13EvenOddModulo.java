package SmåÖvningar;
/*Skapa ett program som läser in ett tal och skriver ut om det är jämnt. (Använd
modulooperatorn)*/

public class Övning13EvenOddModulo {
    public static void main(String[] args) {

        int x = 2; //ÖVERKURS 0001 = 1 // 0010 = 2 0011 = 3 1111= 15
        //byte y = 7 // 00000000111
        if (x % 2 == 0) System.out.println("It is a even " + x);
      //  if (x % 2 != 0) System.out.println("It is a odd " + x);

        //överkurs
        if ( (x & 1) == 0) System.out.println("even");

    }
}

