package Excercise9Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestExcercise {
    //Exempel 1
    @Test
    public void firstTestCase() {

        String text = "some text";
        int actual = text.length();
        int expected = 9;
        assertEquals(expected, actual);
    }

    //Exempel 2
    @Test
    public void add() {

        //Arrange/Act/Assert Läs in två tal och addera dem

        //Arrange
        Calculator calc = new Calculator(5, 3);
        int expected = 5;

        //Act
        int actual = calc.add();

        //Assert
        assertEquals(expected, actual);
    }

}
