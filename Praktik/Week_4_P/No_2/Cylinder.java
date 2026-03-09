package No_2;

public class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area() {
        // Luas permukaan silinder: 2πr² + 2πrh = 2πr(r + h)
        return 2 * Math.PI * radius * (radius + height);
    }

    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}