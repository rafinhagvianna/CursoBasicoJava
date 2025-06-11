import java.util.Random;

public class BankAccount {
    private final String accountNumber;
    private double balance;


    public BankAccount(double initialDeposit) {
        if (initialDeposit < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo!");
        }
        this.balance = initialDeposit;
        this.accountNumber = generateAccountNumber();
    }

    private String generateAccountNumber() {
        Random random = new Random();
        return "BA-" + (100000 + random.nextInt(900000)); // Número exclusivo de 6 dígitos
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo!");
        }
        balance += amount;
        System.out.println("Depósito de R$" + amount + " realizado. Saldo atual: R$" + balance);
    }

    public boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo!");
        }
        if (!hasSufficientBalance(amount)) {
            throw new IllegalArgumentException("Saldo insuficiente para saque!");
        }
        balance -= amount;
        System.out.println("Saque de R$" + amount + " realizado. Saldo atual: R$" + balance);
    }
}
