package ExcerciseOOP;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//7. Skapa en klass Circle. Konstruktorn ska ta in
//radien som ett attribut.

public class CircleTest {

    @Test
    @DisplayName("Radien = 1cm")
    void area() {
        Circle circle = new Circle(1);
        Assertions.assertEquals(3.141592653589793, circle.calculateArea());
    }


    @Test
    @DisplayName("Circumference 1 cm")
    void circumference() {
        Circle circle = new Circle(1);
        Assertions.assertEquals(6.283185307179586, circle.calculateCircumference());
    }

//Skapa en metod calculateCircumference som
//returnerar cirkelns omkrets. 2*r*pi

//10. Skapa ett objekt i din main-metod och skriv ut
//arean och omkretsen
}
