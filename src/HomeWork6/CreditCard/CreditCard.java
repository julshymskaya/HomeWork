package HomeWork6.CreditCard;

public class CreditCard {
    String accountNumber;
    int currentBalance;

    CreditCard(String accountNumber, int currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    void addMoney(int amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("The operation was successfully completed!");
        } else {
            System.out.println("Invalid operation.");
        }
    }

    void withdrawMoney(int amount) {
        if (amount > currentBalance) {
            System.out.println("No enough money.");
        } else {
            currentBalance -= amount;
            System.out.println("The operation was successfully completed!");
        }
    }

    void displayInfo() {
        System.out.println("Account number: " + accountNumber + ", current balance: " + currentBalance);
    }
}
