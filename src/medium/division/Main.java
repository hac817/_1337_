package medium.division;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] dividends = new int[] {Integer.MAX_VALUE, 3, 67};
        int[] divisors = new int[] {-1, 47, 2};

        for (int i = 0; i < dividends.length; i++) {
            System.out.println(sol.divide(dividends[i],divisors[i]));
        }
    }
}
