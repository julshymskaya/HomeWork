package HomeWork6.ATM;

public class ATM {
    int countOf20;
    int countOf50;
    int countOf100;

    ATM(int countOf20, int countOf50, int countOf100) {
        this.countOf20 = countOf20;
        this.countOf50 = countOf50;
        this.countOf100 = countOf100;
    }

    void addMoney(int countOf20, int countOf50, int countOf100) {
        this.countOf20 += countOf20;
        this.countOf50 += countOf50;
        this.countOf100 += countOf100;
        System.out.println("Your money was successfully deposited into the ATM.");
    }

    boolean withdrawMoney(int amount) {
        int num20 = 0;
        int num50 = 0;
        int num100 = 0;
        int sum = amount;

        if (amount <= 0) {
            System.out.println("Invalid operation.");
            return false;
        }

        while (amount >= 100 && countOf100 > 0) {
            amount -= 100;
            countOf100--;
            num100++;
        }

        while (amount >= 50 && countOf50 > 0) {
            amount -= 50;
            countOf50--;
            num50++;
        }

        while (amount >= 20 && countOf20 > 0) {
            amount -= 20;
            countOf20--;
            num20++;
        }

        if (amount > 0) {
            System.out.println("There are not enough funds to withdraw.");
            countOf100 += num100;
            countOf50 += num50;
            countOf20 += num20;
            return false;
        }

        System.out.println("Banknotes were withdrawn! Your sum: " + sum);
        System.out.println("Banknotes with value 20: " + num20 +
                "\nBanknotes with value 50: " + num50 + "\nBanknotes with value 100: " + num100);

        return true;
    }

    void displayInfo() {
        System.out.println("Current ATM status: ");
        System.out.println("Banknotes with value 20: " + countOf20);
        System.out.println("Banknotes with value 50: " + countOf50);
        System.out.println("Banknotes with value 100: " + countOf100);
    }
}
