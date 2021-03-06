//Problem description is in README file
import java.math.BigInteger;
public class perimeterOfSquares {
  public static BigInteger perimeter(BigInteger n) {
    BigInteger sum = BigInteger.valueOf(2), a = BigInteger.ONE, b = BigInteger.ONE, c, i;
    
    for (i = BigInteger.valueOf(2); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE))
      {
         c = a.add(b);
         a = b;
         b = c;
         sum = sum.add(c);
      }
    return sum.multiply(BigInteger.valueOf(4));
    
  }
  
}
