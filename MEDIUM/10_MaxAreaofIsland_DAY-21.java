/* *
 * 10] Max Area of Island
 */

class Solution {
   int[][] di = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) max = Math.max(max, maxArea(grid, i, j));
            }
        }
        return max;
    }

    private int maxArea(int[][] g, int x, int y) {
        if (x < 0 || x >= g.length || y < 0 || y >= g[0].length || g[x][y] == 0) return 0;
        int res = 0;
        if (g[x][y] == 1) {
            g[x][y] = 0;
            res = 1;
            for (int[] d : di) {
                res += maxArea(g, x + d[0], y + d[1]);
            }
        }
        return res;
    }
}
