package Praktik.Week_6.JavaProblems;

import java.util.Arrays;

public class ProblemThree {

    public static void main(String[] args) {
        int arr[] = {12, 4, 3, 1, 9, 657};
        int n = 3; // Mencari elemen terbesar ke-3

        int ans = Arrays.stream(arr)             // [1] Arrays - Mengubah array primitif menjadi IntStream
                .boxed()                         // [2] boxed - Mengubah int primitif ke objek Integer
                .sorted((a, b) -> Integer.compare(b, a)) // Urutkan descending (besar ke kecil)
                .skip(n - 1)                     // [3] skip - Melompati n-1 elemen pertama (melompati 2 elemen)
                .findFirst()                     // [4] findFirst - Mengambil elemen pertama setelah skip
                .orElse(0);                      // [5] orElse - Memberikan nilai default 0 jika stream kosong

        System.out.println("The 3rd largest element is: " + ans);
    }
}