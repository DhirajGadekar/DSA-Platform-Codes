/*
 * 18] Check if Array Is Sorted and Rotated
 */

class Solution {
    public boolean check(int[] arr) {
        int count = 0;
        if(arr[0]-arr[arr.length-1]<0) { 
            count++;
	}
        for(int i = 1;i<arr.length;i++){
            if(arr[i]-arr[i-1]<0) {
		
		count++;
	    }
        }
        if(count > 1) {

            return false;
	} else { 
            
	    return true;
	}
    }
}
