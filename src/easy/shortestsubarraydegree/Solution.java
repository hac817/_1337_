package easy.shortestsubarraydegree;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        Map<Integer, Integer> firstId = new HashMap<>();
        Map<Integer, Integer> lastIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!freqMap.containsKey(nums[i])) freqMap.put(nums[i], 0);
            if (!firstId.containsKey(nums[i])) firstId.put(nums[i], i);

            lastIdx.put(nums[i], i);

            freqMap.put(nums[i], freqMap.get(nums[i])+ 1);
        }

        int maxFrequency = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            maxFrequency = Math.max(maxFrequency, entry.getValue());
        }

        int shortestLength = nums.length;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                int key = entry.getKey();
                shortestLength = Math.min(shortestLength, lastIdx.get(key) - firstId.get(key) + 1);
            }
        }


        return shortestLength;
    }
}

