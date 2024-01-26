/* *
 * 35] Product of maximum in first array and minimum in second
 */

class Solution{

    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n ; i++) {

            if(arr[i] > max) {

                max = arr[i];
            }
        }

        for(int i = 0; i < m; i++) {

            if(brr[i] < min) {

                min = brr[i];
            }
        }
        return max * min;
    }
}
