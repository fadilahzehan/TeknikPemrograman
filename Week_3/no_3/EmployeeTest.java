package Week_3.no_3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // UJI COBA METODE COMPARE
        // Membandingkan Antonio (2.0M) dengan Maria (2.5M)
        System.out.println("Membandingkan Antonio vs Maria:");
        int result = staff[0].compare(staff[1]);
        
        if (result < 0) System.out.println("Gaji Antonio lebih kecil dari Maria.");
        else if (result > 0) System.out.println("Gaji Antonio lebih besar dari Maria.");
        else System.out.println("Gaji mereka sama.");

        // Demonstrasi Sorting
        System.out.println("\nSebelum sorting:");
        for (Employee e : staff) e.print();

        Sortable.shell_sort(staff);

        System.out.println("\nSetelah sorting (berdasarkan gaji):");
        for (Employee e : staff) e.print();
    }
}