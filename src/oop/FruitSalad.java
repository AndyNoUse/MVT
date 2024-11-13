package oop;

public class FruitSalad {

    public static void main(String[] args) {
        Fruit apple = new Fruit();
        Fruit pear = new Fruit();
        Fruit orange = new Fruit();

//        apple.printColor();
//        pear.printColor();
//        orange.printColor();

        System.out.println(apple.getFromTree());
        System.out.println(pear.getFromTree());

        pear.setFromTree(false);
        System.out.println(apple.getFromTree());
        System.out.println(pear.getFromTree());
//        orange.setColor("Orange");
//
//        apple.printColor();
//        pear.printColor();
//        orange.printColor();
    }

}
