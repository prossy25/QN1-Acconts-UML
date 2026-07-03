public class SavingsAccount extends Account {
    private double rate; // interest rate as a percentage, e.g. 5 = 5%

    public SavingsAccount(String accountNumber, double balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance - amount < 0) {
            return false; // refuse - would take the balance below zero
        }
        balance -= amount;
        return true;
    }

    public void addInterest() {
        balance += balance * (rate / 100.0);
    }
}
