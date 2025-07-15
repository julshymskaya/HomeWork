package HomeWork8;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("The tiger roars...");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("The tiger likes to eat meat!");
        } else {
            System.out.println("The tiger is unhappy...");
        }
    }

}
