/**
 * CS 5004.
 * Lab 2-1(1).
 * JinYoung Park.
 * Employees and paychecks.
 */

public class Employee {
  private String employeeName;
  private double payRate;
  private double hoursWorked;


  /**
   * Constructs that name, pay rate and sets the instance values.
   * Hours initialize to zero (0) .
   *
   * @param employeeName name of Employee
   * @param payRate pay rate of Employee
   */
  Employee(String employeeName, double payRate) {
    this.employeeName = employeeName;
    this.payRate = payRate;
    this.hoursWorked = 0;
  }

  /**
   * Name of employee.
   *
   * @return the name of employee
   */
  public String getEmployeeName() {
    return employeeName;
  }

  /**
   * pay rate of employee.
   *
   * @return the pay rate of employee
   */
  public double getPayRate() {
    return payRate;
  }

  /**
   * Hours worked by employee.
   *
   * @return the hours worked by employee
   */
  public double getHoursWorked() {
    return hoursWorked;
  }

  /**
   * Sets name of the employee.
   *
   * @param employeeName name of the employee as String.
   */
  public void setName(String employeeName) {
    this.employeeName = employeeName;
  }

  /**
   * Sets pay rate of the employee.
   *
   * @param payRate pay rate of the employee as double
   */
  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }

  /**
   * Sets number of hours worked.
   *
   * @param hoursWorked hours worked by employee
   */
  public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  /**
   * Adds number of hours to total hours worked.
   *
   * @param hours number of hours to add
   * @throws IllegalArgumentException if the hours is negative
   */
  public void addHoursWorked(double hours) {
    if (hours < 0) {
      throw new IllegalArgumentException("Hours cannot be negative.");
    }
    setHoursWorked(getHoursWorked() + hours);
  }

  /**
   * Resets the hours worked to zero.
   */
  public void resetHoursWorked() {
    setHoursWorked(0);
  }

  /**
   * Initialized with the name, pay rate, and hours worked.
   *
   * @return a new employee's paycheck per week
   */
  public PayCheck getWeeklyCheck() {
    return new PayCheck(getEmployeeName(), getPayRate(), getHoursWorked());
  }

  /**
   * Returns the name of employee.
   *
   * @return the name of employee
   */
  public String toString() {
    return getEmployeeName();
  }
}


