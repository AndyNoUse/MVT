package Excercise12Classes;

public class RandomArray {
    public static void main(String[] args) {
        int[] randomArray = new int[10];

        int min = 1;
        int max = 100;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
            randomArray[i] = rand;
        }
        for (int i=0; i<10;i++){
            System.out.println(randomArray[i]);
        }
        RandomGenerator generator = new RandomGenerator();
       // int[] newArray = generator.randomArray();
        //for (int i=0; i<newArray.length;i++){
       //     System.out.println(newArray[i]);

    }
}