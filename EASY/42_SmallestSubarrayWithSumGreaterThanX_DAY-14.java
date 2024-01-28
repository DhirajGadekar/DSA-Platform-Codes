/* *
 * 42] Smallest subarray with sum greater than x
 */


class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {

        int start = 0, end = 0;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;

        while (end < n) {

            while (end < n && currentSum <= x) {
                currentSum += a[end];
                end++;
            }


            while (start < end && currentSum > x) {
                if (end - start < minLength) {
                    minLength = end - start;
                }
                currentSum -= a[start];
                start++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}
