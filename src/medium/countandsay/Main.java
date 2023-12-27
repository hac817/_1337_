package medium.countandsay;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        for (int i = 1; i <= 30; i++) {
            System.out.println(sol.countAndSay(i));
        }
    }
}
