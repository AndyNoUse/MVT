package array;

import java.util.Arrays;
import java.util.Random;

public class Övning72 {
    //72. En array med 50 inlästa tal finns. Bestäm och skriv ut index för det sista negativa talet i
    //arrayn. (Tips: Börja bakifrån i arrayn).
    public static void main(String[] args) {
        int[] numbers = new int[50];
        //slumpgenerator
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            numbers[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(numbers)); // översätter skiten till något läsbart

        int lastNegative = 0;
        for (int j = numbers.length - 1; j <= 0; j--) {
            if (numbers[j] < 0) lastNegative++;
        }
        System.out.println("Sista negativa talet är: " + lastNegative);


    }
}

