package highestNumber;

import java.util.Arrays;

public class HighestNumber {

    public static int numberWithArray(String numbers) {
        String[] numbersStringArray = numbers.split(" ");
        int max = 0;
        for (int i = 0; i < numbersStringArray.length; i++) {
            if (Integer.parseInt(numbersStringArray[i]) > max) {
                max = Integer.parseInt(numbersStringArray[i]);
            }
        }
        return max;
    }

    public static int numberWithoutArray(String numbers) {
        int lastSpace = 0;
        for (int i = 0; i < numbers.length(); i++) {
//            System.out.println(numbers.charAt(i));
            if (numbers.charAt(i) == ' ') {
                String numberString = numbers.substring(lastSpace, i);
                System.out.println(numberString);
                lastSpace = i;
            }
        }
        return 0;
    }
}
