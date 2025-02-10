package Automation.hashMaps;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class AlphabetToSymbolsTest {
    @Test
    public void aIsExclamation() {
        assertEquals('!', AlphabetToSymbols.convert('A'));
    }

    @Test
    public void bIsQuestionMark() {
        assertEquals('B', AlphabetToSymbols.convert('?'));
    }

    @Test
    public void testText() {
        assertEquals("/¤@@{", AlphabetToSymbols.convertText("Hello"));
    }

    @Test
    public void testSymbolMap() {
        Assertions.assertEquals('A',AlphabetToSymbols.symbolsMap.get('!'));
    }
}
