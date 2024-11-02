package oop;

import java.util.Scanner;

public class CalculatorRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in första talet: ");
        int tal1 = scanner.nextInt();

        System.out.print("Skriv in andra talet: ");
        int tal2 = scanner.nextInt();

        Calculator calc = new Calculator(tal1, tal2);
        System.out.println("Vad vill du göra?");
        System.out.println("1 Addera");
        System.out.println("2 Subtrahera");
        System.out.println("3 Multiplicera");
        System.out.println("4 Dividera");
        int myChoice = scanner.nextInt();
        if (myChoice == 1) System.out.println(calc.add());
        if (myChoice == 2) System.out.println(calc.sub());
        if (myChoice == 3) System.out.println(calc.mult());
        if (myChoice == 4) System.out.println(calc.div());

        int produkt = calc.mult();
        int summa = calc.add();
        calc.sub();
        calc.mult();
        Calculator calc2 = new Calculator(produkt, summa);

        System.out.println("tal1(" + tal1 + ") har som produkt(tal1*tal1): " + produkt);
        System.out.println("Summan av tal1(" + tal1 + "+" + tal2 + ") är: " + summa);

        //I din main-metod för Calculator skapa ett nytt objekt som istället för att läsa in två nya tal i
        // konstruktorn läser in två tal som är hämtade ifrån det första objektet. T.ex. att man använder
        // produkten(talx*talx)
        // som tal 1 och summan(talx+talx) som tal 2
    }
}
