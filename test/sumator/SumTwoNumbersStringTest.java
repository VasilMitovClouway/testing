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

  @Test
  public void summingStringsNegativeWithPositive() throws Exception {
    Sumator sumator = new Sumator();
    assertEquals("2", sumator.sum("-1", "3"));
  }

  @Test
  public void summingStringsNegativeWithNegative() throws Exception {
    Sumator sumator = new Sumator();
    assertEquals("-4", sumator.sum("-1", "-3"));
  }

  @Test(expected = NumberFormatException.class)
  public void onePassedValueIsNotANumber() {
    Sumator sumator = new Sumator();
    sumator.sum("1a1", "12");
  }

  @Test(expected = IllegalArgumentException.class)
  public void onePassedValueIsEmpty() {
    Sumator sumator = new Sumator();
    sumator.sum("", "1");
  }
}