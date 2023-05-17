import java.text.DecimalFormat;

/**
 * CS 5004.
 * Lab 2-1(2).
 * JinYoung Park.
 * Employees and paychecks.
 */

public class PayCheck {
  private final double totalPayCheck;


  /**
   * Constructs takes the employee name, rate, and hours.
   * Calculates the total pay for the week.
   *
   * @param employeeName name of employee
   * @param rate pay rate for work
   * @param hoursWorked the number of hours worked
   * @throws IllegalArgumentException if the rate or hours worked are negative or exceed 168
   */
  PayCheck(String employeeName, double rate, double hoursWorked) {
    if (rate < 0) {
      throw new IllegalArgumentException("Pay rate can not be negative.");
    }
    if (hoursWorked < 0) {
      throw new IllegalArgumentException("Hours worked can not be negative.");
    }
    if (hoursWorked > 168) {
      throw new IllegalArgumentException("Week hours can not be overed 168.");
    }
    this.totalPayCheck = payCheckCal(rate, hoursWorked);
  }

  /**
   * Returns total pay for a week.
   *
   * @return total pay for a week
   */
  public double getTotalPayCheck() {
    return totalPayCheck;
  }

  /**
   * Calculates total pay for the week (rate * hoursWorked).
   * Hours more than 40 hours, paid at 1.5 times (40 * rate) +(overtime * rate * 1.5).
   *
   * @param rate pay rate for employee
   * @param hoursWorked number of hours worked
   * @return total pay for the week
   */
  public double payCheckCal(double rate, double hoursWorked) {
    double total;
    if (hoursWorked >= 40) {
      total = rate * hoursWorked;
    } else {
      double overtime = hoursWorked - 40;
      total = (40 * rate) + (overtime * rate * 1.5);
    }
    return total;
  }

  /**
   * A string paycheck formatted as currency.
   *
   * @return paycheck amount formatted as currency
   */
  public String toString() {
    DecimalFormat decimalFormat = new DecimalFormat("$#.##");
    return decimalFormat.format(getTotalPayCheck());
  }
}
