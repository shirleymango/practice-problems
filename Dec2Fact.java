public class Dec2Fact {
  
  public static String dec2FactString(long nb) {
      String factorial = "";
      long[] arr = new long[36]; int start = 0;
    arr[0] = 0; arr[1] = 1;
    for (int i = 2; i < 21; i++) {
      arr[i] = arr[i-1]*i;
      if (Long.compare(nb, arr[i]) >= 0) {
        start = i;
      }
    }
    
    for (int j = start; j > 0; j--) {
      int digit = 0;
      long curr = arr[j];
      while (Long.compare(nb, curr) >= 0) {
        digit++;
        nb -= curr;
      }
      if (digit >= 10) {
        char c = (char) (digit + 55);
        factorial += c;
      }
      else {
        factorial += digit;
      }
    }
    factorial += "0";
      return factorial;
  }
  public static long factString2Dec(String str) {
    long[] arr = new long[36];
    arr[0] = 0; arr[1] = 1;
    for (int i = 2; i < 36; i++) {
      arr[i] = arr[i-1]*i;
    }
    
    int l = str.length()-1; long ans = 0;
    for (int i = l-1; i >= 0; i--) {
      int d = str.charAt(i); // need to consider ascii when converting char to integer
      if (d >= 48 & d <=57) {
        d -= 48;
      }
      else {
        d -= 55;
      }
      ans += arr[l-i]*d;
    }
    return ans;
  }
}
