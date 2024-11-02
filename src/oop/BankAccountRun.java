package oop;

import java.util.Scanner;

public class BankAccountRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ditt Saldo: ");

        double saldo = scanner.nextInt();

        BankAccount myBankAccount = new BankAccount(saldo); 


        System.out.println("Ditt saldo är " + myBankAccount.printSaldo() + " kr ");
        //uppgift 10 och 11


        System.out.print("Vad vill du ändra ditt Saldo till: ");
        double newBalance = scanner.nextInt();
        myBankAccount.newValueSaldo(newBalance);
        System.out.print("Ditt nya Saldo är: " + myBankAccount.printSaldo() + " kr ");
        //uppgift 12
    }

}
