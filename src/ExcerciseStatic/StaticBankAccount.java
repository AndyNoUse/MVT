package ExcerciseStatic;

//I BankAccount gör static attribut på Banknamnet
// och ränta. Och om ni vill räkna ut räntan på kontot
// vid årets slut.
//
public class StaticBankAccount {
    private static int saldo;

    public static int setSaldo(int newSaldo) {
        return saldo = newSaldo;
    }

    public static int getSaldo() {
        return saldo;
    }

    public static int withdraw(int amount) {
        return saldo = saldo - amount;
    }

    public static int deposit(int amount) {
        return saldo = saldo + amount;
    }

    public static boolean withdrawkOK(int amount) {
        if (saldo >= amount) return true;
        else return false;
    }
}
