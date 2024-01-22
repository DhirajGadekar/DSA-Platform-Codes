/*
 * 23] Element with left side smaller and right side greater
 */

class Compute {
    public int findElement(int arr[], int n){

        int leftMax[] = new int[n];
        int rightMin[] = new int[n];

        leftMax[0] = arr[0];
        rightMin[n-1] = arr[n-1];
        for(int i = 1; i < n; i++) {

            if(leftMax[i - 1] <= arr[i]) {

                leftMax[i] = arr[i];
            } else {

                leftMax[i] = leftMax[i - 1];
            }
        }
        for(int i = n - 2; i >= 0; i--) {

            if(rightMin[i + 1] >= arr[i]) {

                rightMin[i] = arr[i];
            } else {

                rightMin[i] = rightMin[i + 1];
            }
        }
        for(int i = 1; i < n-1; i++) {

            if(leftMax[i] == rightMin[i]) {

                return leftMax[i];
            }
        }
        return -1;
    }
}
