/*
 * 6] Find the smallest and second smallest element in an array
 */

class Solution {

    public long[] minAnd2ndMin(long a[], long n)  {

        long[] arr = new long[]{-1, -1};
        if(n <= 1) {

            return arr;
        }
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        for(int i = 0; i < n;i++) {

            if(a[i] < min1) {

                min2 = min1;
                min1 = a[i];
            } else if(a[i] < min2 && min1 != a[i]) {

                min2 = a[i];
            }
        }
        if(min1 != Long.MAX_VALUE && min2 != Long.MAX_VALUE) {

            arr[0] = min1;
            arr[1] = min2;
        }
        return arr;
    }
}
