package Automation.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

//1.Läs in ett tal som beskriver vilket namn man skall skriva ut i ordningen. Fånga eventuella exceptions
public class NamesArrayExceptions {
    public static void main(String[] args) {

        String[] names = {"Ada", "Beda", "Cålle"};
        Scanner scanner = new Scanner(System.in);


        System.out.println("Vilket namn vill du skriva ut? 0 = Ada, 1 = Beda, 2 = Cålle");
        try {
            int index = scanner.nextInt();
            try {
                System.out.println("Namnet är: " + names[index]);
            } catch (Exception exception) {
                System.out.println("Numret matchar inte arrayens storlek");
            }
        } catch (Exception exception) {
            System.out.println("Du måste ange en siffra");
        }

//        System.out.println("Vilket namn vill du skriva ut? 0 = Ada, 1 = Beda, 2 = Cålle");
//        try {
//            int index = scanner.nextInt();
//            System.out.println("Namnet är: " + names[index]);
//        } catch (ArrayIndexOutOfBoundsException aiob) {
//            aiob.printStackTrace();
//            System.out.println("Numret matchar inte arrayens storlek");
//        }catch (InputMismatchException ime){
//            System.out.println("Du måste ange en siffra");
//        }catch (Exception e){
//            System.out.println(e);
//            System.out.println("Något gick fel");
        //     }
    }
}