package Automation;

import java.util.HashMap;
import java.util.Scanner;

public class SimpsonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> simpsons = new HashMap<>(); //Kan skriva String, String i den nya diamanten
//Gör inte det för att vi redan fattar det???
        Scanner scan = new Scanner(System.in);


        simpsons.put("Homer", "D'oh");
        simpsons.put("Marge", "Mmm~mmmmmm");
        simpsons.put("Bart", "Ay, caramba");
        simpsons.put("Lisa", "If anyone wants me, I'll be in my room.");
        simpsons.put("Maggie", "(Pacifier Suck)");
        simpsons.put("Ned", "Hi-Diddily-Ho!");
        simpsons.put("Burns", "Excellent!");
        simpsons.put("Edna", "Ha!");
        simpsons.put("Chalmers", "SEEEEEYYYYMOOUURRR");
        simpsons.put("Apu", "Thank You, Come Again!");
        simpsons.put("Stu", "Disco Stu likes disco music");

        //       System.out.println(simpsons.get("Ned"));;
        for (int i = 0; i < 5; i++) {
            String name = scan.nextLine();
            System.out.println(simpsons.get(name));
        }
    }
}
