package Automation.hashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class AlphabetToSymbols {
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";

    protected static HashMap<Character, Character> symbolsMap = new HashMap<>();

    //Då får hela klassen tillgång till ^
    static{
        for (int i = 0; i < alphabet.length(); i++) {
            symbolsMap.put(alphabet.charAt(i), symbols.charAt(i));
            symbolsMap.put(symbols.charAt(i), alphabet.charAt(i));
        }
    }
    private static void createHashMap() {
        for (int i = 0; i < alphabet.length(); i++) {
            symbolsMap.put(alphabet.charAt(i), symbols.charAt(i));
            symbolsMap.put(symbols.charAt(i), alphabet.charAt(i));
        }
    }

    public static void main(String[] args) {
        createHashMap();
        System.out.println(symbolsMap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv en mening");
        String text = scanner.nextLine();
        System.out.println(convertText(text));

    }

  public static char convert(char c) {
      return symbolsMap.get(c);
  }

    public static String convertText(String text) {
        text = text.toUpperCase();
        String symbols = "";
        for (int i = 0; i < text.length(); i++) {
           // symbols = symbols.concat(String.valueOf(symbols.charAt(alphabet.indexOf(text.charAt(text.charAt(i))))));
            symbols=symbols.concat(String.valueOf(symbolsMap.get(text.charAt(i))));
        }
        return symbols;
    }
}
