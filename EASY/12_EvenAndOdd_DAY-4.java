/*
 * 12] Even and Odd
 */

class Solution {
    static void reArrange(int[] arr, int N) {

        Stack<Integer> even = new Stack<Integer>();
        Stack<Integer> odd = new Stack<Integer>();
        for(int i = 0; i < N; i++) {

            if(arr[i] % 2 == 0) {

                even.add(arr[i]);
            } else {

                odd.add(arr[i]);
            }
        }
        for(int i = 0; i < N; i++) {

            if(i % 2 == 0) {

                arr[i] = even.pop();
            } else {

                arr[i] = odd.pop();
            }
        }
    }
}
