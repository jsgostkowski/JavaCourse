package example.three.uml;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("123",100.0);
        SavingAccount savingAccount = new SavingAccount("2",100);
        System.out.println(checkingAccount);
        checkingAccount.withdrwal(50.0);
        System.out.println(checkingAccount);
        System.out.println(savingAccount);
        savingAccount.deposit(10);
        System.out.println(savingAccount);

    }
}
