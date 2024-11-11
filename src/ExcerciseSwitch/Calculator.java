package ExcerciseSwitch;

public class Calculator {
    private int x, y, z;

    public Calculator(int inputA, int inputB) {
        x = inputA;
        y = inputB;
    }

    public int add() {
        return x + y;
    }

    public int sub() {
        return x - y;
    }

    public double div() {
        return x / y;
    }

    public int mult() {
        return x * y;
    }

    public int power() { //Exponent
//        int result =1;
//        for (int i=0; i<y; i++){
//            result =result*x;
//        }

        return (int) Math.pow(x, y);
    }

    public int biggestOf() {
        return Math.max(x, y);
    }
    public int restenVidDivision() { //modulo
        return x%y;
    }

}