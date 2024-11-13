package ExcerciseStatic;

import java.util.Scanner;

public class CalculatorRunSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in första talet: ");
        Calculator.setX(scanner.nextInt());

        System.out.print("Skriv in andra talet: ");
        Calculator.setY(scanner.nextInt());

        System.out.println("Vad vill du göra?");
        System.out.println("1 Addera");
        System.out.println("2 Subtrahera");
        System.out.println("3 Multiplicera");
        System.out.println("4 Dividera");
        System.out.println("5 Exponent");// tal1^tal2 t.ex 10*2=100 Math.pow
        System.out.println("6 Högsta talet"); //Math.max(tal1,tal2)
        System.out.println("7 Resten vid division"); //%modulo
        int myChoice = scanner.nextInt();

        switch (myChoice) {

            case 1:
                System.out.println("Summan är: " + Calculator.add());
                break;
            case 2:
                System.out.println("Resultatet av subtrahering blev: " + Calculator.sub());
                break;
            case 3:
                System.out.println("Produkten är: " + Calculator.mult());
                break;
            case 4:
                System.out.println("Kvoten är: " + Calculator.div());
                break;
            case 5:
                System.out.println("Resultatet av exponent är: " + Calculator.power());
                break;
            case 6:
                System.out.println("Högsta talet är: " + Calculator.biggestOf());
                break;
            case 7:
                System.out.println("Resten vid divison: " + Calculator.restenVidDivision());
                break;
            default:
                System.out.println("Alternativet finns inte");

        }
        //  if (myChoice == 1) System.out.println(calc.add());
        //        if (myChoice == 2) System.out.println(calc.sub());
        //        if (myChoice == 3) System.out.println(calc.mult());
        //        if (myChoice == 4) System.out.println(calc.div());


        int produkt = Calculator.mult();
        int summa = Calculator.add();

        Calculator.setX(produkt);
        Calculator.setY(summa);

        System.out.println("Ny beräkning med produkten och summan:");
        System.out.println("Produkt av ursprungliga tal är: " + produkt);
        System.out.println("Summan av ursprungliga tal är: " + summa);
        System.out.println("Ny summa (produkt + summa): " + Calculator.add());
        System.out.println("Ny produkt (produkt * summa): " + Calculator.mult());

        //I din main-metod för Calculator skapa ett nytt objekt som istället för att läsa in två nya tal i
        // konstruktorn läser in två tal som är hämtade ifrån det första objektet. T.ex. att man använder
        // produkten(talx*talx)
        // som tal 1 och summan(talx+talx) som tal 2
    }
}


