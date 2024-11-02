package SmåÖvningar;

public class TomasSalaryExempel2 {


    public static void main(String[] args) {
        int salary = 8000;
        final int PERCENTAGE = 9;
        //int percentage = 9;
        //double factor = 0.09;
        int salesAmount = 523_456;
        double newSalary = salary + (double) (salesAmount * PERCENTAGE / 100);
        String preText = "New salary is ";
        String nyText = preText + newSalary;
        char letter = 'A';
        System.out.println(preText + newSalary);

    }
}