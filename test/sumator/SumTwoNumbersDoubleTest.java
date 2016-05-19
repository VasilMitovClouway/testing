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
}

