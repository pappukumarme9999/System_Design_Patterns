package Proxy_Pattern;

// Proxy

public class BankAccountProxy {
    private BankAccount bankAccount;
    private boolean authenticated;

    public BankAccountProxy(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.authenticated = false;
    }

    public void authenticate() {
        // Simulate authentication (In real-world, this would be more complex)
        this.authenticated = true;
        System.out.println("User authenticated.");
    }

    public void deposit(double amount) {
        if (authenticated) {
            bankAccount.deposit(amount);
        } else {
            System.out.println("Authentication required.");
        }
    }

    public void withdraw(double amount) {
        if (authenticated) {
            bankAccount.withdraw(amount);
        } else {
            System.out.println("Authentication required.");
        }
    }

    public double getBalance() {
        if (authenticated) {
            return bankAccount.getBalance();
        } else {
            System.out.println("Authentication required.");
            return 0;
        }
    }
}
