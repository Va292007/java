import java.util.Scanner;

class Bank {

    int total;

    // Constructor to initialize the total balance
    Bank(int initialBalance) {
        total = initialBalance;
    }

    // Method to deposit money into the account
    int deposit(int dep) {
        total += dep;
        return total;
    }

    // Method to withdraw money from the account
    int withdraw(int w) {
        if (w <= total) {
            total -= w;
            return total;
        } else {
            System.out.println("Insufficient balance!");
            return total;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Taking current amount as input from the user
        System.out.println("Enter the current amount:");
        int current = scan.nextInt();

        // Creating an object of the Bank class with the initial balance
        Bank bank1 = new Bank(current);

        // Performing deposit
        System.out.println("Total amount in the account after depositing 500: " + bank1.deposit(500));

        // Performing withdrawal
        System.out.println("Total amount in the account after withdrawing 500: " + bank1.withdraw(500));
    }
}
