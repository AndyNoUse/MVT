package Automation.hashMaps;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NameAndAgeTest {
    @Test
    public void addallPersons() {
        NameAndAgeLogic naal = new NameAndAgeLogic();
        naal.addAllPersons();
        assertEquals(29,naal.getAgeOfPerson("Love"));
    }
    @Test
    public void addPerson() {
        NameAndAgeLogic naal = new NameAndAgeLogic();
        naal.addPerson("Kalle", 38);
        assertEquals(38,naal.getAgeOfPerson("Kalle"));
    }
    @Test
    public void kalleRetry() {
        NameAndAgeLogic naal = new NameAndAgeLogic();
        naal.addPerson("Kalle", 38);
        naal.addPerson("Kalle", 38);
        assertEquals(38,naal.getAgeOfPerson("Kalle"));
    }
    @Test
    public void kalleAgeNotExist() {
        NameAndAgeLogic naal = new NameAndAgeLogic();
        assertEquals(-1,naal.getAgeOfPerson("Kalle"));
    }
}
