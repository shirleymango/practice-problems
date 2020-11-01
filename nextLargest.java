import java.util.Arrays;
public class nextLargest
{
    public static long nextBiggerNumber(long n)
    {
      String str = "" + n; String ans = "";
    
    //find the smallest substring that is not in ascending order
    for (int m = 2; m <= str.length(); m++) {
      String strsub = str.substring(str.length()-m);
      //use function to sort it, then return the answer
      if (Integer.parseInt(subnextLargest(strsub)) != -1) {
        ans = str.substring(0, str.length()-m) + subnextLargest(strsub);
        long a = Long.parseLong(ans);
        return a;
      }
    }
    return -1;
    
  }
  
  private static String subnextLargest (String s) {
    int[] arr = new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
      arr[i] = Integer.parseInt("" + s.charAt(i));
    }
    int first = arr[0]; String ans = "";
    Arrays.sort(arr);
    //finding the smallest number that is less than the original
    int newFirst = Integer.MIN_VALUE; int Index = 0;
    for (int j = 0; j <s.length(); j++) {
      if ((arr[j] > first)) {
        newFirst = arr[j]; Index = j;
        break;
      }
    }
    ans = "" + newFirst;
    if (newFirst == Integer.MIN_VALUE) {
      return "-1";
    }
    else {
      for (int k = 0; k <s.length(); k++) {
        if (k != Index) {
          ans = ans + "" + arr[k];
        }
      }
      return ans;
    }
  }
}
