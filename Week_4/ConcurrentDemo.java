package Week_4;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentDemo {
    public static void main(String[] args) {
        // Aman digunakan oleh banyak thread sekaligus (misal kasir 1 dan kasir 2)
        Map<String, Integer> stokBahan = new ConcurrentHashMap<>();
        stokBahan.put("Daging Ayam", 50);

        // Operasi atomik: kurangi stok jika ada
        stokBahan.computeIfPresent("Daging Ayam", (k, v) -> v - 1);
        
        System.out.println("Sisa stok ayam: " + stokBahan.get("Daging Ayam"));
    }
}