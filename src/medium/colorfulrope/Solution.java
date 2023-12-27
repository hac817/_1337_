package medium.colorfulrope;
/*
Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith
balloon.

Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob
for help. Bob can remove some balloons from the rope to make it colorful.You are given a 0-indexed integer array
neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.

Return the minimum time Bob needs to make the rope colorful.
 */
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int minTime = 0;
        char currCol = colors.charAt(0);
        int currColTime = neededTime[0];
        for (int i = 1; i < neededTime.length; i++) {
            if (colors.charAt(i) == currCol) {
                if (currColTime < neededTime[i]) {
                    minTime += currColTime;
                    currColTime = neededTime[i];
                }
                else {
                    minTime += neededTime[i];
                }
            }
            else {
                currCol = colors.charAt(i);
                currColTime = neededTime[i];
            }
        }

        return minTime;
    }
}