import java.util.HashMap;

class Solution {
    public boolean isSubset(int[] a, int[] b){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                freqMap.put(num, freqMap.get(num) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
