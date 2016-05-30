package sumator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class SumTwoNumbersIntegerTest {
  @Test
  public void happyPath() {
    Sumator sumator = new Sumator();
    assertEquals(5, sumator.sum(3, 2), 0);
  }

  @Test
  public void summingIntegerWithZero() throws Exception {
    Sumator sumator = new Sumator();
    assertEquals(3, sumator.sum(3, 0), 0);
  }

  @Test
  public void summingIntegerNegativeWithNegative() throws Exception {
    Sumator sumator = new Sumator();
    assertEquals(-4, sumator.sum(-1, -3), 0);
  }

  @Test
  public void summingIntegerNegativeWithPositive() throws Exception {
    Sumator sumator = new Sumator();
    assertEquals(2, sumator.sum(-1, 3), 0);
  }
}
