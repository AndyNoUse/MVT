package fibonacci;

public class fabonicci {
    public static int fibonacci(int n) {
        int number = 0;
        if (n <= 2) number = number + 1;
        else number = fibonacci(n - 2) + fibonacci(n - 1);
        return number;
    }
}