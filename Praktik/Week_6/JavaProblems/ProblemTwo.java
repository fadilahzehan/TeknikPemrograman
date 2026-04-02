package Praktik.Week_6.JavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemTwo {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(101, "Joe"),
                new Student(103, "Zulkifli"),
                new Student(102, "Riza"),
                new Student(104, "Alice"),
                new Student(105, "Joshua")
        );

        // [1] stream() - Membuka stream
        List<Student> ans = students.stream() 
                // [2] sorted - Melakukan pengurutan
                .sorted((s1, s2) -> {       

                    // Logika: Jika nama sama, bandingkan ID
                    if (s1.getName().equalsIgnoreCase(s2.getName())) {
                        // [3] Integer - Class wrapper untuk perbandingan ID yang aman
                        return Integer.compare(s1.getId(), s2.getId());
                    } 
                    // Jika nama berbeda, bandingkan Nama secara case-insensitive
                    else {
                        // [4] compareToIgnoreCase - Membandingkan string tanpa peduli huruf besar/kecil
                        return s1.getName().compareToIgnoreCase(s2.getName());
                    }
                })
                // [5] collect - Operasi terminal untuk mengumpulkan hasil ke List
                .collect(Collectors.toList()); 

        for (Student student : ans) {
            System.out.println(student);
        }
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}