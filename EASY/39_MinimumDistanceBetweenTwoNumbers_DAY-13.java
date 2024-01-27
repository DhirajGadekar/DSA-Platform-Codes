/* *
 * 39] Minimum distance between two numbers
 */

class Solution {
    int minDist(int a[], int n, int x, int y) {
         int minDistance = Integer.MAX_VALUE;
        int prevIndex = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == x || a[i] == y) {
                if (prevIndex != -1 && a[prevIndex] != a[i]) {
                    minDistance = Math.min(minDistance, i - prevIndex);
                }
                prevIndex = i;
            }
        }

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }
}
