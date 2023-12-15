package destinationcity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> outDegrees = new HashMap<String, Integer>();
        for (List<String> path : paths) {
            String src = path.get(0);
            String dest = path.get(1);
            if (!outDegrees.containsKey(src)) {
                outDegrees.put(src, 0);
            }
            outDegrees.put(src, outDegrees.get(src) + 1);

            if (!outDegrees.containsKey(dest)) {
                outDegrees.put(dest, 0);
            }
        }

        String ans = "";

        for(Map.Entry<String, Integer> keyValue : outDegrees.entrySet()) {
            if (keyValue.getValue() == 0) ans = keyValue.getKey();
        }

        return ans;
    }
}
