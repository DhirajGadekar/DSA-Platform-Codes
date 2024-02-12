/* *
 * 26] Rotate Array
 */

 class Solution {
    public static void rev(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int d=nums.length-k;
        rev(nums,0,d-1);
        rev(nums,d,nums.length-1);
        rev(nums,0,nums.length-1);
        
    }
}
