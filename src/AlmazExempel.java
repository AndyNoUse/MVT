import java.util.Scanner;

public class AlmazExempel {

    public static void main(String[] args) {
        // grundlön och provisionssats
        double baseSalary = 8000;
        double commissionRate = 0.09;
        // Skapa en Scanner för att läsa in försäljningsbelopp
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mata in försäljningsbeloppet: ");
        double salesAmount = scanner.nextDouble();
        // Beräkna totala lönen
        double totalSalary = baseSalary + (commissionRate * salesAmount);
        // Skriv ut totala lönen
        System.out.println("Den totala lönen är: " + totalSalary + " SEK");

    }
}
