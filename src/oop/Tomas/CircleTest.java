package oop.Tomas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    void TestOfArea() {
        Circle circle = new Circle(10);
        assertEquals(314, circle.calculateArea());
    }

    @Test
    void TestOfArea2() {
        Circle circle = new Circle(5);
        assertEquals(78.5, circle.calculateArea());
    }

    @Test
    void testofBiggerThan() {
        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(5);
        assertTrue(circle1.isBiggerThan(circle2));
    }
}
