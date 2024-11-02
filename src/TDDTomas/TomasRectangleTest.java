package TDDTomas;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TomasRectangleTest {

    @Test
    void area() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(200, rectangle.calculateArea());

    }

    @Test
    void omkrets() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(60, rectangle.calculatePerimeter());

    }

    @Test
    void kvadratCheck() {
        Rectangle rectangle = new Rectangle(10, 10);
        assertEquals(true, rectangle.calculateIsSquare());
    }
}