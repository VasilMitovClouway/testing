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
}
