package easy.happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seenBefore = new HashSet<>();

        seenBefore.add(n);
        while (n != 1) {
            n = sumSquareDigits(n);
            if (seenBefore.contains(n)) return false;
            else seenBefore.add(n);
        }

        return true;
    }

    private int sumSquareDigits(int n) {
        int ans = 0;
        while (n > 0) {
            int digit = n%10;
            ans += digit * digit;

            n /= 10;
        }
        return ans;
    }

}