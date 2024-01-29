/* *
 * 43] Pascal's Triangle
 */

class Solution {

    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> temp= new ArrayList<>();
            int result= 1;
            for(int j=0; j<=i; j++){
                temp.add(result);
                result= result*(i-j)/(j+1);
            }
            ans.add(temp);
        }
        return ans;
    }
}
