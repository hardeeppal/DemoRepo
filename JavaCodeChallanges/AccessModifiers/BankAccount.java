package JavaCodeChallanges.AccessModifiers;

public class BankAccount {

    // public can be access anywhere even outside package;
    // private can be access only inside the class you can access private data members by using public function
    // protected inside the class or outside but by using extends i.e by using inheritance concept
    // default can be used inside class and inside the inside the package too

    public String owner;
    private double balance;
    protected int age;

    public double getBalance() {
        return 0.00;
    }

    public double depositMoney() {
        return 0.00;
    }

    public String getBalanceEnquiry() {
        return "Whole balance summary";
    }

}
