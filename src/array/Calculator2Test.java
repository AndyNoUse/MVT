package array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Calculator2Test {
    @Test
    public void addition() {
        char[] operators = {'+', '-', '*', '/'};   // Tillåtna räknesätt
        int[] termer = {12, 56};
        Calculator2 calculator2 = new Calculator2(termer);
        assertEquals("68", calculator2.operator(operators[0]));
    }
    @Test
    public void subtraction() {
        char[] operators = {'+', '-', '*', '/'};   // Tillåtna räknesätt
        int[] termer = {56, 12};
        Calculator2 calculator2 = new Calculator2(termer);
        assertEquals("44", calculator2.operator(operators[1]));
    }
    @Test
    public void multiplikation() {
        char[] operators = {'+', '-', '*', '/'};   // Tillåtna räknesätt
        int[] termer = {5, 3};
        Calculator2 calculator2 = new Calculator2(termer);
        assertEquals("15", calculator2.operator(operators[2]));
    }
    @Test
    public void division() {
        char[] operators = {'+', '-', '*', '/'};   // Tillåtna räknesätt
        int[] termer = {15, 3};
        Calculator2 calculator2 = new Calculator2(termer);
        assertEquals("5.0", calculator2.operator(operators[3]));
    }

    @Test
    public void divisionDecimalNumbers() {
        char[] operators = {'+', '-', '*', '/'};   // Tillåtna räknesätt
        int[] termer = {1, 2};
        Calculator2 calculator2 = new Calculator2(termer);
        assertEquals("0.5", calculator2.operator(operators[3]));
    }

    // Test för att kontrollera om ogiltiga operatorer hanteras korrekt
    @Test
    public void notValidOperator() {
        int[] termer = {12, 56};
        Calculator2 calculator2 = new Calculator2(termer);
        // Kontrollera att ogiltig operator returnerar felmeddelande
        assertEquals("Ogiltigt räknesätt", calculator2.operator('%') );
    }

}
