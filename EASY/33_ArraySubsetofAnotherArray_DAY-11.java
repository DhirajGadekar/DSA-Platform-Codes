/*
 * 33] Array Subset of another array
 */

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {

        Arrays.sort(a1);
        Arrays.sort(a2);
        int j = 0;
        for(int i = 0; i < n; i++) {

            if(j < m && a1[i] == a2[j]) {

                j++;
            }
        }
        if(m == j) return "Yes";
        else return "No";
    }
}
