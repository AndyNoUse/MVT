package array;
// Kalkylator del 2
// Skapa en enkel kalkylator som använder en array för att lagra de fyra räknesätten (+, -, *, /).
// Användaren ska kunna ange två tal och ett räknesätt, och programmet ska utföra beräkningen och skriva ut resultatet.
// Intalen till logikklassen kan vara en array

public class Calculator2 {
    char[] operators = {'+', '-', '*', '/'};  // Array som innehåller tillåtna räknesätt
    int[] inputArray;  // Array för att lagra de två inmatade talen

    // Konstruktor som tar emot en array av två heltal och lagrar dem i `inputArray`
    public Calculator2(int[] inputArray) {
        this.inputArray = inputArray;
    }

    // Metod som utför beräkning beroende på vald operator
    public String operator(char operator) {
        boolean validOperator = false;

        // Loopa igenom operators för att kolla om det är ett giltigt räknesätt
        for (char op : operators) {
            if (operator == op) {
                validOperator = true;  // Om räknesättet är giltigt, sätt flaggan till true
                break;
            }
        }

        // Om räknesättet inte är giltigt, returnera ett felmeddelande
        if (!validOperator) {
            return "Ogiltigt räknesätt";
        }

        // Utför addition om räknesättet är '+'
        if (operator == '+')
            return Integer.toString(inputArray[0] + inputArray[1]);
            //Utför subtrataktion om räknesättet är '-'
        if (operator =='-')
            return Integer.toString(inputArray[0] - inputArray[1]);
        //Utför Multiplikation om räknesättet är '*'
        if (operator =='*')
            return Integer.toString(inputArray[0] * inputArray[1]);
        //Division my dude
        if (operator =='/')
            return Double.toString((double) inputArray[0] / inputArray[1]);
        //if (operator == '/') { //för att få bort ".0" på slutet av heltal. Kommentera ut Division för att
            //    double result = (double) inputArray[0] / inputArray[1];
            //
            //    // Kontrollera om resultatet är ett heltal
            //    if (result == Math.floor(result)) {
            //        return Integer.toString((int) result);  // Om heltal, konvertera till int och returnera utan decimaler
            //    } else {
            //        return Double.toString(result);  // Annars, returnera som double med decimaler
            //    }
            //}
        else
            return "Räknesättet ännu ej färdigkodat";  // Meddelande om övriga räknesätt ej implementerats
    }
}