package Practical_3;

import java.util.Scanner;

class BankAccount {// Encapsulation
    private double balance;

    
    public BankAccount(double initialBalance) { // Constructor to initialize account balance
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {// Inheritance
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance); // Calling the constructor of the parent class
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: Rs." + interest);
    }
}

public class BankingSystem { // Driver class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount(1000, 5);

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Add Interest");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: Rs." + account.getBalance());
                    break;
                case 4:
                    account.addInterest();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

/* Sample Output:

--- Banking System ---
1. Deposit
2. Withdraw
3. Check Balance
4. Add Interest
5. Exit
Choose an option: 1
Enter deposit amount: 500
Deposited: Rs.500.0

--- Banking System ---
1. Deposit
2. Withdraw
3. Check Balance
4. Add Interest
5. Exit
Choose an option: 3
Current Balance: Rs.1500.0

--- Banking System ---
1. Deposit
2. Withdraw
3. Check Balance
4. Add Interest
5. Exit
Choose an option: 2
Enter withdrawal amount: 200
Withdrawn: Rs.200.0

--- Banking System ---
1. Deposit
2. Withdraw
3. Check Balance
4. Add Interest
5. Exit
Choose an option: 4
Deposited: Rs.65.0
Interest added: Rs.65.0

--- Banking System ---
1. Deposit
2. Withdraw
3. Check Balance
4. Add Interest
5. Exit
Choose an option: 5
Exiting...
*/