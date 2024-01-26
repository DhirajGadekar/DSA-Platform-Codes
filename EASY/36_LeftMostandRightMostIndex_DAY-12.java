/* *
 * 36] Left most and right most index
 */

/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {

    public pair indexes(long v[], long x) {

        pair p = new pair(-1, -1);

        for(int i = 0; i < v.length; i++) {

            if(v[i] == x) {

                p.first = i;
                break;
            }
        }
        for(int i = v.length - 1; i >= 0; i--) {

            if(v[i] == x) {

                p.second = i;
                break;
            }
        }
        return p;
    }
}
