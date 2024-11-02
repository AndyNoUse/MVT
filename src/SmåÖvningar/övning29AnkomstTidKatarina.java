package SmåÖvningar;

import java.util.Scanner;

public class övning29AnkomstTidKatarina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter departure time (First hours then minutes : ");
        int depHours = scan.nextInt();
        int depMinutes = scan.nextInt();

        System.out.println("Enter the time you will travel (for how long. Also first hours then minutes: ");
        int travelHours = scan.nextInt();
        int travelMinutes = scan.nextInt();

        int totalDepMinutes =depHours * 60 + depMinutes;
        int totalTravelMinutes = travelHours * 60 + travelMinutes;

        int totalArrivalMinutes = totalDepMinutes + totalTravelMinutes;

        int arrivalHours = (totalArrivalMinutes / 60) % 24;
        int arrivalMinutes = totalArrivalMinutes% 60;

        boolean isNextday = totalArrivalMinutes >=24*60;
        System.out.println("Arrival time: " + arrivalHours + ":" + arrivalMinutes);
        if (isNextday) {
            System.out.println("Next day.");
        } else {
            System.out.println();
        }
    }
}
