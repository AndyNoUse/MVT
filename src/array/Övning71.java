package array;

import java.util.Arrays;

public class Övning71 {
    //71.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är större än
    //det första talet.
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()) * 2000);
        }
        System.out.println(Arrays.toString(array)); // översätter skiten till något läsbart

        int biggerThanCounter = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[0] < array[j]) biggerThanCounter++;
        }
        System.out.println("Antal tal som är större än tal1 är: " + biggerThanCounter);
    }
}