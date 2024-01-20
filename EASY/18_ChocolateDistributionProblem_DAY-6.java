/*
 * 18] Chocolate Distribution problem
 */

class Solution {
    public long findMinDiff (ArrayList<Integer> a, int n, int m) {

        Collections.sort(a);
        if(n == m) {

            return a.get(m- 1) - a.get(0);
        }
        //System.out.println(a);
        int min = Integer.MAX_VALUE;
        int j = m - 1;
        for(int i = 0; i <= n - m; i++) {

            int p = a.get(i);
            int q = a.get(j);
            min = (min > (q - p)) ? (q - p) : min;
            j++;
        }
        return min;
    }
}
