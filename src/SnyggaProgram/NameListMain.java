package SnyggaProgram;

import java.util.ArrayList;
import java.util.Scanner;

//Linneas metod för NameList
public class NameListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        boolean loop = true;

        while (loop) {
            System.out.println("Vad vill du göra?" +
                    "\n1. Lägga till namn" +
                    "\n2. Skriva över det första namnet mot ett nytt namn" +
                    "\n3. Byta plats på första och sista namnet" +
                    "\n4. Skriva ut alla namnen i listan" +
                    "\n5. Avsluta programmet");

            try {
                int input = Integer.parseInt(scanner.nextLine());

                switch (input) {
                    case 1:
                        System.out.println("Skriv de namn du vill lägga till: " +
                                "\nFör att avsluta, skriv stop");
                        while (true) {
                            System.out.print("Namn: ");
                            System.out.println("Avsluta med stop");
                            String name = scanner.nextLine();
                            if (name.equalsIgnoreCase("stop")) {
                                break;
                            }
                            names.add(name);
                        }
                        break;
                    case 2:
                        System.out.println("Skriv in det namn du vill byta ut det första namnet mot: ");
                        names.set(0, scanner.nextLine());
                        break;
                    case 3:
                        String firstName = names.getFirst();
                        names.removeFirst();
                        names.addFirst(names.getLast());
                        names.removeLast();
                        names.addLast(firstName);
                        //Går nog att göra kortare
                        break;
                    case 4:
                        for (String name : names) {
                            System.out.println(names.indexOf(name) + 1 + ": " + name);
                        }
                        break;
                    case 5:
                        System.out.println("Avslutar programmet...");
                        loop = false;
                        break;
                    default:
                        System.out.println("Felaktig inmatning, väl ett nummer mellan 1 och 5!");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Inga bokstäver eller märkliga tecken. Bara Siffror 1-5");
                System.out.println(nfe);

            } catch (Exception e) {
                System.out.println("Oväntat fel! " + e);
            }
        }
    }
}
