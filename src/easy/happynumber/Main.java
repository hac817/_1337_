package easy.happynumber;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        for (int i = 0; i < 100; i++) {
            System.out.println( i + " : " + sol.isHappy(i));
        }
    }
}
