package ExcerciseStatic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add() {
        Calculator.setX(5);
        Calculator.setY(10);
        assertEquals(15, Calculator.add());
    }

    @Test
    void sub() {
        Calculator.setX(18);
        Calculator.setY(6);
        assertEquals(12, Calculator.sub());
    }

    @Test
    void div() {
        Calculator.setX(10);
        Calculator.setY(5);
        assertEquals(2, Calculator.div());
    }

    @Test
    void mult() {
        Calculator.setX(15);
        Calculator.setY(12);
        assertEquals(180, Calculator.mult());
    }

    @Test
    @DisplayName("4^2=16")
    void power() {
        Calculator.setX(4);
        Calculator.setY(2);
        assertEquals(16, Calculator.power());
    }

    @Test
    @DisplayName("10^5=100 000")
    void power2() {
        Calculator.setX(10);
        Calculator.setY(5);
        assertEquals(100_000, Calculator.power());
    }

    @Test
    @DisplayName("10^0=1")
    void power3() {
        Calculator.setX(10);
        Calculator.setY(0);
        assertEquals(1, Calculator.power());
    }
    @Test
    @DisplayName("e^5=148.41")
    void power4() {
        Calculator.setX(10);
        Calculator.setY(0);
        assertEquals(1, Calculator.power());
    }
}