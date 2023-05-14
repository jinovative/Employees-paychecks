public class Employee {
  private String name;
  private double hoursWorked;
  private double payRate;

  // An Employee constructor that takes a name and pay rate
  // as parameters and sets the instance values appropriately.
  // This constructor should also initialize the hours worked to zero (0) upon instantiation.

  public Employee(String name, double payRate) {
    this.name = name;
    this.payRate = payRate;
    this.hoursWorked = 0;
  }

  public void addHoursWorked(double hours) {
    // adds the value of that parameter
    // to the current number of hours the Employee has worked this week.
    hoursWorked += hours;
  }

  public void resetHoursWorked() {
    // resets the employee’s hours worked for the week to zero.
    this.hoursWorked = 0;
  }

  public PayCheck getWeeklyCheck() {
    // returns a new PayCheck object that is initialized to the current Employee name,
    // rate and hours worked.
    return new PayCheck(name, payRate, hoursWorked);
  }

  public String toString() {
    return name;
  }
}
