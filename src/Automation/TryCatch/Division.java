package Automation.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;

        try {
            System.out.print("Skriv in täljaren får inte vara 0: ");
            number1 = scanner.nextDouble();

        } catch (InputMismatchException ime) {
            System.out.println("Endast nummer får skrivas");
        }

        try {
            System.out.print("Skriv in nämnaren får inte vara 0: ");
            number2 = scanner.nextDouble();
        } catch (InputMismatchException ime2) {
            System.out.println("Endast nummer får skrivas");

        }
        try {
            System.out.println("Kvoten är: " + number1 / number2);
        } catch (ArithmeticException ae) {
            System.out.println("Får ej dela med noll");
            System.out.println(ae);
            // }catch ()

        }
    }
}