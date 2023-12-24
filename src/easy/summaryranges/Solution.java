package easy.summaryranges;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> retList = new ArrayList<>();

        int n = nums.length;

        if (n == 0) return retList;
        //if (n == 1) {retList.add(nums[0]+""); return retList;}

        Integer startRange = nums[0];
        Integer endRange = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i-1] + 1) {
                if (endRange.equals(startRange)) retList.add(startRange.toString());
                else retList.add(startRange + "->" + endRange);

                startRange = nums[i];
                endRange = nums[i];
            }

            else {
                endRange = nums[i];
            }
        }

        if (endRange.equals(startRange)) retList.add(startRange.toString());
        else retList.add(startRange + "->" + endRange);

        return retList;
    }
}