package Excercise6PetZoo;

public class PetZoo {

    public static void main(String[] args) {
        Pet dog = new Pet("Fido");
        Pet cat = new Pet("Missan");
        Pet rabbit = new Pet("Koko");

        //använd denna metod ifrån klassen PetZoo på dina tre nyligen skapade objekt
       /* dog.printName();
        cat.printName();
        rabbit.printName();

        */

    /*Använd denna metod ifrån klassen Petzoo
     på dina tre nyligen skapade objekt
      och spara värdet i en variabel:


       Skriv ut namnen två gånger ifrån Petzoo

     */
        String dogName = dog.getName();
        String catName = cat.getName();
        String rabbitName = rabbit.getName();

        for(int i=0; i<2; i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(rabbitName);
        }
    }
}
