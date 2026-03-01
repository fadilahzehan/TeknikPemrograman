public class TestShape {
    public static void main(String[] args) {
        // Uji Shape
        System.out.println("=== Shape ===");
        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape("blue", false);
        System.out.println(s2);
        s1.setColor("yellow");
        s1.setFilled(false);
        System.out.println("setelah modifikasi: " + s1);
        System.out.println("warna: " + s1.getColor() + ", filled: " + s1.isFilled());
        System.out.println();

        // Uji Circle
        System.out.println("=== Circle ===");
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(2.5);
        System.out.println(c2);
        Circle c3 = new Circle(3.0, "red", true);
        System.out.println(c3);
        System.out.printf("Luas: %.2f, Keliling: %.2f%n", c3.getArea(), c3.getPerimeter());
        c3.setRadius(4.0);
        c3.setColor("purple");
        System.out.println("setelah diubah: " + c3);
        System.out.println();

        // Uji Rectangle
        System.out.println("=== Rectangle ===");
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(2.0, 3.0);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(4.0, 5.0, "cyan", true);
        System.out.println(r3);
        System.out.printf("Luas: %.2f, Keliling: %.2f%n", r3.getArea(), r3.getPerimeter());
        r3.setWidth(6.0);
        r3.setLength(7.0);
        System.out.println("setelah diubah: " + r3);
        System.out.println();

        // Uji Square
        System.out.println("=== Square ===");
        Square sq1 = new Square();
        System.out.println(sq1);
        Square sq2 = new Square(3.5);
        System.out.println(sq2);
        Square sq3 = new Square(5.0, "magenta", false);
        System.out.println(sq3);
        System.out.printf("Luas: %.2f, Keliling: %.2f%n", sq3.getArea(), sq3.getPerimeter());
        sq3.setSide(7.0);
        System.out.println("setelah setSide(7.0): " + sq3);
        sq3.setWidth(8.0);
        System.out.println("setelah setWidth(8.0): " + sq3);
        sq3.setLength(10.0);
        System.out.println("setelah setLength(10.0): " + sq3);
    }
}