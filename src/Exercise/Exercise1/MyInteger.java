package Exercise.Exercise1;

public class MyInteger {
    //psvm
    public static void main(String[] args) {
        int number = 5;
        int nextNumber = 6;

        System.out.println(number);
        System.out.println(nextNumber);

        number = 5 + 3;
        nextNumber = number + 1;
        System.out.println();
        System.out.println("Now updated to: ");
        System.out.println(number);
        System.out.println(nextNumber);

        //number = number + 3
        number += 3;
        System.out.println(number);

        //number +=1; number + 1;
        number++;
        System.out.println(number);

        //nextNumber -=2;  nextNumber - 2;
        nextNumber -=2;
        System.out.println(nextNumber);

        //nextNumber = nextNumber - 1;
        nextNumber--;
        System.out.println(nextNumber);
    }

}
