package Praktik.Week_7;

import java.util.Scanner;

class TotalSum {
    private long total = 0; 

    public synchronized void addPartialSum(long partialSum) {
        total += partialSum;
    }

    public long getTotal() {
        return total;
    }
}

public class PenjumlahanParalel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Thread: ");
        int jumlahThread = scanner.nextInt();
        
        System.out.print("Masukkan Angka Akhir: ");
        long angkaAkhir = scanner.nextLong();

        TotalSum totalSum = new TotalSum();
        Thread[] threads = new Thread[jumlahThread];

        long rangeSize = angkaAkhir / jumlahThread;

        System.out.println("\n--- STATUS PENGERJAAN ---");

        for (int i = 0; i < jumlahThread; i++) {
            final int threadId = i + 1; 
            final long start = (i * rangeSize) + 1;
            final long end = (i == jumlahThread - 1) ? angkaAkhir : (i + 1) * rangeSize;

            threads[i] = new Thread(() -> {
                long partialSum = 0;
                
                System.out.println("Thread-" + threadId + " mengerjakan penjumlahan dari " + start + " sampai " + end);

                for (long j = start; j <= end; j++) {
                    partialSum += j;
                }

                System.out.println("Thread-" + threadId + " Hasil Parsial: " + partialSum);
                totalSum.addPartialSum(partialSum);
            });

            threads[i].start();
        }

        for (int i = 0; i < jumlahThread; i++) {
            try {
                threads[i].join(); 
            } catch (InterruptedException e) {
                System.out.println("Terjadi kesalahan pada thread.");
            }
        }

        System.out.println("\n--- HASIL AKHIR ---");
        System.out.println("Total Penjumlahan 1 sampai " + angkaAkhir + " adalah: " + totalSum.getTotal());
        
        scanner.close();
    }
}