package ExcerciseOOP;

public class Rectangle {
    //Skapa en klass Rectangle. Konstruktorn ska ta in bredd och höjd som attribut.
    private double height, width;

    public Rectangle(double inputHeight, double inputWidth){
        height = inputHeight;
        width = inputWidth;
    }

    //Skapa en metod calculateArea som returnerar rektangelns area.
    public double calculateArea() {
        return height * width;
    }

    //Skapa en metod calculatePerimeter som returnerar rektangelns omkrets.
    public double calculatePerimeter() {
        return height * 2 + width * 2;
    }

    public boolean calculateIsSquare() {
        return height == width;
    }
}
