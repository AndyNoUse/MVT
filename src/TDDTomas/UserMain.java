package TDDTomas;

import java.util.Arrays;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        //BRA FÖR INLÄMNINGSUPPGIFT Del 2 och 3
        int antalTecken = 0;
        int antalRader = 0;
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Skriv in username och password med blanksteg mellan eller stop: ");
            input = scanner.nextLine();
            //System.out.println(input);

            System.out.println("antalTecken: " + antalTecken);
            String[] userArray = input.split(" ");
           // System.out.println(Arrays.toString(userArray));
            if(! input.equals("stop")) {
                antalTecken = antalTecken + input.length();
                antalRader++;
                User user = new User(userArray[0], userArray[1]);
                System.out.println(user.getTypeOfUser());
                System.out.println(user.getUserName());
                System.out.println(user.getPassword());
            }
        } while (! input.contains("stop"));
        System.out.println(antalTecken);
        System.out.println(antalRader);
    }
}