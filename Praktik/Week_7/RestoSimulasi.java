package Praktik.Week_7;

class Resto {
    private int chickenStock = 100;

    // SOLUSI: Menambahkan keyword 'synchronized' pada method.
    // Ini mengubah method menjadi "Thread-Safe".
    public synchronized void serveCustomer(String cashierName) {
        
        // Saat sebuah thread (misal Kasir-A) memanggil method ini, ia akan 
        // "mengunci" objek Resto. Kasir-B dan Kasir-C yang mencoba memanggil 
        // method ini harus mengantre (Wait/Blocked) di luar method sampai Kasir-A 
        // selesai dan melepaskan kuncinya.
        
        if (chickenStock > 0) {
            // Karena Kasir-B dan C sedang tertahan di luar, Kasir-A bisa tidur
            // (sleep) dengan tenang tanpa takut datanya dimanipulasi thread lain.
            try { Thread.sleep(10); } catch (InterruptedException e) {}
            
            // Operasi pengurangan ini sekarang dijamin aman (Atomic-like behavior) 
            // karena hanya dieksekusi oleh satu thread pada satu waktu.
            chickenStock--; 
            
            System.out.println(cashierName + " berhasil menjual 1 ayam. Sisa stok: " + chickenStock);
        } else {
            System.out.println(cashierName + " gagal: Stok Habis!");
        }
    }

    // Praktik yang baik: Method getter juga di-synchronize untuk mencegah 
    // thread lain membaca nilai stok yang sedang dalam proses modifikasi.
    public synchronized int getRemainingStock() {
        return chickenStock;
    }
}

public class RestoSimulasi {
    public static void main(String[] args) throws InterruptedException {
        // Objek tunggal (Shared Object) yang digunakan oleh semua thread
        Resto ayamJuicyLuicyGallagher = new Resto();

        Runnable task = () -> {
            // Setiap kasir mencoba menjual 40 ayam (Total 120 percobaan penjualan)
            for (int i = 0; i < 40; i++) {
                ayamJuicyLuicyGallagher.serveCustomer(Thread.currentThread().getName());
            }
        };

        Thread kasir1 = new Thread(task, "Kasir-A");
        Thread kasir2 = new Thread(task, "Kasir-B");
        Thread kasir3 = new Thread(task, "Kasir-C");

        kasir1.start();
        kasir2.start();
        kasir3.start();

        kasir1.join();
        kasir2.join();
        kasir3.join();

        // Hasil akhir sekarang dijamin valid (pasti 0, tidak akan pernah minus, 
        // dan urutan print sisa stok akan rapi berurutan dari 99 hingga 0).
        System.out.println("--- HASIL AKHIR STOK: " + ayamJuicyLuicyGallagher.getRemainingStock() + " ---");
    }
}