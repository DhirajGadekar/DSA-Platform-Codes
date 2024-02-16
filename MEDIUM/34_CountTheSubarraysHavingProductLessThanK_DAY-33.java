/* *
 * 34] Count the subarrays having product less than k
 */

class Solution {

    public long countSubArrayProductLessThanK(long a[], int n, long k) {
        int l=0,r=0;
        long ans=0;
        long pro=a[0];
        while(r<n){
            if(pro<k){
                ans+=(r-l+1);
                r++;
                if(r<n) pro*=a[r];
            }
            else{
                pro/=a[l];
                if(l==r){
                    ++r;
                    if (r<n) pro*=a[r];
                }
                ++l;
            }
        }
        return ans;
    }
}

