/* *
 * 14] Pairs of Songs With Total Durations Divisible by 60
 */

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count =0;
        for(int i=0;i<time.length;i++){
            if(time[i]>=60) time[i]%=60;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<time.length;i++){
            if(time[i]==0 && map.containsKey(time[i])){
                count+=map.get(time[i]);
            }
            if(map.containsKey(60-time[i])){
                count+=map.get(60-time[i]);
            }
            map.put(time[i],map.getOrDefault(time[i],0)+1);
        }
        return count;
    }
}
