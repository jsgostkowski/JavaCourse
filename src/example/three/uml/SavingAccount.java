package example.three.uml;

public class SavingAccount extends Account{

    public SavingAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    public double deposit(double amount) {
        setBalance(getBalance() + amount);
        return getBalance();
    }

    @Override
    public double withdrwal(double amount) {
        if (getBalance() - amount <= 0.0)
            throw new IllegalArgumentException("BLAD");
        setBalance(getBalance() - amount);
        return getBalance();
    }
}
