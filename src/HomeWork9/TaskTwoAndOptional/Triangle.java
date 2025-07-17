package HomeWork9.TaskTwoAndOptional;

public class Triangle extends Figure implements Cloneable {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    @Override
    double calculateArea() {
        double semiPerimeter = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) *
                (semiPerimeter - sideThree));
    }

    @Override
    double calculatePerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", sideThree=" + sideThree +
                '}';
    }
}
