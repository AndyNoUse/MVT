package Automation.hashMaps;

import java.util.HashMap;

public class AlphabetToSymbolsLogic {
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";
    private HashMap<Character, Character> library = new HashMap<>();

//    public void initLibrary() {
//        for (int i = 0; i < alphabet.length(); i++) {
//            library.put(alphabet.charAt(i), symbols.charAt(i));
//            library.put(symbols.charAt(i), alphabet.charAt(i));
//        }
//        public void char convertChar(char c) {
//            int index = alphabet.indexOf(c);
//            return symbols.charAt(index);
//        }
//
//        public void char convertSymbol(char c) {
//            int index = symbols.indexOf(c);
//            return alphabet.charAt(index);
//        }
//
//        public void String convertText(String text) {
//            text.toUpperCase();
//            String symbols = "";
//            for (int i = 0; i < text.length(); i++) {
//                symbols = symbols.concat(String.valueOf(symbols.charAt(alphabet.indexOf(text.charAt(text.charAt(i))))));
//            }
//            return symbols;
}
