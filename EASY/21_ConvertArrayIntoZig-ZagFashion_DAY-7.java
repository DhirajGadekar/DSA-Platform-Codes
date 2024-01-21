/*
 * 21] Convert array into Zig-Zag fashion
 */

class Solution{
    public void zigZag(int a[], int n){

        Arrays.sort(a);
        for(int i = 1; i < n - 1; i+= 2) {

            if(!(a[i - 1] < a[i])) {

                int t = a[i];
                a[i] = a[i - 1];
                a[i - 1] = t;
            }
            if(!(a[i] > a[i + 1])) {

                int t = a[i];
                a[i] =a[i + 1];
                a[i + 1] = t;
            }
        }
    }
}
