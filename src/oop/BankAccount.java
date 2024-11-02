package oop;

//10. 	Skapa ett program BankAccount som kan hålla koll på hur stort saldo man har (pengar på sitt konto)
//11. 	Utöka programmet så att man kan skriva ut saldot
//12. 	Utöka programmet så att man kan bestämma ett nytt värde för saldo
//13. 	Utöka programmet så att man kan lägga till 	och ta bort en viss summa ifrån saldot
public class BankAccount {
    private double saldo;


    public BankAccount(double saldo) {
        this.saldo = saldo;
    }

    public double printSaldo() {
        return saldo;
    }

    public double newValueSaldo(double newBalance) {
        saldo = newBalance;
        return newBalance;
    }

}
