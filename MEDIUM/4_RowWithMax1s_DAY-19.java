/* *
 * 4] Row with max 1s
 */

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int max = 0;
        int index = -1;
        for(int i = 0; i < n; i++) {

            int count = 0;
            for(int j = 0; j < m; j++) {

                if(arr[i][j] == 1) {

                    count++;
                }
            }
            if(max < count) {

                max = count;
                index = i;
            }
        }
        return index;
    }
}
