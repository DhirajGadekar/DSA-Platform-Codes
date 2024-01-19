/*
 * 14] Equal Left and Right Subarray Sum
 */


class Solution{
	int equalSum(int [] A, int N) {
	    if(N == 1) {

            return 1;
        }
        int prefix[] = new int[N];
        int suffix[] = new int[N];
        prefix[0] = A[0];
        for(int i = 1; i < N; i++) {

            prefix[i] = prefix[i - 1] + A[i];
        }
        suffix[N-1] = A[N - 1];
        for(int i = N-2; i >= 0; i--) {

            suffix[i] = A[i] + suffix[i + 1];
        }
        if(suffix[1] == 0) {

            return 1;
        }
        for(int i = 1; i < N-1; i++) {
            if(prefix[i - 1] == suffix[i + 1]) {

                return i + 1;
            }
        }
        if(prefix[N-2] == 0) {

            return N;
        }
        return -1;
	}
}
