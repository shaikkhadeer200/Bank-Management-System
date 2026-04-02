import java.util.*;

class BankAccount {
    int accNo;
    String name;
    double balance;

    BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(" Amount Deposited!");
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(" Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println(" Amount Withdrawn!");
        }
    }

    void display() {
        System.out.println("Account No: " + accNo + ", Name: " + name + ", Balance: " + balance);
    }
}

public class BankManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static BankAccount acc;

    public static void createAccount() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        acc = new BankAccount(accNo, name, balance);
        System.out.println("🏦 Account Created Successfully!");
    }

    public static void depositMoney() {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        acc.deposit(amt);
    }

    public static void withdrawMoney() {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        acc.withdraw(amt);
    }

    public static void checkBalance() {
        acc.display();
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n Bank Management System ");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: createAccount(); break;
                case 2: depositMoney(); break;
                case 3: withdrawMoney(); break;
                case 4: checkBalance(); break;
                case 5: System.out.println(" Exiting..."); break;
                default: System.out.println(" Invalid choice!");
            }

        } while (choice != 5);
    }
}