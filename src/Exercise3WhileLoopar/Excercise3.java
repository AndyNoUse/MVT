package Exercise3WhileLoopar;

public class Excercise3 {

    public static void main(String[] args) {
        /*Skriv ut alla tal ifrån 1-100*/
        System.out.println("Numbers 1-100:");
        int number = 1;

        while (number <= 100) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        System.out.println("End of part 1");

        /*Skriv ut alla jämna tal ifrån 1-100*/
        //Mitt försök

        /*int num2 = 1;
        while (num2 <= 100) {
            if (num2 % 2 == 0) {
                System.out.println(num2);
                num2 = num2 + 1;
         */
        System.out.println("Even Numbers 1-100:");
        int even = 2;

        while (even <= 100) {
            System.out.print(even + " ");
            even += 2;
        }
        System.out.println();
        System.out.println("End of part 2");

        /*Skriv ut alla fibonnacci-tal ifrån 1-100. Fibonnacci-tal är de två senaste talen adderat och börjar med 1,
        1 som första två tal. Exempel: 1, 1, 2, 3, 5, 8, 13, 21…

        */
        System.out.println("Fibonnaci numbers 1-100");
        int fibonnaciA = 1;
        int fibonnaciB = 1;

        while (fibonnaciA <= 100) {
            System.out.print(fibonnaciA + " ");

            int nextnum = fibonnaciA + fibonnaciB;
            fibonnaciA = fibonnaciB;
            fibonnaciB = nextnum;
        }
        System.out.println();
        System.out.println("End of part 3");
    }


}



