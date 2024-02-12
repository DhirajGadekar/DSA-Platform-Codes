/* *
 * 29] Rotate Image
 */

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];
        for (int j = 0; j < n; j++) {
            int k = 0;
            for (int i = n - 1; i >= 0; i--) {
                mat[j][k] = matrix[i][j];
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = mat[i][j];
            }
        }
    }
}
