package Excercise12Classes;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv första talet: ");
        int tal1 = Integer.parseInt(scanner.nextLine()); //bättre än scan next int

        System.out.print("Skriv andra talet: ");
        int tal2 = Integer.parseInt(scanner.nextLine());

    double c = Math.sqrt(tal1*tal1 + tal2*tal2);
        System.out.println("hypotenusan blir c = " + c);

    }
}
