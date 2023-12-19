package easy.containsduplicate_ii;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastSeenIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!lastSeenIdx.containsKey(nums[i]) ) {
                lastSeenIdx.put(nums[i], i);
            }
            else {
                if (i - lastSeenIdx.get(nums[i]) <= k) return true;
                else lastSeenIdx.put(nums[i], i);
            }

        }

        return false;
    }
}