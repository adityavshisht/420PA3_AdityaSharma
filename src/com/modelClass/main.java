package com.modelClass;

//public class Main {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//        account.AccountNumber = 98765;
//        account.balance = 100000.00;
//
//        account.deposit(500.00);
//        System.out.println("After deposit, balance is: " + account.getBalance());
//
//        boolean success = account.withdraw(200.00)
//        if (success) {
//            System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
//        } else {
//            System.out.println("Withdrawal failed. Not enough balance.");
//        }
//
//        System.out.println("Account holder: " + account.getAccountNumber());
//    }
//}

public class Main{
    public static void main(String[] args){
        Manager manager = new Manager("Elon Musk", 950000, 15);
        Intern intern = new Intern("Bob Smith", 15000, "State University");

        System.out.println("Manager Details:");
        System.out.println(manager.getDetails());

        System.out.println("Intern Details:");
        System.out.println(intern.getDetails());
    }
}
