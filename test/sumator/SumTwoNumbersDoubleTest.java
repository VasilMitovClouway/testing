package sumator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class SumTwoNumbersDoubleTest {
  @Test
  public void happyPath() {
    Sumator sumator = new Sumator();
    assertEquals(2.2, sumator.sum(1.1, 1.1), 0);
  }

  @Test
  public void summingDoubleWithZero() throws Exception {
    Sumator sumator = new Sumator();
    assertEquals(1.1, sumator.sum(1.1, 0), 0);
  }

  @Test
  public void summingDoublePositiveWittNegative() throws Exception {
    Sumator sumator = new Sumator();
    assertEquals(-1.1, sumator.sum(1.1, -2.2), 0);
  }

  @Test
  public void summingDoubleNegativeWithNegative() throws Exception {
    Sumator sumator = new Sumator();
    assertEquals(-3.4, sumator.sum(-1.0, -2.4), 0);
  }

  @Test
  public void summingDoublesAndGettingAWholeNumber() throws Exception {
    Sumator sumator = new Sumator();
    assertEquals(1, sumator.sum(0.6, 0.4), 0);
  }
}

