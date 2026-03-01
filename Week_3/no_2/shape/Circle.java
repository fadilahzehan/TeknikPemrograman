
public class Circle extends Shape {
    private double radius;

    // No-arg constructor: radius 1.0, warna dan filled default
    public Circle() {
        super();        // warna = "green", filled = true
        this.radius = 1.0;
    }

    // Constructor dengan radius saja
    public Circle(double radius) {
        super();        // warna dan filled default
        this.radius = radius;
    }

    // Constructor dengan semua parameter
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter dan Setter untuk radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode luas dan keliling
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}