/*
 * 30] Product array puzzle
 */

class Solution {

	public static long[] productExceptSelf(int nums[], int n)  {

        long result[] = new long[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        long suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
	}
}
