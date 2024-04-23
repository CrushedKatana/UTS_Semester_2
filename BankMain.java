import java.util.Scanner;

public class BankMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        
            while (true) {
                System.out.println("=========================================");
                System.out.println("Banking Menu:");
                System.out.println("=========================================");
                System.out.println("1. Add Account");
                System.out.println("2. Display All Accounts");
                System.out.println("3. Sort Accounts By Balance");
                System.out.println("4. Display Accounts with Zero Balance");
                System.out.println("5. Search Account By Name");
                System.out.println("6. Withdraw Money");
                System.out.println("7. Deposit Money");
                System.out.println("0. Exit");
                System.out.println("=========================================");

            
            System.out.println("Enter choice:");
            int chosse = sc.nextInt();
            sc.nextLine();

            switch (chosse) {
                case 1:
                    bank.addAccount();
                    break;
                case 2:
                    bank.displayAccounts();
                    break;
                case 3:
                    bank.sortAccountsByBalance();
                    System.out.println("Accounts sorted by balance in descending order.");
                    break;
                case 4:
                    bank.displayZeroBalanceAccounts();
                    break;
                case 5:
                    System.out.println("Enter name keyword:");
                    String name = sc.nextLine();
                    bank.searchAccountsByName(name);
                    break;
                case 6:
                    System.out.println("Enter account number:");
                    String accNumber = sc.nextLine();
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    bank.withdraw(accNumber, withdrawAmount);
                    break;
                case 7:
                    System.out.println("Enter account number:");
                    String accNum = sc.nextLine();
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(accNum, depositAmount);
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}