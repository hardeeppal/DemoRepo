package Opps.Encapsulation;

public class BankAccount {

    // It is process of wrapping data and methods in a single unit is
    // called unit or class
    // More oriented way and a more secure way to make
    // programs more secure
    // Prevents unauthorized  methods from accessing certain variable
    // Encapsulation in java can be known as data hiding
    // you cannot directly access the private properties of a class unless you are writing a code inside the class itself
    // It helps developers better group and organize data
    // Can easily chnage other parts ogf programs

    private int accountNumber;
    private double accountBalance = 3000;

    public BankAccount(int accountNumber, int accountBalance) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        System.out.println("You created account " + this.accountNumber + ".");
    }

    public void depositMoney(int addMoney) {
        if (addMoney <= 0) {
            System.out.println("You can'nt deposit zero or less than zero amount");
        } else {
            accountNumber = (int) (accountBalance + addMoney);
            System.out.println("$" + addMoney + " deposited into your account " + accountBalance);
        }
    }

    public void withdrawMoney(double removeMoney) {
        if (removeMoney > accountBalance) {
            System.out.println("You can'nt withdraw money greater than your account balance");
        } else {
            accountBalance = accountBalance - removeMoney;
            System.out.println(this.accountBalance);
        }
    }
}

