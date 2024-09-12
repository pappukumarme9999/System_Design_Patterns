package Proxy_Pattern;

// Client Code

public class Client {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        BankAccountProxy accountProxy = new BankAccountProxy(account);

        accountProxy.withdraw(200);  // Should fail, not authenticated
        accountProxy.authenticate(); // Now authenticated
        accountProxy.withdraw(200);  // Successful transaction
        System.out.println("Remaining Balance: " + accountProxy.getBalance());
    }
}
