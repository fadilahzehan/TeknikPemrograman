/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
    private double radius;
    private String color;

    // Constructors
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // New constructor with radius and color
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}