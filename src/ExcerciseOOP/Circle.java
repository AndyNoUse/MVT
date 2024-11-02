package ExcerciseOOP;  // Anger vilket paket klassen tillhör

public class Circle { // Definierar en klass som representerar en cirkel
    // Privat variabel som bara kan nås inifrån klassen
    private double radius;

    // Konstruktor: Skapar ett nytt cirkel-objekt
    // inputRadius är värdet som skickas in när vi skapar en ny cirkel
    public Circle(double inputRadius) {
        radius = inputRadius;
    }

    // Metod som beräknar cirkelns area
    // Formeln är: area = radius * radius * pi
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    // Metod som beräknar cirkelns omkrets
    // Formeln är: omkrets = 2 * radius * pi
    public double calculateCircumference() {
        return 2 * radius * Math.PI;
    }

    // Metod som jämför denna cirkelns area med en annan cirkels area
    // otherCircle är den andra cirkeln vi vill jämföra med
    public boolean isBiggerThan(Circle otherCircle) {
        // this.calculateArea() beräknar arean för denna cirkel
        // otherCircle.calculateArea() beräknar arean för den andra cirkeln
        // Returnerar true om denna cirkel är större, false om den är mindre eller lika
        return this.calculateArea() > otherCircle.calculateArea();
    }
}
