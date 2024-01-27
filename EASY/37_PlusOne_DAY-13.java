/* *
 * 37] Plus One
 */

class Solution {
    public int[] plusOne(int[] digits) {

        int nums[];
        LinkedList<Integer> l = new LinkedList<>();
        int carry = 0;
        for(int i = digits.length - 1; i >= 0;i--) {

            int sum = 0;
            if(i == digits.length - 1) {

                sum = digits[i] + 1 + carry;
                l.addFirst(sum % 10);
                carry = sum / 10;
            } else {

                sum = digits[i] + carry;
                l.addFirst(sum % 10);
                carry = sum / 10;
            }
        }
        if(carry != 0) {

            l.addFirst(carry);
        }
        Iterator it = l.iterator();
        nums = new int[l.size()];
        int itr = 0;
        while(it.hasNext()){

            nums[itr] = (int)it.next();
            itr++;
        }
        return nums;
    }
}
