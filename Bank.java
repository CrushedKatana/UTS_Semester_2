import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bank {
    List<Account> listAcc = new ArrayList<>();

    public void addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        String accountNumber = sc.nextLine();
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Mother's Name:");
        String motherName = sc.nextLine();
        System.out.println("Enter Phone Number:");
        String phone = sc.nextLine();
        System.out.println("Enter Email:");
        String email = sc.nextLine();
        System.out.println("Enter Initial Balance:");
        double balance = Double.parseDouble(sc.nextLine());

        listAcc.add(new Account(0, name, motherName, phone, email, balance));
        System.out.println("Account successfully added!");
    }

    public void displayAccounts() {
        for (Account acc : listAcc) {
            System.out.println(acc);
        }
    }
    
    public void setAccountBalance(String accountNumber, double newBalance) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.setBalance(newBalance);
            System.out.println("Balance successfully updated.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayZeroBalanceAccounts() {
        for (Account acc : listAcc) {
            if (acc.getBalance() == 0) {
                System.out.println(acc);
            }
        }
    }

    public void searchAccountsByName(String name) {
        for (Account acc : listAcc) {
            if (acc.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(acc);
            }
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or account not found.");
        }
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposit successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Deposit failed. Account not found.");
        }
    }

    private Account findAccount(String accountNumber) {
        for (Account account : listAcc) {
            if (Integer.toString(account.getAccountNumber()).equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    
    public void sortAccountsByBalance() {
        listAcc.sort((a1, a2) -> Double.compare(a2.getBalance(), a1.getBalance()));
    }
}
    
