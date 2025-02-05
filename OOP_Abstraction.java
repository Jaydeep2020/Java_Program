// Abstract class representing an ATM
abstract class ATM {
    // Abstract methods (what an ATM should do)
    abstract void withdraw(double amount);
    abstract void checkBalance();
    abstract void deposit(double amount);
}

// Concrete class implementing the ATM functionality
class BankATM extends ATM {
    private double balance = 5000; // Hidden detail

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Interact with the ATM (abstraction in action)
        ATM atm = new BankATM();

        atm.checkBalance();       // User sees: "Your balance is: 5000"
        atm.withdraw(1000);       // User sees: "Withdrawal successful! Remaining balance: 4000"
        atm.deposit(2000);        // User sees: "Deposit successful! New balance: 6000"
        atm.checkBalance();       // User sees: "Your balance is: 6000"
    }
}
