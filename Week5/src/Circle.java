public class Circle {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    double calcArea() {
        return this.radius * this.radius * Math.PI;
    }

    double calcCircumference() {
        return this.radius * 2 * Math.PI;
    }
}
