package HomeWork8;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("The rabbit is squeaking...");
    }

    @Override
    public void eat(String food) {
        if ("Grass".equals(food)) {
            System.out.println("The rabbit likes to eat grass!");
        } else {
            System.out.println("The rabbit is unhappy...");
        }
    }
}
