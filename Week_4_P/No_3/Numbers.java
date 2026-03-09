package No_3;

//********************************************************************
// Numbers.java
//
// Demonstrates insertionSort on an array of integers (descending order).
//********************************************************************

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList;   // menggunakan Integer, bukan int
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();

        intList = new Integer[size];

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();   // autoboxing

        // Memanggil insertion sort descending
        Sorting.insertionSortDescending(intList);

        System.out.println("\nYour numbers in sorted order (descending):");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();
    }
}