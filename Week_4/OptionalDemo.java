package Week_4;
import java.util.Optional;

public class OptionalDemo {
    // Simulasi database menu
    static Optional<String> cariDeskripsiMenu(String namaMenu) {
        if (namaMenu.equals("Kopi Hitam")) {
            return Optional.of("Kopi robusta asli dengan gula aren.");
        }
        return Optional.empty(); // Mengembalikan kosong dengan aman
    }

    public static void main(String[] args) {
        Optional<String> deskripsi = cariDeskripsiMenu("Teh Manis");

        // Cara elegan menangani data yang mungkin null
        deskripsi.ifPresentOrElse(
            d -> System.out.println("Deskripsi: " + d),
            () -> System.out.println("Maaf, deskripsi menu tidak ditemukan.")
        );
    }
}