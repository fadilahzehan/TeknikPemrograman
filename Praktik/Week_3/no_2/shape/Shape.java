package Praktik.Week_3.no_2.shape;

public class Shape {
    private String color;
    private boolean filled;

    // No-arg constructor: warna default "green", filled true
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor dengan parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter dan Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter untuk boolean (konvensi isXXX)
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString
    @Override
    public String toString() {
        String filledStatus = filled ? "filled" : "Not filled";
        return "A Shape with color of " + color + " and " + filledStatus;
    }
}