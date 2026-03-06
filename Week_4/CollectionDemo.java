package Week_4;
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // List: Daftar pesanan meja (boleh pesan menu yang sama berkali-kali)
        List<String> pesananMeja1 = new ArrayList<>();
        pesananMeja1.add("Nasi Goreng");
        pesananMeja1.add("Es Teh");
        pesananMeja1.add("Es Teh"); // Duplikat diizinkan

        // Set: Kategori menu di restoran (unik)
        Set<String> kategoriMenu = new HashSet<>();
        kategoriMenu.add("Makanan Utama");
        kategoriMenu.add("Minuman");
        kategoriMenu.add("Minuman"); // Tidak akan ditambahkan lagi

        // Map: Menyimpan harga menu (Key: Nama Menu, Value: Harga)
        Map<String, Double> hargaMenu = new HashMap<>();
        hargaMenu.put("Nasi Goreng", 25000.0);
        hargaMenu.put("Es Teh", 5000.0);

        System.out.println("Pesanan: " + pesananMeja1);
        System.out.println("Kategori: " + kategoriMenu);
        System.out.println("Harga Nasi Goreng: Rp" + hargaMenu.get("Nasi Goreng"));
    }
}