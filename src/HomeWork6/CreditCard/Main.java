package HomeWork6.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("4366 4611 9273 6431", 2500);
        CreditCard creditCard2 = new CreditCard("4857 2314 8751 2391", 700);
        CreditCard creditCard3 = new CreditCard("4995 2084 5429 1278", 1300);

        creditCard1.addMoney(700);
        creditCard2.addMoney(300);
        creditCard3.withdrawMoney(250);

        System.out.println("Current card status: ");
        creditCard1.displayInfo();
        creditCard2.displayInfo();
        creditCard3.displayInfo();
    }
}
