package array;

import java.util.Arrays;

public class Övning70 {
    //70.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är positiva.
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() - 0.5) * 2000);
        }
        System.out.println(Arrays.toString(array)); // översätter skiten till något läsbart
        int positivnumbercounter = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) positivnumbercounter++;
        }
        System.out.println("antal positiva tal är " + positivnumbercounter);


        int[] array2 = {1, 2, 3, 4, 5};  // Exempel på array
        // Iterera baklänges från sista till första index
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.println("Index " + i + ": " + array2[i]);
        }

    }
}