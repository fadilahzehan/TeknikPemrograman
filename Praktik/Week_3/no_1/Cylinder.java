public class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        super();        // panggil constructor Circle()
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();        // panggil constructor Circle()
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);  // panggil constructor Circle(radius)
        this.height = height;
    }

    // Getter
    public double getHeight() {
        return height;
    }

    // Override getArea() untuk menghitung luas permukaan tabung
    @Override
    public double getArea() {
        // luas permukaan = 2 * luas alas + luas selimut
        // luas alas = super.getArea() = π * r^2
        // luas selimut = 2 * π * r * height
        return 2 * super.getArea() + 2 * Math.PI * getRadius() * height;
    }

    // Perbaiki getVolume() agar menggunakan luas alas dari superclass
    public double getVolume() {
        return super.getArea() * height;   // volume = luas alas * tinggi
    }

    // Override toString()
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}