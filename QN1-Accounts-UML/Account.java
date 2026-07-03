public abstract class Account implements Statement {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // {abstract} in the diagram - each account type withdraws under different rules
    public abstract boolean withdraw(double amount);

    @Override
    public String generateStatement() {
        return "Account No: " + accountNumber + " | Balance: UGX " + balance;
    }
}
