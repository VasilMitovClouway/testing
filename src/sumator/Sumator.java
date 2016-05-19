package sumator;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class Sumator {
  public String sum(String firstnumber, String secondnumber) {
    Integer i1= Integer.valueOf(firstnumber);
    Integer i2=Integer.valueOf(secondnumber);
    Integer sum=i1+i2;

    return sum.toString();
  }

  public Integer sum(int firstnumber, int secondnumber) {
    Integer suma=firstnumber+secondnumber;
    return suma;
  }

  public double sum(double firstnumber, double secondnumber) {
    double sum=firstnumber+secondnumber;
    return sum;
  }
}
