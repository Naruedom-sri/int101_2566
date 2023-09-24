package int101.homework01.work04;

public class BankAccount {

    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
       
    }

    public Person getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public double deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
        }
        return this.balance;
    }

    public double withdraw(double amount) {
        if (amount >= 0 && amount <= this.balance) {
            this.balance -= amount;
        }
        return this.balance;
    }

    public void transfer(double amount, BankAccount account) {
        if(amount <= this.balance && amount >= 0){
            withdraw(amount);
            account.deposit(amount);
        }
       
    }

    @Override
    public String toString() {
        return "BankAccount (" + this.owner + " , " + "Number : " + this.number + ")";
    }
}
