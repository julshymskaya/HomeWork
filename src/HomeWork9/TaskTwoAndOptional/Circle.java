package HomeWork9.TaskTwoAndOptional;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
}
