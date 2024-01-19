/*
 * 15] Equilibrium Point
 */

class Solution {

    public static int equilibriumPoint(long arr[], int n) {

       if(n == 1) {

            return 1;
        }
        long prefix[] = new long[n];
        long suffix[] = new long[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) {

            prefix[i] = prefix[i - 1] + arr[i];
        }
        suffix[n-1] = arr[n - 1];
        for(int i = n-2; i >= 0; i--) {

            suffix[i] = arr[i] + suffix[i + 1];
        }
        if(suffix[1] == 0) {

            return 1;
        }
        for(int i = 1; i < n-1; i++) {
            if(prefix[i - 1] == suffix[i + 1]) {

                return i + 1;
            }
        }
        if(prefix[n-2] == 0) {

            return n;
        }
        return -1;
    }
}
