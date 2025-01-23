public class BankAccount {
    public String accountHolderName;
    public double balance;

    public void deposit(double amount)
    {
        balance += amount;
    }

    public boolean withdraw(double amount)
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public String getAccountHolderName()
    {
        return accountHolderName;
    }
}
