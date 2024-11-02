package TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testGetName() {
        User user = new User("Love", "hej");
        assertEquals("Love", user.getName());

    }

    @Test
    void testGetPassword() {
        User user = new User("Love", "hej");
        assertEquals("hej", user.getPassword());
    }

    @Test
    void testChangeUserName() {
        User user = new User("Love", "hej");
        user.nameChange();
        assertEquals("Bob", user.getName());
    }

    @Test
    void testUsernameLength() {
        User user = new User("Lover", "hej");
        assertTrue(user.nameGetLength() > 4);
        System.out.println(user.getName() +" Antal tecken: " +user.nameGetLength());
       // if (text.length() > 4) text = newText; //Legobit för inlämningsuppgiften
    }
}
