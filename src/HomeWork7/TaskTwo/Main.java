package HomeWork7.TaskTwo;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        System.out.println("The original color of the apple: " + apple.getColor());

        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "Green");

        System.out.println("The changed color of the apple: " + apple.getColor());
    }
}
