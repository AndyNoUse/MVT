package ExcerciseStatic;

import java.util.Scanner;

//I BankAccount gör static attribut på Banknamnet
// och ränta. Och om ni vill räkna ut räntan på kontot
// vid årets slut.
//
//public class StaticBankAccountMain {
//    public static void main(String[] args) {
//        int val = 0;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Välkommen till din Bank, vad vill du göra?");
//            System.out.println("1 Bestämma mitt belopp");
//            System.out.println("2 Se Saldo");
//            System.out.println("3 Uttag");
//            System.out.println("4 Insättning");
//            System.out.println("5 Avsluta");
//            //5 Visa bank information
//            //6 Räntan just nu
//            //7 Ärsslut, lägg till räntan på kontot
//            //9 Avsluta
//
//            int val = Integer.parseInt(scanner.nextLine());
//            switch (val) {
//                case 1:
//                    System.out.println("Vilket saldo har du på kontot: ");
//                    int saldo = scanner.nextInt();
//                    StaticBankAccount.setSaldo(saldo);
//                    break;
//                case 2:
//                    System.out.println("Ditt Saldo är: " + StaticBankAccount.getSaldo());
//                    break;
//                case 3:
//                    System.out.println("Hur mycket vill du ta ut?: ");
//                    int belopp = scanner.nextInt();
//                    if (StaticBankAccount.withdrawkOK(belopp)) StaticBankAccount.withdraw(belopp);
//                    else System.out.println("Tyvärr kan du inte ha mindre än 0 på kontot.");
//                    break;
//                case 4:
//                    System.out.println("Hur mycket vill du sätta in?: ");
//                    belopp = scanner.nextInt();
//                    StaticBankAccount.deposit(belopp);
//                case 5:
//                    System.out.println("Avslutar");
//                    break;
//                default:
//                    System.out.println("Ej giltigt, var vänlig och välj mellan 1 och 5");
//            }
//        }while (val!=5);
////        do {
////            val = scanner.nextInt();
////            if (val == 1) {
////                System.out.println("Vilket saldo har du på kontot: ");
////                int saldo = scanner.nextInt();
////                StaticBankAccountTomas.setSaldo(saldo);
////            }
////            if (val == 2) {
////                System.out.println("Ditt Saldo är: " + myAccount.getSaldo());
////            }
////            if (val == 3) {
////                System.out.println("Hur mycket vill du ta ut?: ");
////                int belopp = scanner.nextInt();
////                if (myAccount.withdrawkOK(belopp)) myAccount.withdraw(belopp);
////                else System.out.println("Tyvärr kan du inte ha mindre än 0 på kontot.");
////            }
////            if (val == 4) {
////                System.out.println("Hur mycket vill du sätta in?: ");
////                int belopp = scanner.nextInt();
////                myAccount.deposit(belopp);
//            //    }
//
//            //  } while (val != 5);
//        }
//    }
//}
