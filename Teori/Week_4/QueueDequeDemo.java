package Teori.Week_4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueDequeDemo {
    public static void main(String[] args) {
        // Queue untuk antrean masak di dapur
        Queue<String> antreanDapur = new LinkedList<>();
        antreanDapur.offer("Meja 1: Nasi Goreng");
        antreanDapur.offer("Meja 2: Mie Goreng");
        
        System.out.println("Dimasak pertama: " + antreanDapur.poll()); // Mengambil dan menghapus

        // Deque untuk riwayat tindakan (bisa akses ujung dan pangkal)
        Deque<String> riwayatPesanan = new LinkedList<>();
        riwayatPesanan.addLast("Tambah Es Teh");
        riwayatPesanan.addFirst("PRIORITAS: Air Putih"); // Masuk paling depan
        
        System.out.println("Aksi terakhir (Undo): " + riwayatPesanan.removeLast());
    }
}