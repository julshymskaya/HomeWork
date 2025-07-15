package HomeWork8;

public class Main {
    public static void main(String[] args) {
        Dog dog = Dog.createDog();
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");

        Tiger tiger = new Tiger();
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");

        Rabbit rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("Meat");
        rabbit.eat("Grass");
    }
}
