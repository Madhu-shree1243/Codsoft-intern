import java.util.Scanner;

public class TASK3 {
    private int balance;
    
    public TASK3(){
        // Initial balance could be retrieved from a database or input by user
        this.balance = 1000;
    }

    public void startATM() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid one.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void withdraw(Scanner scanner) {
        System.out.print("Enter money to be withdrawn: ");
        int amount = scanner.nextInt();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Please collect your money.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    private void deposit(Scanner scanner) {
        System.out.print("Enter money to be deposited: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("Your money has been successfully deposited.");
    }

    private void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        TASK3 atm = new TASK3();
        atm.startATM();
    }


}
