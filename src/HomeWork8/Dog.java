package HomeWork8;

public class Dog extends Animal {

    private Dog() {

    }

    public static Dog createDog() {
        return new Dog();
    }

    @Override
    public void voice() {
        System.out.println("The dog is barking...");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("The dog likes to eat meat!");
        } else {
            System.out.println("The dog is unhappy...");
        }
    }
}
