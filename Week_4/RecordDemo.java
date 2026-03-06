package Week_4;
// Mendeklarasikan Record
record MenuItem(String nama, double harga, String kategori) {}

public class RecordDemo {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Ayam Bakar", 30000.0, "Makanan");
        
        // Akses data langsung menggunakan nama propertinya
        System.out.println("Menu: " + item1.nama() + " - Rp" + item1.harga());
        System.out.println(item1.toString()); // Otomatis rapi
    }
}