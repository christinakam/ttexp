public class TTE {
  public static long[][] ttexp(int rows_, int cols_, long exp_) {
    long[][] array = new long[rows_][cols_];
    for (int row = 0; row < rows_; row++) {
      for (int col = 0; col < cols_; col++) {
        array[row][col] = (long)Math.pow((row * cols_ + col +1), exp_);
      }
    }
    return array;
  }
}
