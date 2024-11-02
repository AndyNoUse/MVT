package SmåÖvningar;

import java.util.Scanner;

public class övning44ReadNumbers {
    //.Skapa ett program som låter användaren bestämma hur många tal han vill summera. Läs in
    //detta antal tal och summera dem Skriv ut summan.

    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
      //  Scanner ScannerText = new Scanner(String);
        System.out.print("Skriv in antal nummer du vill addera: ");
        int antalNumbers = scannerInput.nextInt();
        int sum = 0;
        for (int i = 0; i< antalNumbers; i++){
            System.out.print("Skriv ett term: ");
            int number = scannerInput.nextInt();
            System.out.print(sum + " + " + number + " + ");
            sum = sum + number;
            System.out.println();
        }
        System.out.println(sum);
    }
}
