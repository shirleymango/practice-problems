public class spiralizor {

    public static int[][] spiralize(int size) {
          int[][] arr = new int[size][size];
    
    //initializing the first 3 sides of the spiral
    for (int i = 0; i <= size - 1; i++) {
      arr[0][i] = 1;
    }
    for (int i = 1; i <= size - 1; i++) {
      arr[i][size - 1] = 1;
    }
    for (int i = 0; i <= size - 2; i++) {
      arr[size - 1][i] = 1;
    }
    
    //algorithm for the rest of the spiral
    boolean stop = false;
    int start = 0; int end = size - 1;
    while (!stop) {
      if ((end - 1) - (start + 2) < 0) {
        stop = true;
        break;
      }
      if ((end - 1) - (start + 2) == 0) {
        arr[end - 1][start] = 1;
        stop = true;
        break;
      }
      for (int i = start + 2; i <= end - 1; i++) {
        arr[i][start] = 1;
      }
      if ((end - 2) - (start + 1) < 0) {
        stop = true;
        break;
      }
      if ((end - 2) - (start + 1) == 0) {
        arr[start + 2][end - 2] = 1;
        stop = true;
        break;
      }
      for (int i = start + 1; i <= end - 2; i++) {
        arr[start + 2][i] = 1;
      }
      if ((end - 2) - (start + 3) < 0) {
        stop = true;
        break;
      }
      if ((end - 2) - (start + 3) == 0) {
        arr[end - 2][end - 2] = 1;
        stop = true;
        break;
      }
      for (int i = start + 3; i <= end - 2; i++) {
        arr[i][end - 2] = 1;
      }
      if ((end - 3) - (start + 2) < 0) {
        stop = true;
        break;
      }
      if ((end - 3) - (start + 2) == 0) {
        arr[end - 2][end - 3] = 1;
        stop = true;
        break;
      }
      for (int i = start + 2; i <= end - 3; i++) {
        arr[end - 2][i] = 1;
      }
      start += 2; end -= 2;
    }
        return arr;
    }

}
