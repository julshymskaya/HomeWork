package HomeWork6.ATM;

public class Main {
    public static void main(String[] args) {
        ATM cashMachine = new ATM(14, 8, 10);

        cashMachine.displayInfo();

        cashMachine.withdrawMoney(130);
        cashMachine.withdrawMoney(250);

        cashMachine.displayInfo();

        cashMachine.addMoney(12, 4, 2);

        cashMachine.displayInfo();
    }
}
