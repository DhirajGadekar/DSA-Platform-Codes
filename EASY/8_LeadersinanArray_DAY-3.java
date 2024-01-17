/* *
 * 8] Leaders in an Array :
 */ 

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){

        int max = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = arr.length - 1; i >= 0; i--) {

            if(max <= arr[i]) {

                al.add(0, arr[i]);
                max = arr[i];
            }
        }
        return al;
    }
}
