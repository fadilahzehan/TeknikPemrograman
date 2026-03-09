package Teori.Week_4;
import java.util.List;
import java.util.Map;

public class ImmutableDemo {
    public static void main(String[] args) {
        // Membuat List konstan
        List<String> statusPesanan = List.of("DIPROSES", "DIMASAK", "SELESAI");
        
        // Membuat Map konstan secara instan
        Map<String, Double> diskonMember = Map.of(
            "SILVER", 0.05,
            "GOLD", 0.10,
            "PLATINUM", 0.20
        );

        System.out.println("Status awal: " + statusPesanan.get(0));
        
        // statusPesanan.add("BATAL"); // Ini akan menyebabkan UnsupportedOperationException!
    }
}