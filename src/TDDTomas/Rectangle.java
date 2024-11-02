package TDDTomas;

public class Rectangle {
    //attribut
    private int high, width;

    //Konstruktor med 2 inparametrar av typen int
    public Rectangle(int inputHigh, int inputWidth) {
        high = inputHigh; //Sätter objektets höjd
        width = inputWidth; //Sätter objektets bredd
    }

    //Metod för att räkna ut arean
    public int calculateArea() {
        return high * width;
    }

    //Metod för att räkna ut omkrets
    public int calculatePerimeter() {
        return high * 2 + width * 2;
    }

    public boolean calculateIsSquare() {
        return high == width;
    }
}
