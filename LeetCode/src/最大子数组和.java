public class 最大子数组和 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-1}));
    }
    static class Solution {
        public int maxSubArray(int[] nums) {
            int rst = 0, max = -Integer.MAX_VALUE;
            for (int num : nums) {
                rst += num;
                max = Math.max(rst, max);
                if (rst < 0) rst = 0;
            }
            return max;
        }
    }
}
