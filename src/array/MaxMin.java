package array;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println(array.toString());
        //For each loop
        int max = 0;
        int min = 1000;
        for (int j : array) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());
    }
}
