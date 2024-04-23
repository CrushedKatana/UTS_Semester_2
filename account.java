public class account{
    int accountNumber;
    String name, motherName, phone, email;
    double balance;


public account(int accountNumber, String name, String motherName, String phone,  String email, double balance){
    accountNumber = accountNumber;
    name = name;
    motherName = motherName;
    phone = phone;
    email = email;
    balance = balance;
}

public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" +balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "AccountNumber: " + accountNumber + ", Name: " + name + ", Mother's Name: " + motherName +
                ", Phone: " + phone + ", Email: " + email + ", Balance: $" + balance;
    }

}