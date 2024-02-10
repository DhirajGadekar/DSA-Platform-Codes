/* *
 * 22] K-th element of two Arrays
 */

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {

         ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            list.add(arr2[j]);
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}
