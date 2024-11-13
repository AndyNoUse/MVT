package ExcerciseStatic;

public class Calculator {
    private static int x;
    private static int y;
    private int z;

    public static void setX (int xInput){
        x = xInput;
    }
    public static void setY (int yInput){
        y = yInput;
    }

    public static int add() {
        return x + y;
    }

    public static int sub() {
        return x - y;
    }

    public static double div() {
        return x / y;
    }

    public static int mult() {
        return x * y;
    }

    public static int power() { //Exponent
//        int result =1;
//        for (int i=0; i<y; i++){
//            result =result*x;
//        }

        return (int) Math.pow(x, y);
    }

    public static int biggestOf() {
        return Math.max(x, y);
    }
    public static int restenVidDivision() { //modulo
        return x%y;
    }

}