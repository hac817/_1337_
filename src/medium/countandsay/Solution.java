package medium.countandsay;

class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        StringBuilder sb = new StringBuilder();
        int currCharCnt = 0;
        char currChar = ' ';
        for (char c : countAndSay(n - 1).toCharArray()) {
            if (c == currChar) currCharCnt++;
            else {
                if (currCharCnt > 0) {
                    sb.append(currCharCnt);
                    sb.append(currChar);
                }
                currChar = c;
                currCharCnt = 1;
            }
        }

        if (currCharCnt > 0) {
            sb.append(currCharCnt);
            sb.append(currChar);
        }


        return sb.toString();
    }
}
