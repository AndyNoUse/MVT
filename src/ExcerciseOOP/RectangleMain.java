package ExcerciseOOP;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        //Skapa ett objekt i din main-metod och skriv ut arean och omkretsen.
        Scanner scannerHeight = new Scanner(System.in);
        System.out.print("Skriv Höjd i cm: ");
        double height = scannerHeight.nextDouble();

        System.out.print("Skriv Höjd i cm: ");
        double width = scannerHeight.nextDouble();

        Rectangle rectangle = new Rectangle(height,width);

        System.out.println("Arean är: " + rectangle.calculateArea());
        System.out.println("Omkretsen är: " + rectangle.calculatePerimeter());
        if (rectangle.calculateIsSquare()) {
            System.out.println("Det är en kvadrat!");
        }
    }
}
