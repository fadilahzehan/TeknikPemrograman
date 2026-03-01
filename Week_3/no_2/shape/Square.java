public class Square extends Rectangle {

    // No-arg constructor
    public Square() {
        super();        // width = length = 1.0
    }

    // Constructor dengan side saja
    public Square(double side) {
        super(side, side);   // panggil Rectangle(double, double)
    }

    // Constructor dengan side, color, filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter dan Setter untuk side
    public double getSide() {
        return getWidth();   // atau getLength()
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth dan setLength agar tetap persegi
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    // Override toString
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}