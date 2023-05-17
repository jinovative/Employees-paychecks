import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the PayCheck class.
 */
public class PayCheckTest {

  /**
   * Testing payCheckCal() method.
   */
  @Test
  public void testPayCheckCal() {
    PayCheck paycheck = new PayCheck("A", 7.0, 20.0);
    assertEquals(70, paycheck.getTotalPayCheck(), 0.0);

    paycheck = new PayCheck("B", 7.0, 20.0);
    assertEquals(70.0, paycheck.getTotalPayCheck(), 0.0);

    paycheck = new PayCheck("C", 50.0, 50.0);
    assertEquals(2500.0, paycheck.getTotalPayCheck(), 0.0);
  }

  /**
   * Testing when the rate is negative.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeRate() {
    new PayCheck("D", -7.0, 20.0);
  }

  /**
   * Testing when the hours worked is negative.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeHoursWorked() {
    new PayCheck("E", 7.0, -20.0);
  }

  /**
   * Testing when the hour worked is overed 168.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testOveredHoursWorked() {
    new PayCheck("F", 7.0, 169.0);
  }

  /**
   * Testing string type format.
   */
  @Test
  public void testToString() {
    PayCheck paycheck = new PayCheck("G", 7.0, 40.0);
    assertEquals("$280", paycheck.toString());

    paycheck = new PayCheck("H", 7.0, 45.0);
    assertEquals("$315", paycheck.toString());

    paycheck = new PayCheck("I", 17.0, 50.0);
    assertEquals("$850", paycheck.toString());
  }
}