/*
 * 16] Remove Duplicates from the Sorted Array
 */

class Solution {
    int remove_duplicate(int arr[],int N){

        if(N == 1) {

            return 1;
        }
        TreeSet<Integer> al = new TreeSet<Integer>();
        for(int i = 0; i < N; i++) {

            al.add(arr[i]);
            arr[i] = 0;
        }
        Iterator<Integer> it = al.iterator();
        int i = 0;
        while(it.hasNext()) {

            arr[i] = (int)it.next();
            i++;
        }
        return al.size();
    }
}
