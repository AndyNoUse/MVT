package Exercise.Exercise1;

public class Excercise1 {

    public static void main(String[] args) {
        /*Skapa ett program som använder tre tal
        Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen.*/

        int firstValue = 3;
        int secondValue = 7;
        int thirdValue = 25;
        int result = firstValue + secondValue + thirdValue;
        int median = result/3;
        System.out.println("The result is " +result);
       // System.out.println("The 3 values combined are " + firstValue + secondValue + thirdValue);
        System.out.println("The median is " + median);




        /*Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        Rektangelns sidor ska läsas in.*/
        int height = 3;
        int width = 5;

        int circumference = height * 2 + width * 2;
        int area = height * width;

        System.out.println("The circumference is: "+ circumference);
        System.out.println("The area is: "+ area);


    }

}
