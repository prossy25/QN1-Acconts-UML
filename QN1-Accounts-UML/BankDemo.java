public class BankDemo {
    public static void main(String[] args) {
        Customer john = new Customer("C001", "John Mukasa");

        SavingsAccount savings = new SavingsAccount("SA-001", 100000, 5);
        CurrentAccount current = new CurrentAccount("CA-001", 50000, 20000);

        john.addAccount(savings);
        john.addAccount(current);

        savings.addInterest();          // 5% of 100,000 added
        current.withdraw(60000);        // dips into overdraft, within the 20,000 limit

        System.out.println(savings.generateStatement());
        System.out.println(current.generateStatement());
        System.out.printf("%s's total worth: UGX %.2f%n", john.getName(), john.totalWorth());
    }
}
