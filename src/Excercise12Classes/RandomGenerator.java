package Excercise12Classes;

public class RandomGenerator {



    int min = 1;
    int max = 100;
    int range = max - min + 1;

int arrayLength = (int) (Math.random() * range) + min;
    int[] randomArray = new int[arrayLength];
        for (int i = 0; i < randomArray.length; i++) {
        int rand = (int) (Math.random() * range) + min;
        System.out.println(rand);
        randomArray[i] = rand;
    }
        for (int i=0; i<randomArray.length;i++){
        System.out.println(randomArray[i]);
    }
        }
        return randomArray;
    }

}
