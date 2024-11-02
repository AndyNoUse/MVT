package array;

import java.util.Scanner;

public class Calculator2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in 2 tal med blanksteg mellan ");
        int tal1 = scanner.nextInt();
        int tal2 = scanner.nextInt();

        // Lagra talen i en array som skickas till kalkylatorn
        int[] termer ={tal1, tal2};

        // Be användaren ange räknesätt
        System.out.print("välj räkneset: +,-,*,/ ");
        char räkneset = scanner.next().charAt(0);

        // Skapa en instans av Calculator2 med användarens inmatade tal
        Calculator2 calculator2 = new Calculator2(termer);

        // Utför beräkningen och skriver ut resultatet
        System.out.println(calculator2.operator(räkneset));
    }
}
