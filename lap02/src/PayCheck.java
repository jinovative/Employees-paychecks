import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PayCheck {
  // A PayCheck constructor that takes the employee name, rate, and hours worked
  // as parameters and calculates (and stores) the total pay for the week.
  private String employeeName;
  private double rate;
  private double hoursWorked;
  private double totalPay;

  public PayCheck(String employeeName, double rate, double hoursWorked) {
    this.employeeName = employeeName;
    this.rate = rate;
    this.hoursWorked = hoursWorked;
    calcualtionPay();
  }

  public double getTotalPay() {
    return totalPay;
  }

  public void calcualtionPay() {

  }



  public String toString() {
    DecimalFormat decimalFormat = new DecimalFormat("$#.##");
    return decimalFormat.format(totalPay);


  }
}


// A toString method for BOTH classes, allowing Employee objects
// to be represented by the employee name, and PayCheck objects by the totalPay
// (in proper dollars/cents $xxx.yy format).
