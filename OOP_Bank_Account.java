class BankAccount {
    private double balance;

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter with controlled access
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(500);  // Deposited: 500
        account.withdraw(200); // Withdrawn: 200
        account.withdraw(1000); // Invalid withdrawal amount!

        System.out.println("Balance: " + account.getBalance()); // Balance: 300
    }
}
