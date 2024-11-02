package oop.Tomas;

import oop.BankAccount;

import java.util.Scanner;

public class BankAccountTomasRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till din Bank, vad vill du göra?");
        System.out.println("1 Bestämma mitt belopp");
        System.out.println("2 Se Saldo");
        System.out.println("3 Uttag");
        System.out.println("4 Insättning");
        System.out.println("5 Avsluta");
        BankAccountTomas myAccount = new BankAccountTomas();

        int val = 0;
        do {
            val = scanner.nextInt();
            if (val == 1) {
                System.out.println("Vilket saldo har du på kontot: ");
                int saldo = scanner.nextInt();
                myAccount.setSaldo(saldo);
            }
            if (val == 2) {
                System.out.println("Ditt Saldo är: " + myAccount.getSaldo());
            }
            if (val == 3) {
                System.out.println("Hur mycket vill du ta ut?: ");
                int belopp = scanner.nextInt();
                if (myAccount.withdrawkOK(belopp)) myAccount.withdraw(belopp);
                else System.out.println("Tyvärr kan du inte ha mindre än 0 på kontot.");
            }
            if (val == 4) {
                System.out.println("Hur mycket vill du sätta in?: ");
                int belopp = scanner.nextInt();
                myAccount.deposit(belopp);
            }

        } while (val != 5);
    }
}
