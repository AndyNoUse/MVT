package TDDTomas.user;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserEmailTest {

    @Test
    public void AddOneEmail() {
        UserEmail userEmail = new UserEmail();
        String email = "test@abc.se";
        userEmail.addEmail(email);
        Assert.assertEquals(email, userEmail.getMailAdressAtPosition(0));
        Assert.assertEquals(1,userEmail.getNumbersOfEmails());
    }

    @Test
    public void AddTwoEmail() {
        UserEmail userEmail = new UserEmail();
        String email0 = "test0@abc.se";
        String email1 = "test1@abc.se";
        userEmail.addEmail(email0);
        userEmail.addEmail(email1);
        Assert.assertEquals(email0, userEmail.getMailAdressAtPosition(0));
        Assert.assertEquals(email1, userEmail.getMailAdressAtPosition(1));
        Assert.assertEquals(2,userEmail.getNumbersOfEmails());
    }

    @Test
    public void AddFiveEmail() {
        UserEmail userEmail = new UserEmail();
        String email0 = "test0@abc.se";
        String email1 = "test1@abc.se";
        String email2 = "test2@abc.se";
        String email3 = "test3@abc.se";
        String email4 = "test4@abc.se";
        userEmail.addEmail(email0);
        userEmail.addEmail(email1);
        userEmail.addEmail(email2);
        userEmail.addEmail(email3);
        userEmail.addEmail(email4);

        Assert.assertEquals(email1, userEmail.getMailAdressAtPosition(0));
        Assert.assertEquals(email2, userEmail.getMailAdressAtPosition(1));
        Assert.assertEquals(email3, userEmail.getMailAdressAtPosition(2));
        Assert.assertEquals(email4, userEmail.getMailAdressAtPosition(3));
        Assert.assertEquals(4,userEmail.getNumbersOfEmails());
    }

    @Test
    public void AddEmailWithoutAt() {
        UserEmail userEmail = new UserEmail();
        String email = "testabc.se";
        userEmail.addEmail(email);
        Assert.assertEquals(null, userEmail.getMailAdressAtPosition(0));
    }

    @Test
    public void AddTwoSimilarEmails() {
        UserEmail userEmail = new UserEmail();
        String email = "test@abc.se";
        userEmail.addEmail(email);
        userEmail.addEmail(email);
        Assert.assertEquals(email, userEmail.getMailAdressAtPosition(0));
        Assert.assertEquals(null, userEmail.getMailAdressAtPosition(1));
        Assert.assertEquals(null, userEmail.getMailAdressAtPosition(2));
        Assert.assertEquals(null, userEmail.getMailAdressAtPosition(3));
    }

    @Test
    public void RemoveEmail() {
        UserEmail userEmail = new UserEmail();
        String email0 = "test0@abc.se";
        String email1 = "test1@abc.se";
        String email2 = "test2@abc.se";
        String email3 = "test3@abc.se";
        userEmail.addEmail(email0);
        userEmail.addEmail(email1);
        userEmail.addEmail(email2);
        userEmail.addEmail(email3);
        userEmail.removeEmail(email1);
        Assert.assertEquals(email0, userEmail.getMailAdressAtPosition(0));
        Assert.assertEquals(email2, userEmail.getMailAdressAtPosition(1));
        Assert.assertEquals(email3, userEmail.getMailAdressAtPosition(2));
        Assert.assertEquals(null, userEmail.getMailAdressAtPosition(3));
        Assert.assertEquals(3,userEmail.getNumbersOfEmails());
    }

}
