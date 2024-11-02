package ExcerciseOOP;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        //Cirkel 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange Radien på Cirkeln: ");
        double radius = scanner.nextDouble();
        Circle circle1 = new Circle(radius);
        System.out.println("Arean är: " + circle1.calculateArea() + " cm");
        System.out.println("Omkretsen är: " + circle1.calculateCircumference() + " cm");

        //Cirkel 2
        System.out.print("Ange Radien på Cirkeln nr 2: ");
        double radius2 = scanner.nextDouble();
        Circle circle2 = new Circle(radius2);
        System.out.println("Arean är: " + circle2.calculateArea() + " cm");
        System.out.println("Omkretsen är: " + circle2.calculateCircumference() + " cm");

        //Jämför cirklarna
        boolean result = circle1.isBiggerThan(circle2);
        System.out.println("Är cirkel 1:s area större än cirkel 2:s area? > " + result);
    }
}