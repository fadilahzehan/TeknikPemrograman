package Teori.Week_4;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Log aktivitas lama yang membutuhkan sinkronisasi bawaan
        Vector<String> logSistem = new Vector<>();
        
        logSistem.add("Sistem Restoran Dinyalakan");
        logSistem.add("Database terkoneksi");
        
        System.out.println("Log pertama: " + logSistem.firstElement());
    }
}