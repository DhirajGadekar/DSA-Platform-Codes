/*
 * 24] Alternate positive and negative numbers
 */

class Solution {
    void rearrange(int arr[], int n) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i = 0; i < n; i++) {

            if(arr[i] >= 0) {

                pos.add(arr[i]);
            } else {

                neg.add(arr[i]);
            }
        }

        int itr1 = 0, itr2 = 0, itr3 = 0;
        while(itr1 < pos.size() && itr2 < neg.size() && itr3 < n) {

            if(itr3 % 2 == 0) {

                arr[itr3] = pos.get(itr1);
                itr1++;
            } else {

                arr[itr3] = neg.get(itr2);
                itr2++;
            }
            itr3++;
        }
        while(itr1 < pos.size() && itr3 < n) {

            arr[itr3] = pos.get(itr1);
            itr1++;
            itr3++;
        }
        while(itr2 < neg.size() && itr3 < n) {

            arr[itr3] = neg.get(itr2);
            itr2++;
            itr3++;
        }
    }
}
