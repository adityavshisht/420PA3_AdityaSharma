package com.modelClass;

public class BankAccount {
    public int AccountNumber;
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

    public int getAccountNumber()
    {
        return AccountNumber;
    }
}
