import java.util.Scanner;

public class corrected {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Handle non-numeric menu input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid deposit amount!");
                    } else {
                        balance += deposit;
                        System.out.println("Amount deposited successfully.");
                    }
                    break;

                case 2: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid withdrawal amount!");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("Current balance: " + balance);
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using Banking System.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please select 1–4.");
            }
        }
    }
}
