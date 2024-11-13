package oop;

public class Fruit {
    private String color;
    private static boolean fromTree =true;

    public Fruit() {
        color = "green";
    }

    public boolean getFromTree() {
        return fromTree;
    }

    public static void setFromTree(boolean fromTree) {
        Fruit.fromTree = fromTree;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public void printColor() {
        System.out.println(this.color);
    }
}
