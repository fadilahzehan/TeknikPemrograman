public class TestCylinder {
    public static void main(String[] args) {
        // Cylinder dengan default radius, height, color
        Cylinder c1 = new Cylinder();
        System.out.println("c1: " + c1);
        System.out.println(" radius=" + c1.getRadius()
            + " height=" + c1.getHeight()
            + " color=" + c1.getColor()
            + " base area=" + c1.getArea()
            + " volume=" + c1.getVolume());

        // Cylinder dengan height=10.0, radius dan color default
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("c2: " + c2);
        System.out.println(" radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " color=" + c2.getColor()
            + " base area=" + c2.getArea()
            + " volume=" + c2.getVolume());

        // Cylinder dengan radius=2.0, height=10.0, color default
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("c3: " + c3);
        System.out.println(" radius=" + c3.getRadius()
            + " height=" + c3.getHeight()
            + " color=" + c3.getColor()
            + " base area=" + c3.getArea()
            + " volume=" + c3.getVolume());

        // Mengubah warna c3 melalui setter yang diwarisi
        c3.setColor("blue");
        System.out.println("Setelah warna diubah: " + c3);
    }
}