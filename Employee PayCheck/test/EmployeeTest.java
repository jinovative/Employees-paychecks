import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the Employee class.
 */
public class EmployeeTest {

  /**
   * Testing addHoursWorked() method.
   */
  @Test
  public void testAddHoursWorked() {
    Employee employee = new Employee("A", 7.0);
    employee.addHoursWorked(20.0);
    employee.addHoursWorked(10.0);

    assertEquals(30.0, employee.getHoursWorked(), 0.0);
  }

  /**
   * Testing resetHoursWorked() method.
   */
  @Test
  public void testResetHoursWorked() {
    Employee employee = new Employee("B", 7.0);
    employee.addHoursWorked(20.0);
    employee.resetHoursWorked();

    assertEquals(0.0, employee.getHoursWorked(), 0.0);
  }

  /**
   * Testing getWeeklyCheck() method.
   */
  @Test
  public void testGetWeeklyCheck() {
    Employee employee = new Employee("C", 7.0);
    employee.addHoursWorked(20.0);
    employee.addHoursWorked(15.0);

    PayCheck paycheck = employee.getWeeklyCheck();

    assertEquals("C", employee.getEmployeeName());
    assertEquals(7.0, employee.getPayRate(), 0.0);
    assertEquals(35.0, employee.getHoursWorked(), 0.0);
  }

  /**
   * Testing string type format.
   */
  @Test
  public void testToString() {
    Employee employee = new Employee("E", 7.0);
    assertEquals("E", employee.toString());
  }
}