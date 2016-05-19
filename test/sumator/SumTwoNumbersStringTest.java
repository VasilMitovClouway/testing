package sumator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class SumTwoNumbersStringTest {

  @Test
  public void happyPath() {
    Sumator sumator = new Sumator();
    assertEquals("3", sumator.sum("1", "2"));
  }

  @Test(expected = NumberFormatException.class)
  public void firstPassedValueIsNotANumber() {
    Sumator sumator = new Sumator();
    sumator.sum("1a2", "12");
  }

  @Test(expected = IllegalArgumentException.class)
  public void firstPassedValueIsEmpty() {
    Sumator sumator = new Sumator();
    sumator.sum("", "1");
  }
}