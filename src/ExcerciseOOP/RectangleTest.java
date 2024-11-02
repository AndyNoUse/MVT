package ExcerciseOOP;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void area() {
        Rectangle rectangle = new Rectangle(10, 20);
        Assert.assertEquals(200, rectangle.calculateArea());

    }

    @Test
    void omkrets() {
        Rectangle rectangle = new Rectangle(10, 20);
        Assert.assertEquals(60, rectangle.calculatePerimeter());

    }

    @Test
    void kvadratCheck() {
        Rectangle rectangle = new Rectangle(10,10);
        Assert.assertEquals(true, rectangle.calculateIsSquare());
    }
}
