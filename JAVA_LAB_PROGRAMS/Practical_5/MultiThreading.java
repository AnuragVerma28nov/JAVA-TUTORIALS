package Practical_5;

import java.util.Scanner;

class BankAccount {
    private int balance = 5000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited ₹" + amount + " | Balance: ₹" + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew ₹" + amount + " | Balance: ₹" + balance);
        } else {
            System.out.println(
                    Thread.currentThread().getName() + " attempted to withdraw ₹" + amount + " | Insufficient funds!");
        }
    }
}

class TransactionThread extends Thread {// Thread Class for User Transactions

    private BankAccount account;
    private boolean isDeposit;
    private int amount;

    public TransactionThread(BankAccount account, boolean isDeposit, int amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.println("Enter number of transactions:");
        int transactionCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < transactionCount; i++) {
            System.out.println("Enter transaction type (deposit/withdraw):");
            String type = scanner.nextLine().trim();
            System.out.println("Enter amount:");
            int amount = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            TransactionThread transaction;
            if (type.equalsIgnoreCase("deposit")) {
                transaction = new TransactionThread(account, true, amount);
            } else if (type.equalsIgnoreCase("withdraw")) {
                transaction = new TransactionThread(account, false, amount);
            } else {
                System.out.println("Invalid transaction type! Skipping...");
                continue;
            }

            transaction.setName("User" + (i + 1));
            transaction.start();
        }

        scanner.close();
    }
}
