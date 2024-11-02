package Excercise5Klasser;

public class HelloWorldPrinter {
    //Vi skpar en ny klass helloWorldPrinter som kan skriva ut Hello World!

    //Vi anropar denna nya klass ifrån HelloWorld
    //HelloWorldPrinter hwp = new HelloWorldPrinter();
    public void print() {
       // System.out.println("Hello World!");
    }
    public void printManyTimes(int times){
     /* System.out.println("Hello World! 1"); //Fulkod
        System.out.println("Hello World! 2");
        System.out.println("Hello World! 3");
        System.out.println("Hello World! 4");
        System.out.println("Hello World! 5");

      */
        for (int i = 1; i<=times; i++) { //Sexig kod
            System.out.println("Hello World. " + i);
        }
    }

}

