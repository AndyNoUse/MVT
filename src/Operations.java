public class Operations {

    public static void main(String[] args) {

       /*
       +		plus
-		minus
*		gånger
/		delat med
%	modulus (resten av en division)

7 % 3 = 1
25 % 5 = 0
137 % 10 = 7
*/
        int number = 5;
        int nextNumber = 6;

        number = nextNumber * 3 + 2;
        nextNumber = number / 7;

        System.out.println(number);
        System.out.println(nextNumber);
        System.out.println();

        
        //7 /3 = 2 + resten 1
        int number2 = 7 % 3;
        int nextNumber2 = 25 % 5;

        System.out.println(number2);
        System.out.println(nextNumber2);

        //137 / 10 = 13,7 // 10*13 = 130 // 13 + resten 7
        int third = 137 % 10;
        System.out.println(third);

    }

}
