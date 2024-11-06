package Excercise13Switch;

import java.util.Scanner;

public class DayMonthSeason {
    public static void main(String[] args) {
        System.out.print("Skriv 1-7 för att få ut siffrans dag: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        scanner.nextLine();
        switch (day){
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Dagen finns inte");
                }

        System.out.println("Skriv månad för att få ut årstid: ");
        String month = scanner.nextLine();

        // Omvandlar månaden så att den börjar med stor bokstav
        month = month.substring(0,1).toUpperCase() + month.substring(1);

        switch (month){
            case "December","Januari","Februari":
                System.out.println("Vintern");
                break;
            case "Mars","April","Maj":
                System.out.println("Våren");
                break;
            case "Juni","Juli","Augusti":
                System.out.println("Sommaren");
                break;
            case "September","Oktober","November":
                System.out.println("Höst");
            default:
                System.out.println("Ha en bra dag");
        }
    }
}
