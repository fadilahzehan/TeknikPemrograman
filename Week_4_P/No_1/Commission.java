package No_1;

// Commission.java
// Represents an hourly employee who also earns a commission on sales.

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Constructor: takes name, address, phone, socSecNumber, hourly pay rate,
    // and commission rate (as a decimal).
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commRate;
        totalSales = 0;
    }

    // Adds the specified sales amount to totalSales.
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Computes and returns pay: hourly wages (from super) plus commission.
    // Resets totalSales to zero afterwards.
    public double pay() {
        double hourlyPay = super.pay();          // gets wages and resets hoursWorked
        double commissionPay = totalSales * commissionRate;
        totalSales = 0;                           // reset sales for next pay period
        return hourlyPay + commissionPay;
    }

    // Returns a string representation including total sales.
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: $" + totalSales;
        return result;
    }
}