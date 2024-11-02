package array;
//69.En array med 50 inlästa tal finns. Addera talet 2 till talen på indexplats 0, 2, 4,… i
//arrayn.
public class Övning69Nice {
    public static void main(String[] args) {
        long[] array = new long[50];
        array[0] = 1;

        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = array[i] + 2;
            }
        }
        for (int i= 0; i< array.length; i++){
            System.out.println("Index"+ i + ": "+ array[i]);
        }
    }
}
