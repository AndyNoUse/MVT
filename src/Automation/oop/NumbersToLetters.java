package Automation.oop;

//Konverterar klassen
public class NumbersToLetters {
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public int numToLetter(int num) {
       // return alphabet.charAt(num - 1);
        switch (num){
            case 1:
                return 'a';
            case 2:
                return 'b';
            case 3:
                return 'c';
            case 7:
                return 'g';
            case 26:
                return 'z';
        }
        return num;
    }

   public char letterToNum(char character){
        switch (character){
            case 'a':
                return 1;
            case 'b':
                return 2;
        }
        return character;
    }

}
