package TDDTomas.user;

import java.util.Arrays;

public class UserEmail {

    private String[] emailArray = new String[4];
    private int numbersOfEmails = 0;

    public int getNumbersOfEmails(){
        return numbersOfEmails;
    }

    public void addEmail(String email) {
        if (email.contains("@")) {
        //if (email.contains("@")) && (alreadyExists(email) == -1) {

            if (numbersOfEmails >= 4) {
                emailArray[0] = emailArray[1];
                emailArray[1] = emailArray[2];
                emailArray[2] = emailArray[3];
                emailArray[3] = email;
            } else {
                for (int i = 0; i < emailArray.length; i++) {
                    if (emailArray[i] == null) {
                        emailArray[i] = email;
                        numbersOfEmails++;
                        break;
                    }
                }
            }
        }
    }

    public String getMailAdressAtPosition(int i) {
        return emailArray[i];
    }

    private int alreadyExists(String email) {
        for (int i = 0; i < numbersOfEmails; i++) {
            if (emailArray[i].equals(email)) return i;
        }
        return -1;
    }

    public void removeEmail(String email) {
        //Först leta reda på index i Arrayen
        //Ta bort epostadressen vid indexet
        //flytta alla senare ett steg i arrayen
        System.out.println(Arrays.toString(emailArray));
        int index = alreadyExists(email);
        for (int i = index; i < emailArray.length - 1; i++) {
            emailArray[i] = emailArray[i + 1];
        }
        emailArray[3] = null;
        numbersOfEmails--;
        System.out.println(Arrays.toString(emailArray));
    }
}
