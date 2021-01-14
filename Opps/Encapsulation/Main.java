package Opps.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount(1212,1321321);
        myBankAccount.depositMoney(2323);
        myBankAccount.depositMoney(-21);
        myBankAccount.withdrawMoney(1221);
        myBankAccount.withdrawMoney(12);
    }
}
