package easy.containsduplicate_ii;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = new int[] {1,2,3,1,2,3};
        int k = 2;

        System.out.println(sol.containsNearbyDuplicate(nums, k));
    }
}
