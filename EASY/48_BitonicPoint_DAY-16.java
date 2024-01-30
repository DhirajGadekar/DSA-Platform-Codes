/* *
 * 48] Bitonic Point
 */

class Solution {
    int findMaximum(int[] arr, int n) {

        int start = 0;
        int end = n - 1;
        while(start <= end) {
            int mid = (start + end)/2;
            if((mid == 0 && arr[mid] > arr[mid + 1]) || (mid == n - 1 && arr[mid] >= arr[mid - 1]) || (arr[mid] >= arr[mid + 1] && arr[mid] >= arr[mid - 1])) {

                return arr[mid];
            }
            if(mid > 0 && arr[mid] < arr[mid - 1]) {

                end = mid - 1;
            }
            if(mid < n - 1 && arr[mid] < arr[mid + 1]) {

                start = mid + 1;
            }
        }
        return -1;
    }
}
