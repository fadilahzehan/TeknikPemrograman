package No_3;

//********************************************************************
// Salesperson.java
//
// Represents a sales person with first name, last name, and total sales.
// Implements Comparable to allow sorting by sales (descending) and name.
//********************************************************************

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    //-----------------------------------------------------------------
    // Constructor: Sets up the sales person with given data.
    //-----------------------------------------------------------------
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    //-----------------------------------------------------------------
    // Returns the sales person as a string.
    //-----------------------------------------------------------------
    public String toString() {
        return lastName + ", " + firstName + ":\t" + totalSales;
    }

    //-----------------------------------------------------------------
    // Returns true if the sales people have the same name.
    //-----------------------------------------------------------------
    public boolean equals(Object other) {
        Salesperson sp = (Salesperson) other;
        return lastName.equals(sp.getLastName()) &&
               firstName.equals(sp.getFirstName());
    }

    //-----------------------------------------------------------------
    // Compares this sales person with another.
    // Order: descending by total sales, then ascending by last name,
    // then ascending by first name.
    //-----------------------------------------------------------------
    public int compareTo(Object other) {
        Salesperson sp = (Salesperson) other;

        // Compare total sales (descending)
        if (this.totalSales > sp.totalSales) return -1;
        if (this.totalSales < sp.totalSales) return 1;

        // Sales are equal, compare last name (ascending)
        int lastNameComp = this.lastName.compareTo(sp.lastName);
        if (lastNameComp != 0) return lastNameComp;

        // Last names equal, compare first name (ascending)
        return this.firstName.compareTo(sp.firstName);
    }

    //-----------------------------------------------------------------
    // First name accessor.
    //-----------------------------------------------------------------
    public String getFirstName() {
        return firstName;
    }

    //-----------------------------------------------------------------
    // Last name accessor.
    //-----------------------------------------------------------------
    public String getLastName() {
        return lastName;
    }

    //-----------------------------------------------------------------
    // Total sales accessor.
    //-----------------------------------------------------------------
    public int getSales() {
        return totalSales;
    }
}