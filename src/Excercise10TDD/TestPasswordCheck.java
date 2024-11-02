package Excercise10TDD;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {

    @Test
    public void testSendingText(){
        //Arrange
        PasswordCheckTDD pass = new PasswordCheckTDD();
        boolean expected = true;

        //Act
        boolean actual = pass.check("password");

        //Assert
        assertEquals(expected, actual);
    }

}

