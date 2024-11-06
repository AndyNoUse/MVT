package MathCalculator;

import java.util.Scanner;

public class RandomGeneratorMain {
    //Generera ett slumptal mellan 0 och 99 X
    //Gissa på ett tal och svara om slumptalet är större eller mindreX
    //Skriv Grattis när du gissar rätt
    //Skriv enhetstest
    //Skriv slumptalsgeneratorn i separat klass
    //Gissningslogiken får vara i valfri klass

    public static void main(String[] args) {


        System.out.print("Jag har generat ett nummer mellan 0 och 99. Vilket tror du att det är? :");
        Scanner scanner = new Scanner(System.in);
        int guessedNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("och är det större eller mindre?");
        System.out.println("1 Större");
        System.out.println("2 Mindre");
        int myChoice = scanner.nextInt();
//        if (myChoice == 1) System.out.println(RandomGenerator.biggerThan());
//        if (myChoice == 2) System.out.println(RandomGenerator.smallerThan);
//
//        if (number == guessedNumber){
//            System.out.println("Grattis!");
//
//        }else
//        System.out.println("Tyvärr fel, det var "+ number);


 //       int[] arrayMathRandom = new int[10];

//        for (int i = 0; i < 100; i++) {
//            int number = (int) Math.floor(Math.random() * 10);
//           // System.out.println(number);
//            arrayMathRandom[number] = arrayMathRandom[number]+ 1;
//        }
//        System.out.println(Arrays.toString(arrayMathRandom));
//    Random random = new Random(10);
//     int[] arrayRandom = new int[10];
//        for (int i = 0; i < 100; i++) {
//            int number = random(10);
        }
    }
//}
