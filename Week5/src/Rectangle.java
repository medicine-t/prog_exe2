public class Rectangle {
    private double height;
    private double width;

    Rectangle(double l, double w) {
        this.height = l;
        this.width = w;
    }

    public double calcArea() {
        return this.height * this.width;
    }
}
