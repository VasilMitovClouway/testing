package suamtor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class SumatorTest {
  @Test
  public void stringsum() {
    Sumator sumator = new Sumator();
    assertEquals("3", sumator.sum("1", "2"));
  }

  @Test(expected = NumberFormatException.class)
  public void exception() {
    Sumator sumator = new Sumator();
    sumator.sum("1a2", "12");
  }

  @Test(expected = IllegalArgumentException.class)
  public void oneargumentisnull() {
    Sumator sumator = new Sumator();
    sumator.sum("", "1");
  }

  @Test
  public void integersum() {
    Sumator sumator = new Sumator();
    assertEquals(5, sumator.sum(3, 2), 0);
  }

  @Test
  public void doublesum() {
    Sumator sumator = new Sumator();
    assertEquals(2.2, sumator.sum(1.1, 1.1), 0);
  }
}