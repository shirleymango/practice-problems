import java.util.Arrays;

public class largestDifference {
    public static int largestDifference(int[] data) {

        int[][] arr = new int[data.length][2];
    
    for (int i = 0; i < data.length; i++) {
      arr[i][0] = data[i]; arr[i][1] = i;
    }
    
    Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0])); int ans = 0; 
    
    for (int a = 0; a < data.length-1; a++) {
      int num = arr[a][1]; int max = 0;
      for (int k = a+1; k < data.length; k++) {
        if ((arr[k][1] - num) > max) {
          max = arr[k][1] - num;
        }
      }
      if (max > ans) ans = max;
    }
    return ans;

    }
}
