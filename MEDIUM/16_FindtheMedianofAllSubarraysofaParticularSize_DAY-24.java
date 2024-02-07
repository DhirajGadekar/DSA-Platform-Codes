/* *
 * 16] Find the median of all subarrays of a particular size.
 */

import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class Solution {

  public static ArrayList < Double > findMedian(ArrayList < Integer > arr, int N, int M) {
    int count = N - M + 1;
    ArrayList<Double> result = new ArrayList<>()
    for (int i = 0; i < count; i++) {
      ArrayList<Integer> subArray = new ArrayList<>(arr.subList(i, i + M));
      Collections.sort(subArray);
      if (M % 2 == 0) {
          result.add((double) (subArray.get(M / 2 - 1) + subArray.get(M / 2)) / 2);
      } else {
          result.add((double) subArray.get(M / 2));
      }
    }
    return result;
  }
}
