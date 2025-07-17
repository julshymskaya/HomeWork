package HomeWork9.TaskTwoAndOptional;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(6);
        figures[1] = new Triangle(4, 6, 9);
        figures[2] = new Rectangle(3, 7);
        figures[3] = new Circle(3);
        figures[4] = new Triangle(1, 5, 3);

        double sumOfThePerimeter = 0;
        for (Figure figure : figures) {
            sumOfThePerimeter += figure.calculatePerimeter();
        }

        System.out.println("The sum of the perimeter of all figures: " + sumOfThePerimeter);

        Triangle triangleOriginal = new Triangle(6, 2, 8);
        Triangle triangleClone = (Triangle) triangleOriginal.clone();

        System.out.println("Original object: " + triangleOriginal);
        System.out.println("Cloneable object: " + triangleClone);

        triangleOriginal.setSideOne(11);
        System.out.println("Original object: " + triangleOriginal);
        System.out.println("Cloneable object: " + triangleClone);
    }
}
