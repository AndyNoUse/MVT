package TDDTomas;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RandomGameTest {

    @Test
    void lowerNumber(){
        RandomNumber randomNumber = new RandomNumber();
        int number = randomNumber.getCorrectNumber()-1;
        Assert.assertEquals("För lågt",randomNumber.inputNumber(number));
    }
    @Test
    void higherNumber(){
        RandomNumber randomNumber = new RandomNumber();
        int number = randomNumber.getCorrectNumber()+1;
        Assert.assertEquals("För högt",randomNumber.inputNumber(number));
    }
    @Test
    void correctNumber(){
        RandomNumber randomNumber = new RandomNumber();
        int number = randomNumber.getCorrectNumber();
        Assert.assertEquals("Rätt",randomNumber.inputNumber(number));
    }
}
