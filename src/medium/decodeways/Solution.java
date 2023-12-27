package medium.decodeways;

class Solution {
    public int numDecodings(String s) {
        // classic dynamic programming.
        /*
        * numDecodings (s) = numDecodings(s[0:-1] + 9) + numDecodings[0:-2] +
        */
        int n = s.length();
        int[] dp = new int[n];

        if (s.charAt(0) == '0') return 0;
        if (n == 1) return 1;
        dp[0] = 1;

        if (s.charAt(1) == '0') {
            if (s.charAt(0) != '1' && s.charAt(0) != '2') return 0;
            dp[1] = 1;
        }

        if (s.charAt(0) == '1') {
            dp[1] = 2;
        }
        else if (s.charAt(0) == '2' && s.charAt(1) <= '6') dp[1] = 2;
        else dp[1] = 1;

        for (int i = 2; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i-1) == '1' || s.charAt(i-1) == '2') dp[i] = dp[i-2];
                else return 0;
            }

            if (s.charAt(i-1) == '1') {
                dp[i] = dp[i-1] + 1;
            }
            else if (s.charAt(i-1) == '2' && s.charAt(i) <= '6') dp[i] = dp[i-1] + 1;
            else dp[i] = dp[i-1];
        }

        return dp[n-1];
    }
}
