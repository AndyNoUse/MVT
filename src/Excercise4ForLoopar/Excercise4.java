package Excercise4ForLoopar;

public class Excercise4 {
    public static void main(String[] args) {

        /*1. Skriv ut alla tal ifrån 1-100*/
        System.out.println("Numbers 1-100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("End of part 1");
        System.out.println();

        /*2. Skriv ut alla jämna tal ifrån 1-100*/
        System.out.println("Even Numbers 1-100");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("End of part 2");
        System.out.println();

        /*Skriv ut alla fibonnacci-tal ifrån 1-100. Fibonnacci-tal är de två senaste talen adderat och börjar med 1,
        1 som första två tal. Exempel: 1, 1, 2, 3, 5, 8, 13, 21…*/
        System.out.println();
        int i2 = 1;
        int i3 = 0;
        for (int i = 1; i <= 100; i3 = i + i2, i = i2, i2 = i3) {
            System.out.print(i + " ");

           /* int i3 = i + i2;
            i = i2;
            i2 = i3;
            */

        }
        System.out.println();
        System.out.println("End of part 3");

        //Tomas exempel
        int first = 1;

        System.out.print(first + " ");

        int second = 1;

        for (int i = 0; i < 13; i++) {
            System.out.print(second + " ");
            int third = first + second;
            first = second;
            second = third;
        }
    }
}
