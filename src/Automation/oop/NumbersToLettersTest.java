package Automation.oop;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NumbersToLettersTest {
    //    //Exempel 1
//    @Test
//    public void firstTestCase() {
//
//        String text = "some text";
//        int actual = text.length();
//        int expected = 9;
//        assertEquals(expected, actual);
//    }
    //Börja med att analysera vad du behöver för varje uppgift
// (objekt, testdata, typ av metod och förväntat resultat).
// Skriv sedan testfallet. Autogenerera koden ifrån testfallet.
// Uppdatera koden så att logiken finns där.
// Kör sedan testfallet igen
//Skapa ett program som konverterar tal till bokstäver.***
    //Skriv ditt första testfall där du skapar en klass för
    // konverteringen, testdata = 1, förväntat resultat = A
    // och en metod i konverteringsklassen som svarar med
    // det actual = A. Avsluta med en assert för att jämföra
    // expected och actual. Se till att testet blir grönt
    //Varje tal från 1-26 har en motsvarande bokstav i det
    // engelska alfabetet. Så 1=A, 3=C och 26=Z
    @Test
    public void testA() { //Jag behöver en metod för att
        //konvertera översätta en char till nummer.
        //Jag vet att A = 1, Jag vet att jag behöver en class
        //som konverterar,
        NumbersToLetters converter = new NumbersToLetters();
        converter.numToLetter(1);
        assertEquals('a', converter.numToLetter(1));
    }

    @Test
    public void testC() {
        NumbersToLetters converter = new NumbersToLetters();
        converter.numToLetter(3);
        assertEquals('c', converter.numToLetter(3));
    }

    @Test
    public void testG() {
        NumbersToLetters converter = new NumbersToLetters();
        converter.numToLetter(7);
        assertEquals('g', converter.numToLetter(7));
    }

    @Test
    public void testZ() {
        NumbersToLetters converter = new NumbersToLetters();
        converter.numToLetter(26);
        assertEquals('z', converter.numToLetter(26));
    }

    @Test
    public void testNum1() {
        NumbersToLetters converter = new NumbersToLetters();
        converter.letterToNum('a');
        assertEquals(1, converter.letterToNum('a'));
    }

    @Test
    public void testNum2() {
        NumbersToLetters converter = new NumbersToLetters();
        converter.letterToNum('b');
        assertEquals(2, converter.letterToNum('b'));
    }

    @Test
    public void emptyInput() {
        NumbersToLetters converter = new NumbersToLetters();
        converter.letterToNum(' ');
        assertEquals(' ', converter.letterToNum(' '));
   }
//    @Test
//    public void arrayOfNumbersToWord() {
//        NumbersToLetters converter = new NumbersToLetters();
//        converter.numToLetter(1,2,3);
//        assertEquals('ABC', converter.numToLetter(1,2,3));
//        //assertArrayEquals om det är en Array
  //  }
    @Test
    public void wordToNumbers() {
        NumbersToLetters converter = new NumbersToLetters();
        converter.letterToNum(' ');
        assertEquals(' ', converter.letterToNum(' '));
    }
}