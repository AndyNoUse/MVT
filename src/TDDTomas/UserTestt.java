package TDDTomas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserTestt {
//kör testet efter varje steg
//1.
    @Test
    void getUsername(){
        //2.
        User user = new User("tomas", "abs123");
        //5.
        assertEquals("tomas",user.getUserName());
    }
    @Test
    //6.
    void getPassword() {
        User user = new User("tomas", "abc123");
        assertEquals("abc123", user.getPassword());
    }
    @Test
        //7.
    void setUserName() {
        User user = new User("tomas", "abc123");
        user.setUserName("kalle");
        assertEquals("kalle", user.getUserName());
    }
    @Test
        //8.
    void setUserNameMoreThan4Char() {
        User user = new User("tomas", "abc123");
        assertEquals("tomas", user.getUserName());
    }
    @Test
        //8.
    void setUsernamelessThan4Char() {
        User user = new User("tomas", "abc123");
        user.setUserName("bo");
        assertEquals("tomas", user.getUserName());
    }
    @Test
    void typeOfUser(){
        User user = new User("tomas","abc123");
        assertEquals("normal",user.getTypeOfUser());
    }
    @Test
    void setTypeOfUserAdmin(){
        User user = new User("tomas","abc123");
        user.setTypeOfUser("admin");
        assertEquals("admin",user.getTypeOfUser());
    }
    @Test
    void setTypeOfUserSuper(){
        User user = new User("tomas","abc123");
        user.setTypeOfUser("super");
        assertEquals("super",user.getTypeOfUser());
    }
    @Test
    void setTypeOfUserXYZWRONG(){
        User user = new User("tomas","abc123");
        user.setTypeOfUser("XYZ");
        assertEquals("super",user.getTypeOfUser());
    }
    @Test
    void setTypeOfUserNormal(){
        User user = new User("tomas","abc123");
        user.setTypeOfUser("super");
        user.setTypeOfUser("normal");
        assertEquals("normal",user.getTypeOfUser());
    }
}
